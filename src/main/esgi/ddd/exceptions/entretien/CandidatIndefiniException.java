package main.esgi.ddd.exceptions.entretien;

public class CandidatIndefiniException extends RuntimeException {

    public CandidatIndefiniException() {
        super("Aucun candidat n'est assigné à cet entretien !");
    }
}

