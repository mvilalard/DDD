package main.esgi.ddd.model.creneau;

import main.esgi.ddd.exceptions.creneau.CreneauInvalideException;
import main.esgi.ddd.exceptions.creneau.DureeInvalideException;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Objects;

public class Creneau {

    public static final int DUREE_MINIMUM = 0;
    public static final int HEURE_MINIMALE = 8;
    public static final int HEURE_MAXIMALE = 20;
    private final CreneauID creneauID;

    private final LocalDateTime date;

    private final LocalDateTime dateDebut;

    private final LocalDateTime dateFin;

    public Creneau(LocalDateTime date, long duree) {
        this.creneauID = new CreneauID();

        if(date.getDayOfWeek() == DayOfWeek.SATURDAY
                || date.getDayOfWeek() == DayOfWeek.SUNDAY)
        {
            throw new CreneauInvalideException("Créneau invalide : pas de créneau le week-end");
        }

        if(date.getHour() < HEURE_MINIMALE || date.getHour()  > HEURE_MAXIMALE)
        {
            throw new CreneauInvalideException("Créneau invalide : pas de rdv avant 8h et après 20h");
        }

        this.date = date;

        if(duree <= DUREE_MINIMUM)
        {
            throw new DureeInvalideException("Durée invalide : inférieure ou égale à 0");
        }

        this.dateDebut = date;
        this.dateFin = this.dateDebut.plusMinutes(duree);
    }

    public CreneauID getCreneauID() {
        return creneauID;
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
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Creneau creneau = (Creneau) o;
        return Objects.equals(dateDebut, creneau.dateDebut) &&
                Objects.equals(dateFin, creneau.dateFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateDebut, dateFin);
    }
}
