package main.esgi.ddd.infrastructure.repository.entretien;

import main.esgi.ddd.common.entity.Entity;
import main.esgi.ddd.common.repository.BaseRepository;

import java.util.HashSet;

public class Entretiens extends BaseRepository implements EntretiensRepository {

    public Entretiens(HashSet<Entity> entretiens) {
        super(entretiens);
    }

    public Entretiens() {
        this(new HashSet<Entity>());
    }
}
