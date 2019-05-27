package ro.uaic.feaa.psi.sgsm.forms;

import ro.uaic.feaa.psi.sgsm.model.entities.Angajat;
import ro.uaic.feaa.psi.sgsm.model.entities.DocInsotitor;
import ro.uaic.feaa.psi.sgsm.model.entities.LinieDocument;
import ro.uaic.feaa.psi.sgsm.model.entities.Receptie;


public class AngajatiForm {
	
	private AngajatiFormData formData = new AngajatiFormData(); 

	

	public AngajatiFormData getFormData() {
		return formData;
	}

	public void setFormData(AngajatiFormData formData) {
		this.formData = formData;
	}

	public void angajatNou(Angajat angajat) {
		Angajat AngajatNou = angajat;
		this.formData.setCurrentAngajat(AngajatNou);
	}
	
	

	
	public void salveazaModificariDocument() {
		this.getFormData().getMasterRepo().beginTransaction();
		this.getFormData().getMasterRepo().addAngajat((Angajat) this.getFormData().getAngajatCurent());
		this.getFormData().getMasterRepo().commitTransaction();

	}

}
