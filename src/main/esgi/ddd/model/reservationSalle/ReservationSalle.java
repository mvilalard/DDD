package main.esgi.ddd.model.reservationSalle;

import main.esgi.ddd.model.salle.SalleID;

import java.util.Objects;

public class ReservationSalle {

    private final ReservationSalleID reservationSalleID;

    private SalleID salleID;

    public ReservationSalle(SalleID salleID) {
        this.reservationSalleID = new ReservationSalleID();
        this.salleID = salleID;
    }

    public ReservationSalle() {
        this(null);
    }

    public ReservationSalleID getReservationSalleID() {
        return reservationSalleID;
    }

    public SalleID getSalleID() {
        return salleID;
    }

    public void setSalleID(SalleID salleID) {
        this.salleID = salleID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservationSalle that = (ReservationSalle) o;
        return reservationSalleID.equals(that.reservationSalleID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reservationSalleID);
    }
}
