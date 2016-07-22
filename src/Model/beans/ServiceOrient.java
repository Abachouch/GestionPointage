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
public class ServiceOrient implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer idServiceOrient;
    private String nomServiceOrient;
    private List<Consultation> consultationList;
    private List<ActMedicale> actMedicaleList;
    
    public ServiceOrient() {
    }
    
    public ServiceOrient(Integer idServiceOrient) {
        this.idServiceOrient = idServiceOrient;
    }

    public ServiceOrient(Integer idServiceOrient, String nomServiceOrient) {
        this.idServiceOrient = idServiceOrient;
        this.nomServiceOrient = nomServiceOrient;
    }

    public Integer getIdServiceOrient() {
        return idServiceOrient;
    }

    public void setIdServiceOrient(Integer idServiceOrient) {
        this.idServiceOrient = idServiceOrient;
    }

    public String getNomServiceOrient() {
        return nomServiceOrient;
    }

    public void setNomServiceOrient(String nomServiceOrient) {
        this.nomServiceOrient = nomServiceOrient;
    }

    public List<Consultation> getConsultationList() {
        return consultationList;
    }

    public void setConsultationList(List<Consultation> consultationList) {
        this.consultationList = consultationList;
    }

    public List<ActMedicale> getActMedicaleList() {
        return actMedicaleList;
    }

    public void setActMedicaleList(List<ActMedicale> actMedicaleList) {
        this.actMedicaleList = actMedicaleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idServiceOrient != null ? idServiceOrient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServiceOrient)) {
            return false;
        }
        ServiceOrient other = (ServiceOrient) object;
        if ((this.idServiceOrient == null && other.idServiceOrient != null) || (this.idServiceOrient != null && !this.idServiceOrient.equals(other.idServiceOrient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.beans.ServiceOrient[ idServiceOrient=" + idServiceOrient + " ]";
    }
    
}
