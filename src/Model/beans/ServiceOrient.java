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
@Table(name = "service_orient")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServiceOrient.findAll", query = "SELECT s FROM ServiceOrient s"),
    @NamedQuery(name = "ServiceOrient.findByIdServiceOrient", query = "SELECT s FROM ServiceOrient s WHERE s.idServiceOrient = :idServiceOrient"),
    @NamedQuery(name = "ServiceOrient.findByNomServiceOrient", query = "SELECT s FROM ServiceOrient s WHERE s.nomServiceOrient = :nomServiceOrient")})
public class ServiceOrient implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Service_Orient")
    private Integer idServiceOrient;
    @Basic(optional = false)
    @Column(name = "Nom_Service_Orient")
    private String nomServiceOrient;
    @OneToMany(mappedBy = "idServiceOrient")
    private List<Consultation> consultationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idServiceOrient")
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

    @XmlTransient
    public List<Consultation> getConsultationList() {
        return consultationList;
    }

    public void setConsultationList(List<Consultation> consultationList) {
        this.consultationList = consultationList;
    }

    @XmlTransient
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
