package ro.uaic.feaa.psi.sgsm.test.repository;

import java.util.List;

import junit.framework.Assert;

import ro.uaic.feaa.psi.sgsm.model.entities.Angajat;
import ro.uaic.feaa.psi.sgsm.model.entities.CerereConcediu;
import ro.uaic.feaa.psi.sgsm.model.repository.MasterRepository;
import ro.uaic.feaa.psi.sgsm.model.repository.MasterRepositoryDefault;

public class TestCerereConcediu {

	static MasterRepository repo = new MasterRepositoryDefault();

	public static void main(String[] args) {
		List<CerereConcediu> CereriConcediu = repo.findCerereConcediuAll();
		
		if (CereriConcediu.size() == 0) {
			addCerereConcediu();
			CereriConcediu = repo.findCerereConcediuAll();
		}
		
		Assert.assertTrue(CereriConcediu.size()>0);
	}

	
	//metoda generare CerereConcediu
	private static void addCerereConcediu() {
		repo.beginTransaction();
		
		List<Angajat> Angajati = repo.findAngajatiAll();
		
		//nu putem continua fara angajati
		Assert.assertTrue("Rulati mai intai testul TestAngajati", Angajati.size()>0);
		
		for (int i = 1; i < 10; i++) {
			CerereConcediu CerereConcediu = new CerereConcediu(i, "Odihna", Angajati.get(i), "123", "Odihna", "01/06/2019", "05/06/2019");
			
			repo.addCerereConcediu(CerereConcediu);

		}
		repo.commitTransaction();
	}
}