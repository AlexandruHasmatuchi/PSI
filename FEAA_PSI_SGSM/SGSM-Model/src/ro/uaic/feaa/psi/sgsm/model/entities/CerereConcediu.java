package ro.uaic.feaa.psi.sgsm.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.UniqueConstraint;

import ro.uaic.feaa.psi.metamodel.AbstractEntity;
import ro.uaic.feaa.psi.sgsm.model.entities.Angajat;

@Entity
public class CerereConcediu extends AbstractEntity{
	
	private Integer codCerere;
	private String motiv;
	private Angajat angajat;
	private String documentDoveditor;
	private String tipConcediu;
	private String dataInceput;
	private String dataSfarsit;

	public CerereConcediu(Integer codCerere, String motiv, Angajat angajat, String documentDoveditor, String tipConcediu,
			String dataInceput, String dataSfarsit) {
		super();
		this.codCerere = codCerere;
		this.motiv = motiv;
		this.angajat = angajat;
		this.documentDoveditor = documentDoveditor;
		this.tipConcediu = tipConcediu;
		this.dataInceput = dataInceput;
		this.dataSfarsit = dataSfarsit;
	}
	
	public Integer getCodCerere() {
		return codCerere;
	}

	public void setCodCerere(Integer codCerere) {
		this.codCerere = codCerere;
	}

	public String getMotiv() {
		return motiv;
	}

	public void setMotiv(String motiv) {
		this.motiv = motiv;
	}

	public Angajat getAngajat() {
		return angajat;
	}

	public void setAngajat(Angajat angajat) {
		this.angajat = angajat;
	}

	public String getDocumentDoveditor() {
		return documentDoveditor;
	}

	public void setDocumentDoveditor(String documentDoveditor) {
		this.documentDoveditor = documentDoveditor;
	}

	public String getTipConcediu() {
		return tipConcediu;
	}

	public void setTipConcediu(String tipConcediu) {
		this.tipConcediu = tipConcediu;
	}

	public String getDataInceput() {
		return dataInceput;
	}

	public void setDataInceput(String dataInceput) {
		this.dataInceput = dataInceput;
	}

	public String getDataSfarsit() {
		return dataSfarsit;
	}

	public void setDataSfarsit(String dataSfarsit) {
		this.dataSfarsit = dataSfarsit;
	}

	
	
}
