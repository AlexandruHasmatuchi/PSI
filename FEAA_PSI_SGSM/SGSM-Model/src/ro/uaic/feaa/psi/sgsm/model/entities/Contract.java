package ro.uaic.feaa.psi.sgsm.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.UniqueConstraint;

import ro.uaic.feaa.psi.metamodel.AbstractEntity;

@Entity
public class Contract extends AbstractEntity{
	String NrContract;
	String Serie;
	String DataIncheiere;
	String DataInceput;
	String DataSfarsit;
	String Post;
	String Status;
	String Marca;
	Integer NumarZileConcediu;
	Integer Salariu;
	
	public String getNrContract() {
		return NrContract;
	}
	public void setNrContract(String nrContract) {
		NrContract = nrContract;
	}
	public String getSerie() {
		return Serie;
	}
	public void setSerie(String serie) {
		Serie = serie;
	}
	public String getDataIncheiere() {
		return DataIncheiere;
	}
	public void setDataIncheiere(String dataIncheiere) {
		DataIncheiere = dataIncheiere;
	}
	public String getDataInceput() {
		return DataInceput;
	}
	public void setDataInceput(String dataInceput) {
		DataInceput = dataInceput;
	}
	public String getDataSfarsit() {
		return DataSfarsit;
	}
	public void setDataSfarsit(String dataSfarsit) {
		DataSfarsit = dataSfarsit;
	}
	public String getPost() {
		return Post;
	}
	public void setPost(String post) {
		Post = post;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public Integer getNumarZileConcediu() {
		return NumarZileConcediu;
	}
	public void setNumarZileConcediu(Integer numarZileConcediu) {
		NumarZileConcediu = numarZileConcediu;
	}
	public Integer getSalariu() {
		return Salariu;
	}
	public void setSalariu(Integer salariu) {
		Salariu = salariu;
	}

}
