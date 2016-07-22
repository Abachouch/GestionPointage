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

public class ActMedicale implements Serializable {
    private static final long serialVersionUID = 1L;
   
    private Integer idActMedicale;
    
    private String nomActMedicale;
   
    private List<DossierAct> dossierActList;
    
    private List<Dossier> dossierList;
    
    private ServiceOrient idServiceOrient;

    public ActMedicale() {
    }

    public ActMedicale(Integer idActMedicale) {
        this.idActMedicale = idActMedicale;
    }

    public ActMedicale(Integer idActMedicale, String nomActMedicale) {
        this.idActMedicale = idActMedicale;
        this.nomActMedicale = nomActMedicale;
    }

    public Integer getIdActMedicale() {
        return idActMedicale;
    }

    public void setIdActMedicale(Integer idActMedicale) {
        this.idActMedicale = idActMedicale;
    }

    public String getNomActMedicale() {
        return nomActMedicale;
    }

    public void setNomActMedicale(String nomActMedicale) {
        this.nomActMedicale = nomActMedicale;
    }

    public List<DossierAct> getDossierActList() {
        return dossierActList;
    }

    public void setDossierActList(List<DossierAct> dossierActList) {
        this.dossierActList = dossierActList;
    }

    public List<Dossier> getDossierList() {
        return dossierList;
    }

    public void setDossierList(List<Dossier> dossierList) {
        this.dossierList = dossierList;
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
        hash += (idActMedicale != null ? idActMedicale.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActMedicale)) {
            return false;
        }
        ActMedicale other = (ActMedicale) object;
        if ((this.idActMedicale == null && other.idActMedicale != null) || (this.idActMedicale != null && !this.idActMedicale.equals(other.idActMedicale))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.beans.ActMedicale[ idActMedicale=" + idActMedicale + " ]";
    }
    
}
