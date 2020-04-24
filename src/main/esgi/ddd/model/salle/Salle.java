package main.esgi.ddd.model.salle;

import main.esgi.ddd.common.entity.Entity;
import main.esgi.ddd.common.valueObjectId.ValueObjectId;
import main.esgi.ddd.model.configurationSalle.ConfigurationSalle;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;

public class Salle extends Entity {

    private final String nom;

    private final ConfigurationSalle configurationSalle;

    private final HashSet<LocalDate> disponibilites;

    public Salle(String nom, ConfigurationSalle configurationSalle, HashSet<LocalDate> disponibilites) {
        super(new SalleID());
        this.nom = nom;
        this.configurationSalle = configurationSalle;
        this.disponibilites = disponibilites;
    }

    public String getNom() {
        return nom;
    }

    public ConfigurationSalle getConfigurationSalle() {
        return configurationSalle;
    }

    public HashSet<LocalDate> getDisponibilites() {
        return disponibilites;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), nom);
    }
}
