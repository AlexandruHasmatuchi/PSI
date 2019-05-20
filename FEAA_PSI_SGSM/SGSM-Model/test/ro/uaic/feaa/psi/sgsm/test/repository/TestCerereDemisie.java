package ro.uaic.feaa.psi.sgsm.test.repository;

import java.util.List;

import junit.framework.Assert;

import ro.uaic.feaa.psi.sgsm.model.entities.CerereDemisie;
import ro.uaic.feaa.psi.sgsm.model.repository.MasterRepository;
import ro.uaic.feaa.psi.sgsm.model.repository.MasterRepositoryDefault;

public class TestCerereDemisie {

	static MasterRepository repo = new MasterRepositoryDefault();

	public static void main(String[] args) {
		List<CerereDemisie> cereriDemisie = repo.findCerereDemisieAll();
		//daca nu sunt CerereDemisiee introducem cateva date de test
		if (cereriDemisie.size() == 0) {
			addCerereDemisie();
			cereriDemisie = repo.findCerereDemisieAll();
		}
		//verificam daca sunt date de test (ar trebui sa existe, la acest moment)
		Assert.assertTrue(cereriDemisie.size()>0);
	}

	
	//metoda generare CerereDemisiee
	private static void addCerereDemisie() {
		repo.beginTransaction();
		for (int i = 1; i < 10; i++) {
			CerereDemisie cerereDemisie = new CerereDemisie();

            cerereDemisie.setCodCerere(i);
            cerereDemisie.setAngajat("angajat" + i);
            cerereDemisie.setMotiv("Motiv medical nr. " + i);
            cerereDemisie.setDataCerere("0" + i +"/03/2019");
            cerereDemisie.setStatus("Activ");

			repo.addCerereDemisie(cerereDemisie);

		}
		repo.commitTransaction();
	}
}