package main.esgi.ddd.exceptions.consultantRecruteur;

public class DisponibilitesNullException extends RuntimeException {

    public DisponibilitesNullException() {
        super("Le paramètre disponibilites possède la valeur null !");
    }
}
