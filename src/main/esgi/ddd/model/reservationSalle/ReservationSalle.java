package main.esgi.ddd.model.reservationSalle;

import main.esgi.ddd.common.entity.Entity;
import main.esgi.ddd.model.salle.SalleID;

import java.util.Objects;

public class ReservationSalle extends Entity{

    private SalleID salleID;

    public ReservationSalle(SalleID salleID) {
        super(new ReservationSalleID());
        this.salleID = salleID;
    }

    public ReservationSalle() {
        this(null);
    }

    public SalleID getSalleID() {
        return salleID;
    }

    public void setSalleID(SalleID salleID) {
        this.salleID = salleID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(salleID);
    }
}
