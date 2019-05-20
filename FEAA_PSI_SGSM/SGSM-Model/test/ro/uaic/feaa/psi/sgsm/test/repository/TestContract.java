package ro.uaic.feaa.psi.sgsm.test.repository;

import java.util.List;

import junit.framework.Assert;

import ro.uaic.feaa.psi.sgsm.model.entities.Contract;
import ro.uaic.feaa.psi.sgsm.model.repository.MasterRepository;
import ro.uaic.feaa.psi.sgsm.model.repository.MasterRepositoryDefault;

public class TestContract {

	static MasterRepository repo = new MasterRepositoryDefault();

	public static void main(String[] args) {
		List<Contract> contracte = repo.findContractAll();
		
		if (contracte.size() == 0) {
			addContracte();
			contracte = repo.findContractAll();
		}
		//verificam daca sunt date de test (ar trebui sa existe, la acest moment)
		Assert.assertTrue(contracte.size()>0);
	}

	
	//metoda generare angajati
	private static void addContracte() {
		repo.beginTransaction();
		for (int i = 1; i < 10; i++) {
			Contract contract = new Contract();
			contract.setDataInceput("01/04/2019");
			contract.setDataIncheiere("01/07/2019");
			contract.setDataSfarsit("01/07/2019");
			contract.setMarca("12345");
			contract.setNrContract(i + "");
			contract.setNumarZileConcediu(20 - i);
			contract.setPost("Programator");
			contract.setSalariu(i * 100);
			contract.setSerie("123");
			contract.setStatus("Activ");
			
			
			repo.addContract(contract);

		}
		repo.commitTransaction();
	}
}