package ro.uaic.feaa.psi.sgsm.model.repository;

import ro.uaic.feaa.psi.metamodel.AbstractRepository;
import ro.uaic.feaa.psi.sgsm.model.entities.Document;

public class DocumentRepositoryDefault extends AbstractRepository implements DocumentRepository{

	@Override
	public Document saveDocument(Document document) {
		if (document.getId()==null)//obiect nou
			document=(Document)this.create(document);
		else //obiect existent in BD
			document=(Document)this.update(document);
		
		return document;
	}

	

}
