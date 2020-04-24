package main.esgi.ddd.infrastructure.repository.reservationSalle;

import main.esgi.ddd.common.entity.Entity;
import main.esgi.ddd.common.repository.BaseRepository;

import java.util.HashSet;

public class Salles extends BaseRepository implements SalleRepository {

    public Salles(HashSet<Entity> reservations) {
        super(reservations);
    }

    public Salles() {
        this(new HashSet<Entity>());
    }
}
