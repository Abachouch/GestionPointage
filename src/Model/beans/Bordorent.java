/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author lahcen
 */
@Entity
@Table(name = "bordorent")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bordorent.findAll", query = "SELECT b FROM Bordorent b"),
    @NamedQuery(name = "Bordorent.findByIdBordorent", query = "SELECT b FROM Bordorent b WHERE b.idBordorent = :idBordorent"),
    @NamedQuery(name = "Bordorent.findByDateBor", query = "SELECT b FROM Bordorent b WHERE b.dateBor = :dateBor")})
public class Bordorent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_Bordorent")
    private String idBordorent;
    @Basic(optional = false)
    @Column(name = "DateBor")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateBor;
    @JoinTable(name = "bordorent_dossier", joinColumns = {
        @JoinColumn(name = "id_Bordorent", referencedColumnName = "id_Bordorent")}, inverseJoinColumns = {
        @JoinColumn(name = "Id_Dossier", referencedColumnName = "Id_Dossier")})
    @ManyToMany
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

    @XmlTransient
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
