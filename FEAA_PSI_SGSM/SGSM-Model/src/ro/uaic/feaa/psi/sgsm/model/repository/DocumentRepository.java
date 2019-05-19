package ro.uaic.feaa.psi.sgsm.model.repository;

import ro.uaic.feaa.psi.metamodel.TransactionManagement;
import ro.uaic.feaa.psi.sgsm.model.entities.Document;

/**
 * Include toate operatiile CRUD pentru {@link Document} si realtiile sale
 * directe. Asadar, {@link Document} este clasa radacina pentru acest
 * respository. De altfel, {@link Document} este considerata clasa radacina
 * modelului SGSM.
 * 
 * http://www.dofactory.com/topic/1138/repository-pattern-vs-dao-pattern.aspx
 * 
 * @author cretuli
 * 
 */
public interface DocumentRepository extends TransactionManagement {

	/**
	 * Toate subtipurile de documente vor putea fi salvate in baza de date cu
	 * aceasta metoda. Avand in vedere atributul Cascade.ALL al tuturor
	 * relatiilor OneToMany, acestea vor fi si ele salvate in baza de date
	 * 
	 * @param document
	 * @returns noua versiune a obiectului dupa salvarea lui in BD
	 */
	public Document saveDocument(Document document);
}
