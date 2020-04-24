package main.esgi.ddd.use_case.entretien;

import main.esgi.ddd.infrastructure.repository.candidat.CandidatRepository;
import main.esgi.ddd.infrastructure.repository.consultantRecruteur.ConsultantRecruteurRepository;
import main.esgi.ddd.infrastructure.repository.reservationSalle.ReservationSalleRepository;
import main.esgi.ddd.model.entretien.Entretien;

public class PlanifierEntretien {

    private CandidatRepository candidats;

    private ConsultantRecruteurRepository consultants;

    private ReservationSalleRepository reservations;

    public PlanifierEntretien(CandidatRepository candidats,
                              ConsultantRecruteurRepository consultants,
                              ReservationSalleRepository reservations) {
        this.candidats = candidats;
        this.consultants = consultants;
        this.reservations = reservations;
    }

    public Entretien planifier() {
        return null;
    }
}
