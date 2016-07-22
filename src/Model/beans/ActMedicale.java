/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.beans;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author lahcen
 */
@Entity
@Table(name = "act_medicale")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActMedicale.findAll", query = "SELECT a FROM ActMedicale a"),
    @NamedQuery(name = "ActMedicale.findByIdActMedicale", query = "SELECT a FROM ActMedicale a WHERE a.idActMedicale = :idActMedicale"),
    @NamedQuery(name = "ActMedicale.findByNomActMedicale", query = "SELECT a FROM ActMedicale a WHERE a.nomActMedicale = :nomActMedicale")})
public class ActMedicale implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Act_Medicale")
    private Integer idActMedicale;
    @Basic(optional = false)
    @Column(name = "Nom_Act_Medicale")
    private String nomActMedicale;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actMedicale")
    private List<DossierAct> dossierActList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idActMedicale")
    private List<Dossier> dossierList;
    @JoinColumn(name = "Id_Service_Orient", referencedColumnName = "Id_Service_Orient")
    @ManyToOne(optional = false)
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

    @XmlTransient
    public List<DossierAct> getDossierActList() {
        return dossierActList;
    }

    public void setDossierActList(List<DossierAct> dossierActList) {
        this.dossierActList = dossierActList;
    }

    @XmlTransient
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
