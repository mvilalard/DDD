package main.esgi.ddd.exceptions.entretien;

public class ReservationSalleIndefinieException  extends RuntimeException {

    public ReservationSalleIndefinieException() {
        super("La réservation de la salle n'a pas été définie !");
    }
}
