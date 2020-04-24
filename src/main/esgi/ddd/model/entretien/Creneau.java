package main.esgi.ddd.model.entretien;

import main.esgi.ddd.exceptions.creneau.CreneauInvalideException;
import main.esgi.ddd.exceptions.creneau.DureeInvalideException;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Objects;

public class Creneau{

    public static final int DUREE_MINIMUM = 0;
    public static final int DUREE_MAXIMALE = 180;
    public static final int HEURE_MINIMALE = 18;

    private final LocalDateTime date;

    private final LocalDateTime dateDebut;

    private final LocalDateTime dateFin;

    public Creneau(LocalDateTime date, long duree) {
        if(date.getDayOfWeek() == DayOfWeek.SATURDAY
                || date.getDayOfWeek() == DayOfWeek.SUNDAY)
        {
            throw new CreneauInvalideException("Créneau invalide : pas de créneau le week-end");
        }

        if(date.getHour() < HEURE_MINIMALE)
        {
            throw new CreneauInvalideException("Créneau invalide : pas de rdv avant 18h");
        }

        this.date = date;

        if(duree <= DUREE_MINIMUM)
        {
            throw new DureeInvalideException("Durée invalide : inférieure ou égale à 0");
        }

        if(duree > DUREE_MAXIMALE)
        {
            throw new DureeInvalideException("Durée invalide : supérieur à 0");
        }

        this.dateDebut = date;
        this.dateFin = this.dateDebut.plusMinutes(duree);
    }

    public LocalDateTime getDate() {
        return date;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, dateDebut, dateFin);
    }
}
