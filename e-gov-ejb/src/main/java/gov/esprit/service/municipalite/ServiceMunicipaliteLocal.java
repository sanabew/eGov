package gov.esprit.service.municipalite;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import gov.esprit.domain.Citoyen;
import gov.esprit.domain.ContratMariage;
import gov.esprit.exception.EgovException;


@Local
public interface ServiceMunicipaliteLocal {
	
	public void enregistrerDivorse(String cinH, String cinF , Date date) throws EgovException;
	
	public List<ContratMariage> rechercherContrat(String cinH, String cinF) throws EgovException;
	
	public void enregistrerMariage(String cin1, String cin2, Date date) throws EgovException ;
	
	public void enregistreNouvNee(Citoyen c)throws Exception;

}
