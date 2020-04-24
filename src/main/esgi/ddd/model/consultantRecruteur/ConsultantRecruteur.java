package main.esgi.ddd.model.consultantRecruteur;

import main.esgi.ddd.common.entity.Entity;
import main.esgi.ddd.model.entretien.Entretien;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;

public class ConsultantRecruteur extends Entity {

    private final String nom;

    private final String prenom;

    private final String mail;

    private int anneesXP;

    private final HashSet<String> technosMaitrisees;

    private final HashSet<LocalDate> disponibilites;

    public ConsultantRecruteur(String nom, String prenom, String mail, int anneesXP,
                               HashSet<String> technosMaitrisees,
                               HashSet<LocalDate> disponibilites) {
        super(new ConsultantRecruteurID());
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.anneesXP = anneesXP;
        this.technosMaitrisees = technosMaitrisees;
        this.disponibilites = disponibilites;
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

    public HashSet<LocalDate> getDisponibilites() {
        return disponibilites;
    }

    public void participerEntretien(Entretien entretien) {
        entretien.setConsultantRecruteurID((ConsultantRecruteurID) this.getId());
    }

    public boolean estDisponible(LocalDate jourDemande) {
        for (LocalDate disponibilite : disponibilites) {
            if(disponibilite.getYear() == jourDemande.getYear()
                && disponibilite.getMonth() == jourDemande.getMonth()
                && disponibilite.getDayOfWeek() == jourDemande.getDayOfWeek()) {
                return true;
            }
        }
        return false;
    }

    public HashSet<String> getTechnosMaitrisees() {
        return technosMaitrisees;
    }

    public void reserverDate(LocalDate dateCreneau) {
        this.disponibilites.remove(dateCreneau);
    }

    public void annulerReservationDate(LocalDate dateCreneau) {
        this.disponibilites.add(dateCreneau);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, mail, anneesXP);
    }
}
