package ro.uaic.feaa.psi.sgsm.model.repository;

import java.util.List;

import ro.uaic.feaa.psi.metamodel.TransactionManagement;
import ro.uaic.feaa.psi.sgsm.model.entities.Angajat;
import ro.uaic.feaa.psi.sgsm.model.entities.Contract;
import ro.uaic.feaa.psi.sgsm.model.entities.BunMaterial;
import ro.uaic.feaa.psi.sgsm.model.entities.Furnizor;
import ro.uaic.feaa.psi.sgsm.model.entities.Gestiune;
import ro.uaic.feaa.psi.sgsm.model.entities.Localitate;

/**
 * Defineste operatii CRUD pentru majoritatea claselor-satelit din modelul nostru.
 * Exemple: Furnizor, Localitate, BunMaterial, Gestiune
 * @author cretuli
 *
 */
public interface MasterRepository extends TransactionManagement{
	
	//metodele de tip Create trebuie sa returneze clientului noua versiune a obiectului dupa insertul in BD 
	public Localitate addLocalitate(Localitate localitate);
	public Furnizor addFurnizor(Furnizor furnizor);
	public BunMaterial addBunMaterial(BunMaterial bunMaterial);
	public Gestiune addGestiune(Gestiune gestiune);
	
	//NOI -------------------------
	public Angajat addAngajat(Angajat angajat);
	public Contract addContract(Contract contract);
    
	
	//metodele de tip Update trebuie sa returneze clientului noua versiune a obiectului dupa update-ul in BD
	public Localitate updateLocalitate(Localitate localitate);
	public Furnizor updateFurnizor(Furnizor furnizor);
	public BunMaterial updateBunMaterial(BunMaterial bunMaterial);
	public Gestiune updateGestiune(Gestiune gestiune);
	
	//NOI -------------------------
	public Angajat updateAngajat(Angajat angajat);
	public Contract updateContract(Contract contract);
    
	
	
	public void deleteLocalitate(Localitate localitate);
	public void deleteFurnizor(Furnizor furnizor);
	public void deleteBunMaterial(BunMaterial bunMaterial);
	public void deleteGestiune(Gestiune gestiune);
	
	//NOI -------------------------
	public void deleteAngajat(Angajat angajat);
	public void deleteContract(Contract contract);
    
	
	public List<Localitate> findLocalitatiAll();
	public List<Furnizor> findFurnizoriAll();
	public List<BunMaterial> findBunuriMaterialeAll();
	public List<Gestiune> findGestiuniAll();
	
	//NOI -------------------------
	public List<Angajat> findAngajatiAll();
	public List<Contract> findContractAll();
    
	
	
	
	public Localitate findLocalitateById(Long id);
	public Furnizor findFurnizorById(Long id);
	public BunMaterial findBunuriMaterialById(Long id);
	public Gestiune findGestiuneById(Long id);
	
	//NOI -------------------------
	public Angajat findAngajatById(Long id);
	public Contract findContractById(Long id);
    
	
	
	/**
	 * Extrage date doar din tabela Furnizor, fara relatia ManyToOne Localitate
	 * @return
	 */
	public List<Furnizor> findFurnizoriAllLight();
}