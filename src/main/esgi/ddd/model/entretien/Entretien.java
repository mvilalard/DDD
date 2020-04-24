package main.esgi.ddd.model.entretien;

import main.esgi.ddd.common.entity.Entity;
import main.esgi.ddd.exceptions.entretien.ConsultantRecruteurIndefinieException;
import main.esgi.ddd.exceptions.entretien.EntretienNonConfirmeException;
import main.esgi.ddd.exceptions.entretien.ReservationSalleIndefinieException;
import main.esgi.ddd.model.candidat.CandidatID;
import main.esgi.ddd.model.consultantRecruteur.ConsultantRecruteurID;
import main.esgi.ddd.model.salle.SalleID;

import java.util.Objects;

public class Entretien extends Entity {
    
    enum STATUT {
        CREE,
        CONFIRME,
        PLANIFIE,
        ANNULE,
        ENCOURS;
    }
    private STATUT statut;

    private final Creneau creneau;

    private SalleID salleID ;

    private CandidatID candidatID;

    private ConsultantRecruteurID consultantRecruteurID;

    public Entretien(Creneau creneau, CandidatID candidatID) {
        super(new EntretienID());
        this.statut = STATUT.CREE;
        this.creneau = creneau;
        this.salleID = null;
        this.candidatID = candidatID;
        this.consultantRecruteurID = null;
    }

    public void confirmer()
    {
        if (this.salleID == null) {
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

    public void annuler()
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

    public SalleID getSalleID() {
        return salleID;
    }

    public void setSalleID(SalleID reservationSalleID) {
        this.salleID = reservationSalleID;
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

    public void plannifier() {
        this.statut = STATUT.PLANIFIE;
    }

    @Override
    public int hashCode() {
        return Objects.hash(statut, creneau, salleID, candidatID, consultantRecruteurID);
    }
}
