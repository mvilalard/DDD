package main.esgi.ddd.model.rh;

import java.util.Objects;

public class RH {

    private final RhID rhID;

    private final String nom;

    private final String prenom;

    private final String mail;

    public RH(String nom, String prenom, String mail) {
        this.rhID = new RhID();
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
    }

    public RhID getRhID() {
        return rhID;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        RH RH = (RH) o;
        return rhID.equals(RH.rhID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rhID);
    }
}
