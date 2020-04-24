package main.esgi.ddd.infrastructure.repository.consultantRecruteur;

import main.esgi.ddd.common.entity.Entity;
import main.esgi.ddd.common.repository.BaseRepository;

import java.util.HashSet;

public class ConsultantRecruteurRepository extends BaseRepository{

    public ConsultantRecruteurRepository(HashSet<Entity> consultants) {
        super(consultants);
    }

    public ConsultantRecruteurRepository() {
        this(new HashSet<Entity>());
    }
}
