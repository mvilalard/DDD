package main.esgi.ddd.infrastructure.repository.entretien;

import main.esgi.ddd.common.entity.Entity;
import main.esgi.ddd.common.repository.BaseRepository;

import java.util.HashSet;

public class EntretienRepository extends BaseRepository {

    public EntretienRepository(HashSet<Entity> entretiens) {
        super(entretiens);
    }

    public EntretienRepository() {
        this(new HashSet<Entity>());
    }
}
