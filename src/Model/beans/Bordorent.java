/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author youssouf
 */
public class Bordorent implements Serializable {
    private static final long serialVersionUID = 1L;
   
    private String idBordorent;
    private Date dateBor;
    private List<Dossier> dossierList;

    public Bordorent() {
    }

    public Bordorent(String idBordorent) {
        this.idBordorent = idBordorent;
    }

    public Bordorent(String idBordorent, Date dateBor) {
        this.idBordorent = idBordorent;
        this.dateBor = dateBor;
    }

    public String getIdBordorent() {
        return idBordorent;
    }

    public void setIdBordorent(String idBordorent) {
        this.idBordorent = idBordorent;
    }

    public Date getDateBor() {
        return dateBor;
    }

    public void setDateBor(Date dateBor) {
        this.dateBor = dateBor;
    }

    public List<Dossier> getDossierList() {
        return dossierList;
    }

    public void setDossierList(List<Dossier> dossierList) {
        this.dossierList = dossierList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBordorent != null ? idBordorent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bordorent)) {
            return false;
        }
        Bordorent other = (Bordorent) object;
        if ((this.idBordorent == null && other.idBordorent != null) || (this.idBordorent != null && !this.idBordorent.equals(other.idBordorent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.beans.Bordorent[ idBordorent=" + idBordorent + " ]";
    }
    
}
