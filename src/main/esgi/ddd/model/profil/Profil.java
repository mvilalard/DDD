package main.esgi.ddd.model.profil;

import main.esgi.ddd.model.creneau.ProfilID;

import java.util.HashSet;
import java.util.Objects;

public class Profil {

    private final ProfilID profilID;

    private final int anneesXP;

    private final HashSet<String> specialites;

    private final HashSet<String> technosMaitrisees;

    private final HashSet<String> softSkills;

    public Profil(int anneesXP, HashSet<String> specialites, HashSet<String> technosMaitrisees, HashSet<String> softSkills) {
        this.profilID = new ProfilID();
        this.anneesXP = anneesXP;
        this.specialites = specialites;
        this.technosMaitrisees = technosMaitrisees;
        this.softSkills = softSkills;
    }

    public Profil(int anneesXP) {
        this(anneesXP, new HashSet<>(), new HashSet<>(), new HashSet<>());
    }

    public ProfilID getProfilID() {
        return profilID;
    }

    public int getAnneesXP() {
        return anneesXP;
    }

    public HashSet<String> getSpecialites() {
        return specialites;
    }

    public HashSet<String> getTechnosMaitrisees() {
        return technosMaitrisees;
    }

    public HashSet<String> getSoftSkills() {
        return softSkills;
    }

    public void addSpecialite(String specialite) {
        this.specialites.add(specialite);
    }

    public void addTechnoMaintrisee(String technoMaintrisee) {
        this.technosMaitrisees.add(technoMaintrisee);
    }

    public void addSoftSkill(String softSkill) {
        this.softSkills.add(softSkill);
    }

    public void removeSpecialite(String specialite) {
        this.specialites.remove(specialite);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Profil profil = (Profil) o;
        return profilID.equals(profil.profilID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(profilID);
    }
}
