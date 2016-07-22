/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lahcen
 */
@Entity
@Table(name = "consultation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Consultation.findAll", query = "SELECT c FROM Consultation c"),
    @NamedQuery(name = "Consultation.findByIdConsultation", query = "SELECT c FROM Consultation c WHERE c.idConsultation = :idConsultation"),
    @NamedQuery(name = "Consultation.findByDateConsultation", query = "SELECT c FROM Consultation c WHERE c.dateConsultation = :dateConsultation")})
public class Consultation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Consultation")
    private Integer idConsultation;
    @Column(name = "Date_Consultation")
    @Temporal(TemporalType.DATE)
    private Date dateConsultation;
    @JoinColumn(name = "Id_Dossier", referencedColumnName = "Id_Dossier")
    @ManyToOne
    private Dossier idDossier;
    @JoinColumn(name = "Id_Service_Orient", referencedColumnName = "Id_Service_Orient")
    @ManyToOne
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
