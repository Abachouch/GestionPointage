/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.beans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author lahcen
 */
@Embeddable
public class DossierActPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "Id_Dossier")
    private int idDossier;
    @Basic(optional = false)
    @Column(name = "Id_Act_Medicale")
    private int idActMedicale;

    public DossierActPK() {
    }

    public DossierActPK(int idDossier, int idActMedicale) {
        this.idDossier = idDossier;
        this.idActMedicale = idActMedicale;
    }

    public int getIdDossier() {
        return idDossier;
    }

    public void setIdDossier(int idDossier) {
        this.idDossier = idDossier;
    }

    public int getIdActMedicale() {
        return idActMedicale;
    }

    public void setIdActMedicale(int idActMedicale) {
        this.idActMedicale = idActMedicale;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idDossier;
        hash += (int) idActMedicale;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DossierActPK)) {
            return false;
        }
        DossierActPK other = (DossierActPK) object;
        if (this.idDossier != other.idDossier) {
            return false;
        }
        if (this.idActMedicale != other.idActMedicale) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.beans.DossierActPK[ idDossier=" + idDossier + ", idActMedicale=" + idActMedicale + " ]";
    }
    
}
