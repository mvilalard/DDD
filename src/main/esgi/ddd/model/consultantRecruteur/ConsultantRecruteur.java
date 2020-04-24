package main.esgi.ddd.model.consultantRecruteur;

import java.util.Objects;

public class ConsultantRecruteur {

    private final ConsultantRecruteurID consultantRecruteurID;

    private final String nom;

    private final String prenom;

    private final String mail;

    private int anneesXP;

    public ConsultantRecruteur(String nom, String prenom, String mail, int anneesXP) {
        this.consultantRecruteurID = new ConsultantRecruteurID();
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.anneesXP = anneesXP;
    }

    public ConsultantRecruteurID getConsultantRecruteurID() {
        return consultantRecruteurID;
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

    public int getAnneesXP() {
        return anneesXP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ConsultantRecruteur consultantRecruteur = (ConsultantRecruteur) o;
        return consultantRecruteurID.equals(consultantRecruteur.consultantRecruteurID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consultantRecruteurID);
    }
}
