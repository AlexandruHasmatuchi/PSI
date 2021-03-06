package ro.uaic.feaa.psi.sgsm.test.repository;

import java.util.List;

import junit.framework.Assert;

import ro.uaic.feaa.psi.sgsm.model.entities.Angajat;
import ro.uaic.feaa.psi.sgsm.model.entities.Localitate;
import ro.uaic.feaa.psi.sgsm.model.repository.MasterRepository;
import ro.uaic.feaa.psi.sgsm.model.repository.MasterRepositoryDefault;

public class TestAngajati {

	static MasterRepository repo = new MasterRepositoryDefault();

	public static void main(String[] args) {
		List<Angajat> angajati = repo.findAngajatiAll();
		//daca nu sunt angajati introducem cateva date de test
		if (angajati.size() == 0) {
			addAngajati();
			angajati = repo.findAngajatiAll();
		}
		//verificam daca sunt date de test (ar trebui sa existe, la acest moment)
		Assert.assertTrue(angajati.size()>0);
	}

	
	//metoda generare angajati
	private static void addAngajati() {
		repo.beginTransaction();
		for (int i = 1; i < 10; i++) {
			Angajat angajat = new Angajat();
			
			angajat.setIdPersoana(i);
			angajat.setAdresa("Adresa " + i);
			angajat.setCNP("1234567890123");
			angajat.setDataNastere("24/03/1990");
			angajat.setEmail("adresa" + i + "@email.com");
			angajat.setNume("Nume " + i);
			angajat.setPrenume("Prenume " + i);
			angajat.setTelefon("123456789");
			angajat.setMarca("1234");
			angajat.setManagerSef("54321");
			angajat.setDepartament("Cercetare si dezvoltare");
			
			repo.addAngajat(angajat);

		}
		repo.commitTransaction();
	}
}