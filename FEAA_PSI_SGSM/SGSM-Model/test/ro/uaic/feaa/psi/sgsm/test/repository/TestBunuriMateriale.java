package ro.uaic.feaa.psi.sgsm.test.repository;

import java.util.List;

import junit.framework.Assert;
import ro.uaic.feaa.psi.sgsm.model.entities.BunMaterial;
import ro.uaic.feaa.psi.sgsm.model.repository.MasterRepository;
import ro.uaic.feaa.psi.sgsm.model.repository.MasterRepositoryDefault;

/**
 * Test pentru BunMaterial. Teste efectuate:
 * # extragere lista de materiale
 * # adaugare BunMaterial 
 * 
 * @author cretuli
 * 
 */
public class TestBunuriMateriale {

	static MasterRepository repo = new MasterRepositoryDefault();

	public static void main(String[] args) {
		List<BunMaterial> x = repo.findBunuriMaterialeAll();
		if (x.size() == 0)// daca nu sunt date in tabela, adaugam date de test
		{
			adaugaBunuri();
			x = repo.findBunuriMaterialeAll();
		}
		
		// acum ar trebui sa avem date de test
		Assert.assertTrue( x.size() > 0);

		
	}

	public static void adaugaBunuri() {
		BunMaterial g = null;
		repo.beginTransaction();

		for (int i=0; i<3; i++) {
			
			g=new BunMaterial();
			g.setCodMaterial("M"+1000+i);
			g.setDenumireMaterial("BunMaterial "+g.getCodMaterial());
			
			repo.addBunMaterial(g);
		}
		repo.commitTransaction();
	}
}
