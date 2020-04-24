package main.esgi.ddd.use_case.entretien;

import main.esgi.ddd.common.entity.Entity;
import main.esgi.ddd.infrastructure.repository.candidat.Candidats;
import main.esgi.ddd.infrastructure.repository.candidat.CandidatsRepository;
import main.esgi.ddd.infrastructure.repository.consultantRecruteur.Consultants;
import main.esgi.ddd.infrastructure.repository.consultantRecruteur.ConsultantsRecruteursRepository;
import main.esgi.ddd.infrastructure.repository.entretien.Entretiens;
import main.esgi.ddd.infrastructure.repository.entretien.EntretiensRepository;
import main.esgi.ddd.infrastructure.repository.reservationSalle.SalleRepository;
import main.esgi.ddd.infrastructure.repository.reservationSalle.Salles;
import main.esgi.ddd.model.candidat.Candidat;
import main.esgi.ddd.model.candidat.CandidatID;
import main.esgi.ddd.model.consultantRecruteur.ConsultantRecruteur;
import main.esgi.ddd.model.consultantRecruteur.ConsultantRecruteurID;
import main.esgi.ddd.model.entretien.Creneau;
import main.esgi.ddd.model.entretien.Entretien;
import main.esgi.ddd.model.salle.Salle;
import main.esgi.ddd.model.salle.SalleID;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;

public class PlanifierEntretien {

    private CandidatsRepository candidats;

    private ConsultantsRecruteursRepository consultants;

    private SalleRepository salles;

    private EntretiensRepository entretiens;

    public PlanifierEntretien(Candidats candidats,
                              Consultants consultants,
                              Salles salles,
                              Entretiens entretiens) {
        this.candidats = candidats;
        this.consultants = consultants;
        this.salles = salles;
        this.entretiens = entretiens;
    }

    public void planifier(CandidatID candidatID, LocalDate jourEntretien) {
        // candidat
        Candidat candidat = (Candidat) candidats.getEntity(candidatID);

        // recruteur dispo
        HashSet<ConsultantRecruteur> consultantsDisponibles = new HashSet<>();
        for (Entity entity : consultants.getEntities()) {
            ConsultantRecruteur recruteur = (ConsultantRecruteur) entity;
            if(recruteur.estDisponible(jourEntretien)) {
                consultantsDisponibles.add(recruteur);
            }
        }
        ConsultantRecruteur recruteurChoisi = consultantsDisponibles.stream()
                .filter(consultant -> candidat.canBeTested(consultant)).findFirst().get();

        // creneau de l'entretient
        LocalDateTime dateCreneau = LocalDateTime.of(jourEntretien.getYear(),
                jourEntretien.getMonth(), jourEntretien.getDayOfMonth(),
                18, 00, 00);
        Creneau creneauEntretien = new Creneau(dateCreneau, 120);

        // salle dispo
        HashSet<Salle> sallesDisponibles = new HashSet<>();
        for (Entity entity : salles.getEntities()) {
            Salle salle = (Salle) entity;
            if(salle.estDisponible(jourEntretien)) {
                sallesDisponibles.add(salle);
            }
        }
        Salle salleChoisi = sallesDisponibles.stream().findFirst().get();

        Entretien nouvelEntretien = new Entretien(creneauEntretien, candidatID);
        nouvelEntretien.setConsultantRecruteurID((ConsultantRecruteurID) recruteurChoisi.getId());
        nouvelEntretien.setSalleID((SalleID) salleChoisi.getId());
        entretiens.add(nouvelEntretien);
    }
}
