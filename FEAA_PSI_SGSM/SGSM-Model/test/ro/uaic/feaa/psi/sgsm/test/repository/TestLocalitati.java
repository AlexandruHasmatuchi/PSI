package ro.uaic.feaa.psi.sgsm.test.repository;

import java.util.List;

import junit.framework.Assert;

import ro.uaic.feaa.psi.sgsm.model.entities.Localitate;
import ro.uaic.feaa.psi.sgsm.model.repository.MasterRepository;
import ro.uaic.feaa.psi.sgsm.model.repository.MasterRepositoryDefault;
/**
 * Test pentru Localitate. Teste efectuate:
 * # extragere lista de localitati
 * # adaugare localitate 
 * 
 * @author cretuli
 * 
 */
public class TestLocalitati {

	static MasterRepository repo = new MasterRepositoryDefault();

	public static void main(String[] args) {
		List<Localitate> localitati = repo.findLocalitatiAll();
		//daca nu sunt localitati introducem cateva date de test
		if (localitati.size() == 0) {
			addLocalitati();
			localitati = repo.findLocalitatiAll();
		}
		//verificam daca sunt date de test (ar trebui sa existe, la acest moment)
		Assert.assertTrue(localitati.size()>0);
	}

	private static void addLocalitati() {
		repo.beginTransaction();
		for (int i = 1; i < 10; i++) {
			Localitate loc = new Localitate();
			loc.setCod(100 + i);
			loc.setDenumire("Localitate " + (100 + i));

			repo.addLocalitate(loc);

		}
		repo.commitTransaction();
	}
}