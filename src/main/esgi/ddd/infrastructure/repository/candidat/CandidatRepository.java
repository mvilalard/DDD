package main.esgi.ddd.infrastructure.repository.candidat;

import main.esgi.ddd.common.entity.Entity;
import main.esgi.ddd.common.repository.BaseRepository;

import java.util.HashSet;

public class CandidatRepository extends BaseRepository {

    public CandidatRepository(HashSet<Entity> candidats) {
        super(candidats);
    }

    public CandidatRepository() {
        this(new HashSet<Entity>());
    }
}
