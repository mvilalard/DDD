package main.esgi.ddd.model.candidat;

import main.esgi.ddd.model.profil.Profil;

import java.util.Objects;

public class Candidat {

    private final CandidatID candidatID;

    private final String prenom;

    private final String nom;

    private final int age;

    private final String mail;

    private final Profil profil;

    public Candidat(String prenom, String nom, int age, String mail, Profil profil) {
        this.candidatID = new CandidatID();
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.mail = mail;
        this.profil = profil;
    }

    public CandidatID getCandidatID() {
        return candidatID;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Candidat candidat = (Candidat) o;
        return candidatID.equals(candidat.candidatID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(candidatID);
    }
}
