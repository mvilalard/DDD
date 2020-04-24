package main.esgi.ddd.model.salle;

import main.esgi.ddd.common.entity.Entity;
import main.esgi.ddd.common.valueObjectId.ValueObjectId;
import main.esgi.ddd.model.configurationSalle.ConfigurationSalle;

import java.util.Objects;

public class Salle extends Entity {

    private final SalleID salleID;

    private final String nom;

    private final ConfigurationSalle configurationSalle;

    public Salle(String nom, ConfigurationSalle configurationSalle) {
        super(new SalleID());
        this.salleID = new SalleID();
        this.nom = nom;
        this.configurationSalle = configurationSalle;
    }

    public String getNom() {
        return nom;
    }

    public ConfigurationSalle getConfigurationSalle() {
        return configurationSalle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(salleID, nom);
    }
}
