package ro.uaic.feaa.psi.sgsm.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.UniqueConstraint;

import ro.uaic.feaa.psi.metamodel.AbstractEntity;

@Entity
public class Angajat extends AbstractEntity{

	Integer IdPersoana;
	String Nume;
	String Prenume;
	String Email;
	String Telefon;
	String CNP;
	String DataNastere;
	String Adresa;
	String Marca;
	String ManagerSef;
	String Departament ;
	

	public String getAdresa() {
		return Adresa;
	}
	public void setAdresa(String adresa) {
		Adresa = adresa;
	}
	
	public Integer getIdPersoana() {
		return IdPersoana;
	}
	public void setIdPersoana(Integer idPersoana) {
		IdPersoana = idPersoana;
	}
	public String getNume() {
		return Nume;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getManagerSef() {
		return ManagerSef;
	}
	public void setManagerSef(String managerSef) {
		ManagerSef = managerSef;
	}
	public String getDepartament() {
		return Departament;
	}
	public void setDepartament(String departament) {
		Departament = departament;
	}
	public void setNume(String nume) {
		Nume = nume;
	}
	public String getPrenume() {
		return Prenume;
	}
	public void setPrenume(String prenume) {
		Prenume = prenume;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTelefon() {
		return Telefon;
	}
	public void setTelefon(String telefon) {
		Telefon = telefon;
	}
	public String getCNP() {
		return CNP;
	}
	public void setCNP(String cNP) {
		CNP = cNP;
	}
	
	public String getDataNastere() {
		return DataNastere;
	}
	public void setDataNastere(String dataNastere) {
		DataNastere = dataNastere;
	}
	
}
