package main.esgi.ddd.infrastructure.repository.candidat;

import main.esgi.ddd.common.entity.Entity;
import main.esgi.ddd.common.repository.BaseRepository;

import java.util.HashSet;

public class Candidats extends BaseRepository implements CandidatsRepository {

    public Candidats(HashSet<Entity> candidats) {
        super(candidats);
    }

    public Candidats() {
        this(new HashSet<Entity>());
    }
}
