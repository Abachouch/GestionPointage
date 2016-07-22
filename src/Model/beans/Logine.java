/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.beans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lahcen
 */
@Entity
@Table(name = "logine")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Logine.findAll", query = "SELECT l FROM Logine l"),
    @NamedQuery(name = "Logine.findByIdLogin", query = "SELECT l FROM Logine l WHERE l.idLogin = :idLogin"),
    @NamedQuery(name = "Logine.findByUsername", query = "SELECT l FROM Logine l WHERE l.username = :username"),
    @NamedQuery(name = "Logine.findByPasword", query = "SELECT l FROM Logine l WHERE l.pasword = :pasword")})
public class Logine implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_Login")
    private Integer idLogin;
    @Column(name = "Username")
    private String username;
    @Column(name = "Pasword")
    private String pasword;

    public Logine() {
    }

    public Logine(Integer idLogin) {
        this.idLogin = idLogin;
    }

    public Integer getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(Integer idLogin) {
        this.idLogin = idLogin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLogin != null ? idLogin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Logine)) {
            return false;
        }
        Logine other = (Logine) object;
        if ((this.idLogin == null && other.idLogin != null) || (this.idLogin != null && !this.idLogin.equals(other.idLogin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.beans.Logine[ idLogin=" + idLogin + " ]";
    }
    
}
