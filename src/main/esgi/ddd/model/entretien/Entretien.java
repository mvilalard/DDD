package main.esgi.ddd.model.entretien;

import main.esgi.ddd.common.entity.Entity;
import main.esgi.ddd.exceptions.entretien.ConsultantRecruteurIndefinieException;
import main.esgi.ddd.exceptions.entretien.EntretienNonConfirmeException;
import main.esgi.ddd.exceptions.entretien.ReservationSalleIndefinieException;
import main.esgi.ddd.model.candidat.CandidatID;
import main.esgi.ddd.model.consultantRecruteur.ConsultantRecruteurID;
import main.esgi.ddd.model.creneau.Creneau;
import main.esgi.ddd.model.reservationSalle.ReservationSalleID;

import java.util.Objects;

public class Entretien extends Entity {
    
    enum STATUT {
        CREE,
        CONFIRME,
        ANNULE,
        ENCOURS;
    }
    private STATUT statut;

    private final Creneau creneau;

    private ReservationSalleID reservationSalleID ;

    private CandidatID candidatID;

    private ConsultantRecruteurID consultantRecruteurID;

    public Entretien(Creneau creneau, CandidatID candidatID) {
        super(new EntretienID());
        this.statut = STATUT.CREE;
        this.creneau = creneau;
        this.reservationSalleID = null;
        this.candidatID = candidatID;
        this.consultantRecruteurID = null;
    }

    public void confirmer()
    {
        if (this.reservationSalleID == null) {
            throw new ReservationSalleIndefinieException();
        }
        if (this.consultantRecruteurID == null) {
            throw new ConsultantRecruteurIndefinieException();
        }
        if (this.candidatID == null) {
            throw new ConsultantRecruteurIndefinieException();
        }
        this.statut = STATUT.CONFIRME;
    }

    public void commencer()
    {
        if(this.statut != STATUT.CONFIRME) {
            throw new EntretienNonConfirmeException();
        }
        this.statut = STATUT.ENCOURS;
    }

    public void annuler(String raison)
    {
        if(this.statut != STATUT.CONFIRME) {
            throw new EntretienNonConfirmeException();
        }
        this.statut = STATUT.ANNULE;
    }

    public STATUT getStatut() {
        return statut;
    }

    public Creneau getCreneau() {
        return creneau;
    }

    public ReservationSalleID getReservationSalleID() {
        return reservationSalleID;
    }

    public void setReservationSalleID(ReservationSalleID reservationSalleID) {
        this.reservationSalleID = reservationSalleID;
    }

    public CandidatID getCandidatID() {
        return candidatID;
    }

    public void setCandidatID(CandidatID candidatID) {
        this.candidatID = candidatID;
    }

    public ConsultantRecruteurID getConsultantRecruteurID() {
        return consultantRecruteurID;
    }

    public void setConsultantRecruteurID(ConsultantRecruteurID consultantRecruteurID) {
        this.consultantRecruteurID = consultantRecruteurID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(statut, creneau, reservationSalleID, candidatID, consultantRecruteurID);
    }
}
