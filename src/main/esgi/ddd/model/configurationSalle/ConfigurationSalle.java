package main.esgi.ddd.model.configurationSalle;

import java.util.ArrayList;

public class ConfigurationSalle {

    private final int places;

    private final ArrayList<String> materiel;

    public ConfigurationSalle(int places, ArrayList<String> materiel) {
        this.places = places;
        this.materiel = materiel;
    }

    public int getPlaces() {
        return places;
    }

    public ArrayList<String> getMateriel() {
        return materiel;
    }
}
