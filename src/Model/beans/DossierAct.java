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
public class DossierAct implements Serializable {
    private static final long serialVersionUID = 1L;
   
    protected DossierActPK dossierActPK;
   
    private Date dateDossierAct;
   
    private Dossier dossier;
   
    private ActMedicale actMedicale;

    public DossierAct() {
    }

    public DossierAct(DossierActPK dossierActPK) {
        this.dossierActPK = dossierActPK;
    }

    public DossierAct(int idDossier, int idActMedicale) {
        this.dossierActPK = new DossierActPK(idDossier, idActMedicale);
    }

    public DossierActPK getDossierActPK() {
        return dossierActPK;
    }

    public void setDossierActPK(DossierActPK dossierActPK) {
        this.dossierActPK = dossierActPK;
    }

    public Date getDateDossierAct() {
        return dateDossierAct;
    }

    public void setDateDossierAct(Date dateDossierAct) {
        this.dateDossierAct = dateDossierAct;
    }

    public Dossier getDossier() {
        return dossier;
    }

    public void setDossier(Dossier dossier) {
        this.dossier = dossier;
    }

    public ActMedicale getActMedicale() {
        return actMedicale;
    }

    public void setActMedicale(ActMedicale actMedicale) {
        this.actMedicale = actMedicale;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dossierActPK != null ? dossierActPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DossierAct)) {
            return false;
        }
        DossierAct other = (DossierAct) object;
        if ((this.dossierActPK == null && other.dossierActPK != null) || (this.dossierActPK != null && !this.dossierActPK.equals(other.dossierActPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.beans.DossierAct[ dossierActPK=" + dossierActPK + " ]";
    }
    
}
