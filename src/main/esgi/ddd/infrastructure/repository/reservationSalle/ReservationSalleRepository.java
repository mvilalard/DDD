package main.esgi.ddd.infrastructure.repository.reservationSalle;

import main.esgi.ddd.common.entity.Entity;
import main.esgi.ddd.common.repository.BaseRepository;

import java.util.HashSet;

public class ReservationSalleRepository  extends BaseRepository {

    public ReservationSalleRepository(HashSet<Entity> reservations) {
        super(reservations);
    }

    public ReservationSalleRepository() {
        this(new HashSet<Entity>());
    }
}
