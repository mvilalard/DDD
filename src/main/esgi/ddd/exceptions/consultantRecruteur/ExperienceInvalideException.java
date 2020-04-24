package main.esgi.ddd.exceptions.consultantRecruteur;

public class ExperienceInvalideException  extends RuntimeException {

    public ExperienceInvalideException() {
        super("Un recruteur ne peut pas avoir moins de 5 années d'expérience !");
    }
}
