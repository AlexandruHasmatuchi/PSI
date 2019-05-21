package ro.uaic.feaa.psi.sgsm.test.repository;

import java.util.List;

import junit.framework.Assert;

import ro.uaic.feaa.psi.sgsm.model.entities.Angajat;
import ro.uaic.feaa.psi.sgsm.model.entities.Certificare;
import ro.uaic.feaa.psi.sgsm.model.repository.MasterRepository;
import ro.uaic.feaa.psi.sgsm.model.repository.MasterRepositoryDefault;

public class TestCertificare {

	static MasterRepository repo = new MasterRepositoryDefault();

	public static void main(String[] args) {
		List<Certificare> Certificari = repo.findCertificareAll();
		
		if (Certificari.size() == 0) {
			addCertificare();
			Certificari = repo.findCertificareAll();
		}
		
		Assert.assertTrue(Certificari.size()>0);
	}

	
	//metoda generare Certificare
	private static void addCertificare() {
		repo.beginTransaction();
		
		List<Angajat> Angajati = repo.findAngajatiAll();
		
		//nu putem continua fara angajati
		Assert.assertTrue("Rulati mai intai testul TestAngajati", Angajati.size()>0);
		
		for (int i = 1; i < 10; i++) {
			Certificare Certificare = new Certificare(i, 10 + i, "Atestat Gestiunea Bazelor de Date", "Scoala informala de IT", Angajati.get(i));
			
			repo.addCertificare(Certificare);

		}
		repo.commitTransaction();
	}
}