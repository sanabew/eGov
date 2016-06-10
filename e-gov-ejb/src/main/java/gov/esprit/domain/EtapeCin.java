package gov.esprit.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EtapeCin  implements Serializable {

	private boolean documentsCin;
	private boolean photosCin;
	private boolean empreinteCin;
	private boolean impressionCin;
	private boolean livraisonCin;
	private static final long serialVersionUID = 1L;
	
	public EtapeCin() {
		
	}
	public void initialize(){
		this.setDocuments(false);
		this.setEmpreinte(false);
		this.setImpression(false);
		this.setLivraison(false);
		this.setPhotos(false);
	}
	public boolean isDocuments() {
		return documentsCin;
	}
	public void setDocuments(boolean documents) {
		this.documentsCin = documents;
	}
	public boolean isPhotos() {
		return photosCin;
	}
	public void setPhotos(boolean photos) {
		this.photosCin = photos;
	}
	public boolean isEmpreinte() {
		return empreinteCin;
	}
	public void setEmpreinte(boolean empreinte) {
		this.empreinteCin = empreinte;
	}
	public boolean isImpression() {
		return impressionCin;
	}
	public void setImpression(boolean impression) {
		this.impressionCin = impression;
	}
	public boolean isLivraison() {
		return livraisonCin;
	}
	public void setLivraison(boolean livraison) {
		this.livraisonCin = livraison;
	}
	
	
}
