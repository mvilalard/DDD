package main.esgi.ddd.infrastructure.repository.candidat;

import main.esgi.ddd.model.candidat.Candidat;
import main.esgi.ddd.model.candidat.CandidatID;

import java.util.HashSet;

public class CandidatRepository {

    private HashSet<Candidat> candidats;

    public CandidatRepository(HashSet<Candidat> candidats) {
        this.candidats = candidats;
    }

    public CandidatRepository() {
        this(new HashSet<>());
    }

    public void addCandidat(Candidat candidat) {
        this.candidats.add(candidat);
    }

    public void removeCandidat(Candidat candidat){
        this.candidats.remove(candidat);
    }

    public Candidat getCandidat(CandidatID id) {
        for (Candidat candidat : candidats) {
            if(candidat.getCandidatID() == id) {
                return candidat;
            }
        }
        return null;
    }
}
