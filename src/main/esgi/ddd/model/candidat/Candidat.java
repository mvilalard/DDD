package main.esgi.ddd.model.candidat;

import main.esgi.ddd.common.entity.Entity;
import main.esgi.ddd.model.consultantRecruteur.ConsultantRecruteur;
import main.esgi.ddd.model.profil.Profil;

import java.time.LocalDate;
import java.util.Objects;

public class Candidat extends Entity {

    private final String prenom;

    private final String nom;

    private final int age;

    private final String mail;

    private final Profil profil;

    private final LocalDate disponibilite;

    private final int anneesXp;

    public Candidat(String prenom, String nom, int age, String mail,
                    Profil profil, LocalDate disponibilite,
                    int anneesXp) {
        super(new CandidatID());
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.mail = mail;
        this.profil = profil;
        this.disponibilite = disponibilite;
        this.anneesXp = anneesXp;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public String getMail() {
        return mail;
    }

    public Profil getProfil() {
        return profil;
    }

    public LocalDate getDisponibilite() {
        return disponibilite;
    }

    public int getAnneesXp() {
        return anneesXp;
    }

    public boolean canBeTested(ConsultantRecruteur recruteur) {
        return recruteur.getTechnosMaitrisees().containsAll(this.profil.getTechnosMaitrisees())
                && recruteur.getAnneesXP() > this.anneesXp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(prenom, nom, age, mail, profil);
    }
}
