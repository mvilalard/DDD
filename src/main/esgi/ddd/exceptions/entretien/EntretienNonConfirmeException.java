package main.esgi.ddd.exceptions.entretien;

public class EntretienNonConfirmeException  extends RuntimeException {

    public EntretienNonConfirmeException() {
        super("L'entretien n'a pas été confirmé !");
    }
}