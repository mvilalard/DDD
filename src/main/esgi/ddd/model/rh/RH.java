package main.esgi.ddd.model.rh;

import main.esgi.ddd.common.entity.Entity;

import java.util.Objects;

public class RH extends Entity{

    private final String nom;

    private final String prenom;

    private final String mail;

    public RH(String nom, String prenom, String mail) {
        super(new RhID());
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
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
    public int hashCode() {
        return Objects.hash(nom, prenom, mail);
    }
}
