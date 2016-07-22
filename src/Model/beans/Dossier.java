/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.beans;

import java.io.Serializable;
import java.util.List;
/**
 *
 * @author youssouf
 */

public class Dossier implements Serializable {
    private static final long serialVersionUID = 1L;
   
    private Integer idDossier;
    
    private String cinPatient;
  
    private String nomPatient;
  
    private String prenomPatient;
    
    private String pereOUfils;
   
    private String observation;

    private String sexe;
   
    private List<Bordorent> bordorentList;
  
    private List<DossierAct> dossierActList;

    private ActMedicale idActMedicale;
   
    private List<Consultation> consultationList;

    public Dossier() {
    }

    public Dossier(Integer idDossier) {
        this.idDossier = idDossier;
    }

    public Dossier(Integer idDossier, String cinPatient, String nomPatient, String prenomPatient, String pereOUfils) {
        this.idDossier = idDossier;
        this.cinPatient = cinPatient;
        this.nomPatient = nomPatient;
        this.prenomPatient = prenomPatient;
        this.pereOUfils = pereOUfils;
    }

    public Integer getIdDossier() {
        return idDossier;
    }

    public void setIdDossier(Integer idDossier) {
        this.idDossier = idDossier;
    }

    public String getCinPatient() {
        return cinPatient;
    }

    public void setCinPatient(String cinPatient) {
        this.cinPatient = cinPatient;
    }

    public String getNomPatient() {
        return nomPatient;
    }

    public void setNomPatient(String nomPatient) {
        this.nomPatient = nomPatient;
    }

    public String getPrenomPatient() {
        return prenomPatient;
    }

    public void setPrenomPatient(String prenomPatient) {
        this.prenomPatient = prenomPatient;
    }

    public String getPereOUfils() {
        return pereOUfils;
    }

    public void setPereOUfils(String pereOUfils) {
        this.pereOUfils = pereOUfils;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public List<Bordorent> getBordorentList() {
        return bordorentList;
    }

    public void setBordorentList(List<Bordorent> bordorentList) {
        this.bordorentList = bordorentList;
    }

    public List<DossierAct> getDossierActList() {
        return dossierActList;
    }

    public void setDossierActList(List<DossierAct> dossierActList) {
        this.dossierActList = dossierActList;
    }

    public ActMedicale getIdActMedicale() {
        return idActMedicale;
    }

    public void setIdActMedicale(ActMedicale idActMedicale) {
        this.idActMedicale = idActMedicale;
    }

    public List<Consultation> getConsultationList() {
        return consultationList;
    }

    public void setConsultationList(List<Consultation> consultationList) {
        this.consultationList = consultationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDossier != null ? idDossier.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dossier)) {
            return false;
        }
        Dossier other = (Dossier) object;
        if ((this.idDossier == null && other.idDossier != null) || (this.idDossier != null && !this.idDossier.equals(other.idDossier))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.beans.Dossier[ idDossier=" + idDossier + " ]";
    }
    
}
