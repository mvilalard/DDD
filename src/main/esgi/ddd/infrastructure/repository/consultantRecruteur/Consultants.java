package main.esgi.ddd.infrastructure.repository.consultantRecruteur;

import main.esgi.ddd.common.entity.Entity;
import main.esgi.ddd.common.repository.BaseRepository;

import java.util.HashSet;

public class Consultants extends BaseRepository implements ConsultantsRecruteursRepository{

    public Consultants(HashSet<Entity> consultants) {
        super(consultants);
    }

    public Consultants() {
        this(new HashSet<Entity>());
    }
}
