package main.esgi.ddd.model.profil;

import main.esgi.ddd.common.entity.Entity;

import java.util.HashSet;
import java.util.Objects;

public class Profil extends Entity {
    private final int anneesXP;

    private final HashSet<String> specialites;

    private final HashSet<String> technosMaitrisees;

    private final HashSet<String> softSkills;

    public Profil(int anneesXP, HashSet<String> specialites,
                  HashSet<String> technosMaitrisees, HashSet<String> softSkills) {
        super(new ProfilID());
        this.anneesXP = anneesXP;
        this.specialites = specialites;
        this.technosMaitrisees = technosMaitrisees;
        this.softSkills = softSkills;
    }

    public Profil(int anneesXP) {
        this(anneesXP, new HashSet<>(), new HashSet<>(), new HashSet<>());
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
    public int hashCode() {
        return Objects.hash(anneesXP, specialites, technosMaitrisees, softSkills);
    }
}
