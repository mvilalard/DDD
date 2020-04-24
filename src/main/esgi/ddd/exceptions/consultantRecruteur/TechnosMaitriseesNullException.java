package main.esgi.ddd.exceptions.consultantRecruteur;

public class TechnosMaitriseesNullException extends RuntimeException {

    public TechnosMaitriseesNullException() {
        super("Le paramètre technosMaitrisees possède la valeur null !");
    }
}
