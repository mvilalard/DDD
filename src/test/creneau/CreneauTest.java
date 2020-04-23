package test.creneau;

import main.esgi.ddd.exceptions.creneau.CreneauInvalideException;
import main.esgi.ddd.exceptions.creneau.DureeInvalideException;
import main.esgi.ddd.model.creneau.Creneau;
import org.junit.Test;

import java.time.LocalDateTime;

public class CreneauTest {


    @Test (expected = CreneauInvalideException.class)
    public void CreneauMustRetunInvalidaDateBecauseDayIsSunday() {
        LocalDateTime dateTime = LocalDateTime.of(2020, 04, 25, 10, 00, 00);

        Creneau creneau = new Creneau(dateTime, 120);
    }

    @Test (expected = CreneauInvalideException.class)
    public void CreneauMustRetunInvalidaDateBecauseHourIsWrong() {
        LocalDateTime dateTime = LocalDateTime.of(2020, 04, 21, 6, 00, 00);

        Creneau creneau = new Creneau(dateTime, 120);
    }

    @Test (expected = DureeInvalideException.class)
    public void CreneauMustRetunInvalidaDateBecauseDurationIsNegative() {
        LocalDateTime dateTime = LocalDateTime.of(2020, 04, 21, 10, 00, 00);

        Creneau creneau = new Creneau(dateTime, -120);
    }

}
