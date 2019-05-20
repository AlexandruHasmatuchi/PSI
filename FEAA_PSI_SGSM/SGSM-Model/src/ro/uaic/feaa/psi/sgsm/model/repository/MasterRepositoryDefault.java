package ro.uaic.feaa.psi.sgsm.model.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import ro.uaic.feaa.psi.metamodel.AbstractRepository;
import ro.uaic.feaa.psi.sgsm.model.entities.Angajat;
import ro.uaic.feaa.psi.sgsm.model.entities.BunMaterial;
import ro.uaic.feaa.psi.sgsm.model.entities.Contract;
import ro.uaic.feaa.psi.sgsm.model.entities.Furnizor;
import ro.uaic.feaa.psi.sgsm.model.entities.Gestiune;
import ro.uaic.feaa.psi.sgsm.model.entities.Localitate;

public class MasterRepositoryDefault extends AbstractRepository implements
		MasterRepository {

	@Override
	public BunMaterial addBunMaterial(BunMaterial bunMaterial) {
		return (BunMaterial)this.create(bunMaterial);

	}

	@Override
	public Furnizor addFurnizor(Furnizor furnizor) {
		return (Furnizor)this.create(furnizor);

	}

	@Override
	public Gestiune addGestiune(Gestiune gestiune) {
		return (Gestiune)this.create(gestiune);

	}

	@Override
	public Localitate addLocalitate(Localitate localitate) {

		return (Localitate)this.create(localitate);
	}

	@Override
	public void deleteBunMaterial(BunMaterial bunMaterial) {
		this.delete(bunMaterial);

	}

	@Override
	public void deleteFurnizor(Furnizor furnizor) {
		this.delete(furnizor);

	}

	@Override
	public void deleteGestiune(Gestiune gestiune) {
		this.delete(gestiune);

	}

	@Override
	public void deleteLocalitate(Localitate localitate) {
		this.delete(localitate);

	}

	@Override
	public BunMaterial findBunuriMaterialById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BunMaterial> findBunuriMaterialeAll() {
		return this.getEm().createQuery("Select b from BunMaterial b")
				.getResultList();
	}

	@Override
	public Furnizor findFurnizorById(Long id) {

		return (Furnizor) this.getEm().createQuery(
				"Select f from Furnizor f where id=:id").setParameter("id", id)
				.getSingleResult();
	}

	@Override
	public List<Furnizor> findFurnizoriAll() {

		return this.getEm().createQuery("Select f from Furnizor f")
				.getResultList();
	}

	@Override
	public List<Furnizor> findFurnizoriAllLight() {
		// maxima atentie la ordinea parametrilor
		return this
				.getEm()
				.createQuery(
						"Select new Furnizor( f.id, f.cod, f.nume, f.adresa, f.CUI, f.banca, f.contBancar) from Furnizor f")
				.getResultList();
	}

	@Override
	public Gestiune findGestiuneById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Gestiune> findGestiuniAll() {
		return this.getEm().createQuery("Select g from Gestiune g")
				.getResultList();
	}

	@Override
	public Localitate findLocalitateById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Localitate> findLocalitatiAll() {

		return this.getEm().createQuery("Select l from Localitate l")
				.getResultList();
	}

	@Override
	public BunMaterial updateBunMaterial(BunMaterial bunMaterial) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Furnizor updateFurnizor(Furnizor furnizor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Gestiune updateGestiune(Gestiune gestiune) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Localitate updateLocalitate(Localitate localitate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Angajat addAngajat(Angajat angajat) {		
		return (Angajat)this.create(angajat);
	}

	@Override
	public Angajat updateAngajat(Angajat angajat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAngajat(Angajat angajat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Angajat> findAngajatiAll() {
		return this.getEm().createQuery("Select a from Angajat a")
				.getResultList();
	}

	@Override
	public Angajat findAngajatById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contract addContract(Contract contract) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contract updateContract(Contract contract) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteContract(Contract contract) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Contract> findContractAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contract findContractById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}