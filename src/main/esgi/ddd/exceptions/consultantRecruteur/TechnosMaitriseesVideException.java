package main.esgi.ddd.exceptions.consultantRecruteur;

public class TechnosMaitriseesVideException extends RuntimeException {

    public TechnosMaitriseesVideException() {
        super("Le paramètre technosMaitrisees est vide !");
    }
}
