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
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
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
@Table(name = "dossier")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dossier.findAll", query = "SELECT d FROM Dossier d"),
    @NamedQuery(name = "Dossier.findByIdDossier", query = "SELECT d FROM Dossier d WHERE d.idDossier = :idDossier"),
    @NamedQuery(name = "Dossier.findByCinPatient", query = "SELECT d FROM Dossier d WHERE d.cinPatient = :cinPatient"),
    @NamedQuery(name = "Dossier.findByNomPatient", query = "SELECT d FROM Dossier d WHERE d.nomPatient = :nomPatient"),
    @NamedQuery(name = "Dossier.findByPrenomPatient", query = "SELECT d FROM Dossier d WHERE d.prenomPatient = :prenomPatient"),
    @NamedQuery(name = "Dossier.findByPereOUfils", query = "SELECT d FROM Dossier d WHERE d.pereOUfils = :pereOUfils"),
    @NamedQuery(name = "Dossier.findBySexe", query = "SELECT d FROM Dossier d WHERE d.sexe = :sexe")})
public class Dossier implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Dossier")
    private Integer idDossier;
    @Basic(optional = false)
    @Column(name = "Cin_Patient")
    private String cinPatient;
    @Basic(optional = false)
    @Column(name = "Nom_Patient")
    private String nomPatient;
    @Basic(optional = false)
    @Column(name = "Prenom_Patient")
    private String prenomPatient;
    @Basic(optional = false)
    @Column(name = "Pere_OU_fils")
    private String pereOUfils;
    @Lob
    @Column(name = "Observation")
    private String observation;
    @Column(name = "Sexe")
    private String sexe;
    @ManyToMany(mappedBy = "dossierList")
    private List<Bordorent> bordorentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dossier")
    private List<DossierAct> dossierActList;
    @JoinColumn(name = "Id_Act_Medicale", referencedColumnName = "Id_Act_Medicale")
    @ManyToOne(optional = false)
    private ActMedicale idActMedicale;
    @OneToMany(mappedBy = "idDossier")
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

    @XmlTransient
    public List<Bordorent> getBordorentList() {
        return bordorentList;
    }

    public void setBordorentList(List<Bordorent> bordorentList) {
        this.bordorentList = bordorentList;
    }

    @XmlTransient
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

    @XmlTransient
    public List<Consultation> getConsultationList() {
        return consultationList;
    }

    public void setConsultationList(List<Consultation> consultationList) {
        this.consultationList = consultationList;
    }

   // @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDossier != null ? idDossier.hashCode() : 0);
        return hash;
    }

    //@Override
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

    //@Override
    public String toString() {
        return "Model.beans.Dossier[ idDossier=" + idDossier + " ]";
    }
    
}
