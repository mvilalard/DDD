package main.esgi.ddd.use_case.entretien;

import main.esgi.ddd.infrastructure.repository.consultantRecruteur.Consultants;
import main.esgi.ddd.infrastructure.repository.consultantRecruteur.ConsultantsRecruteursRepository;
import main.esgi.ddd.infrastructure.repository.entretien.Entretiens;
import main.esgi.ddd.infrastructure.repository.entretien.EntretiensRepository;
import main.esgi.ddd.infrastructure.repository.salle.Salles;
import main.esgi.ddd.infrastructure.repository.salle.SallesRepository;
import main.esgi.ddd.model.consultantRecruteur.ConsultantRecruteur;
import main.esgi.ddd.model.entretien.Entretien;
import main.esgi.ddd.model.entretien.EntretienID;
import main.esgi.ddd.model.salle.Salle;

public class AnnulerEntretien {

    private final EntretiensRepository entretiens;

    private final SallesRepository salles;

    private ConsultantsRecruteursRepository consultants;

    public AnnulerEntretien(Entretiens entretiens, Salles salles,
                              Consultants consultants) {
        this.entretiens = entretiens;
        this.salles = salles;
        this.consultants = consultants;
    }

    public void confirmer(EntretienID identifiant) {
        Entretien entretien = (Entretien) entretiens.getEntity(identifiant);
        entretien.annuler();
        ((Salle) salles.getEntity(entretien.getSalleID()))
                .annulerReservationSalle(entretien.getCreneau().getDate().toLocalDate());
        ((ConsultantRecruteur) consultants.getEntity(entretien.getConsultantRecruteurID()))
                .annulerReservationDate(entretien.getCreneau().getDate().toLocalDate());
    }
}
