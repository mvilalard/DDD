package main.esgi.ddd.model.salle;

import main.esgi.ddd.model.configurationSalle.ConfigurationSalle;

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
}
