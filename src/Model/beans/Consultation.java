/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.beans;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author youssouf
 */

public class Consultation implements Serializable {
    private static final long serialVersionUID = 1L;
   
    private Integer idConsultation;

    private Date dateConsultation;

    private Dossier idDossier;

    private ServiceOrient idServiceOrient;

    public Consultation() {
    }

    public Consultation(Integer idConsultation) {
        this.idConsultation = idConsultation;
    }

    public Integer getIdConsultation() {
        return idConsultation;
    }

    public void setIdConsultation(Integer idConsultation) {
        this.idConsultation = idConsultation;
    }

    public Date getDateConsultation() {
        return dateConsultation;
    }

    public void setDateConsultation(Date dateConsultation) {
        this.dateConsultation = dateConsultation;
    }

    public Dossier getIdDossier() {
        return idDossier;
    }

    public void setIdDossier(Dossier idDossier) {
        this.idDossier = idDossier;
    }

    public ServiceOrient getIdServiceOrient() {
        return idServiceOrient;
    }

    public void setIdServiceOrient(ServiceOrient idServiceOrient) {
        this.idServiceOrient = idServiceOrient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConsultation != null ? idConsultation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consultation)) {
            return false;
        }
        Consultation other = (Consultation) object;
        if ((this.idConsultation == null && other.idConsultation != null) || (this.idConsultation != null && !this.idConsultation.equals(other.idConsultation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.beans.Consultation[ idConsultation=" + idConsultation + " ]";
    }
    
}
