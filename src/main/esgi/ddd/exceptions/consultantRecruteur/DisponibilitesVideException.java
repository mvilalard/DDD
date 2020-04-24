package main.esgi.ddd.exceptions.consultantRecruteur;

public class DisponibilitesVideException extends RuntimeException {

    public DisponibilitesVideException() {
        super("Le paramètre disponibilites est vide !");
    }
}
