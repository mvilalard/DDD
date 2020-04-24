package main.esgi.ddd.infrastructure.repository.consultantRecruteur;

import main.esgi.ddd.model.consultantRecruteur.ConsultantRecruteur;
import main.esgi.ddd.model.consultantRecruteur.ConsultantRecruteurID;

import java.util.HashSet;

public class ConsultantRecruteurRepository {

    private HashSet<ConsultantRecruteur> consultants;

    public ConsultantRecruteurRepository(HashSet<ConsultantRecruteur> consultants) {
        this.consultants = consultants;
    }

    public ConsultantRecruteurRepository() {
        this(new HashSet<>());
    }

    public void addConsultantRecruteur(ConsultantRecruteur consultant) {
        this.consultants.add(consultant);
    }

    public void removeConsultantRecruteur(ConsultantRecruteur consultant){
        this.consultants.remove(consultant);
    }

    public ConsultantRecruteur getConsultantRecruteur(ConsultantRecruteurID id) {
        for (ConsultantRecruteur consultant : consultants) {
            if(consultant.getConsultantRecruteurID() == id) {
                return consultant;
            }
        }
        return null;
    }
}
