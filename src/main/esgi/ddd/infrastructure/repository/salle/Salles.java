package main.esgi.ddd.infrastructure.repository.salle;

import main.esgi.ddd.common.entity.Entity;
import main.esgi.ddd.common.repository.BaseRepository;

import java.util.HashSet;

public class Salles extends BaseRepository implements SallesRepository {

    public Salles(HashSet<Entity> salles) {
        super(salles);
    }

    public Salles() {
        this(new HashSet<Entity>());
    }
}
