package main.esgi.ddd.infrastructure.repository.reservationSalle;

import main.esgi.ddd.model.reservationSalle.ReservationSalle;
import main.esgi.ddd.model.reservationSalle.ReservationSalleID;

import java.util.HashSet;

public class ReservationSalleRepository {

        private HashSet<ReservationSalle> reservations;

        public ReservationSalleRepository(HashSet<ReservationSalle> reservations) {
            this.reservations = reservations;
        }

        public ReservationSalleRepository() {
            this(new HashSet<>());
        }

        public void addReservationSalle(ReservationSalle reservationSalle) {
            this.reservations.add(reservationSalle);
        }

        public void removeReservationSalle(ReservationSalle reservationSalle){
            this.reservations.remove(reservationSalle);
        }

        public ReservationSalle getReservationSalle(ReservationSalleID id) {
            for (ReservationSalle reservationSalle : reservations) {
                if(reservationSalle.getReservationSalleID() == id) {
                    return reservationSalle;
                }
            }
            return null;
        }
}
