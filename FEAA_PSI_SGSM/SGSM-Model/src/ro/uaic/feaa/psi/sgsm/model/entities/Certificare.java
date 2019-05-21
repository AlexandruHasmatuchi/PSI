package ro.uaic.feaa.psi.sgsm.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.UniqueConstraint;

import ro.uaic.feaa.psi.metamodel.AbstractEntity;
import ro.uaic.feaa.psi.sgsm.model.entities.Angajat;

@Entity
public class Certificare extends AbstractEntity{

	private Integer idCertificare;
	private Integer serie;
	private String denumire;
	private String institutie;
	private Angajat angajat;
	
	public Certificare(Integer idCertificare, Integer serie, String denumire, String institutie, Angajat angajat) {
		super();
		this.idCertificare = idCertificare;
		this.serie = serie;
		this.denumire = denumire;
		this.institutie = institutie;
		this.angajat = angajat;
	}

	public Integer getIdCertificare() {
		return idCertificare;
	}

	public void setIdCertificare(Integer idCertificare) {
		this.idCertificare = idCertificare;
	}

	public Integer getSerie() {
		return serie;
	}

	public void setSerie(Integer serie) {
		this.serie = serie;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public String getInstitutie() {
		return institutie;
	}

	public void setInstitutie(String institutie) {
		this.institutie = institutie;
	}

	public Angajat getAngajat() {
		return angajat;
	}

	public void setAngajat(Angajat angajat) {
		this.angajat = angajat;
	}
	
	
	
}
