package main.esgi.ddd.model.consultantRecruteur;

import main.esgi.ddd.common.entity.Entity;
import main.esgi.ddd.model.entretien.Entretien;

import java.util.Objects;

public class ConsultantRecruteur extends Entity {

    private final String nom;

    private final String prenom;

    private final String mail;

    private int anneesXP;

    public ConsultantRecruteur(String nom, String prenom, String mail, int anneesXP) {
        super(new ConsultantRecruteurID());
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.anneesXP = anneesXP;
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

    public void participerEntretien(Entretien entretien) {
        entretien.setConsultantRecruteurID((ConsultantRecruteurID) this.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, mail, anneesXP);
    }
}
