package main.esgi.ddd.exceptions.entretien;

public class ConsultantRecruteurIndefinieException extends RuntimeException {

    public ConsultantRecruteurIndefinieException() {
        super("Aucun consultant n'est assigné à cet entretien !");
    }

}
