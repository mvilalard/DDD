package main.esgi.ddd.model.salle;

import main.esgi.ddd.model.configurationSalle.ConfigurationSalle;

import java.util.Objects;

public class Salle {

    private final SalleID salleID;

    private final String nom;

    private final ConfigurationSalle configurationSalle;

    public Salle(String nom, ConfigurationSalle configurationSalle) {
        this.salleID = new SalleID();
        this.nom = nom;
        this.configurationSalle = configurationSalle;
    }

    public SalleID getSalleID() {
        return salleID;
    }

    public String getNom() {
        return nom;
    }

    public ConfigurationSalle getConfigurationSalle() {
        return configurationSalle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salle salle = (Salle) o;
        return salleID.equals(salle.salleID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salleID);
    }
}
