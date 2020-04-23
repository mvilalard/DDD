package main.esgi.ddd.model.entretien;

import main.esgi.ddd.model.creneau.Creneau;

import java.util.Objects;

public class Entretien {
    
    enum STATUT {
        CREE,
        CONFIRME,
        ANNULE,
        ENCOURS;
    }

    private final EntretienID entretienID;

    private STATUT statut;

    private final Creneau creneau;

    private final String recruteur;

    private final String candidat;

    public Entretien(Creneau creneau, String recruteur, String candidat) {
        this.entretienID = new EntretienID();
        this.statut = STATUT.CREE;
        this.creneau = creneau;
        this.recruteur = recruteur;
        this.candidat = candidat;
    }

    public void confirmer()
    {
        this.statut = STATUT.CONFIRME;
    }

    public void annuler(String raison)
    {
        this.statut = STATUT.ANNULE;
    }

    public EntretienID getEntretienID() {
        return entretienID;
    }

    public STATUT getStatut() {
        return statut;
    }

    public Creneau getCreneau() {
        return creneau;
    }

    public String getRecruteur() {
        return recruteur;
    }

    public String getCandidat() {
        return candidat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Entretien entretien = (Entretien) o;
        return entretienID.equals(entretien.entretienID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entretienID);
    }
}
