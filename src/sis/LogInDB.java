/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "LogInDB", catalog = "sql2390162", schema = "")
@NamedQueries({
    @NamedQuery(name = "LogInDB.findAll", query = "SELECT l FROM LogInDB l")
    , @NamedQuery(name = "LogInDB.findByUserNameDB", query = "SELECT l FROM LogInDB l WHERE l.userNameDB = :userNameDB")
    , @NamedQuery(name = "LogInDB.findByPasswordDB", query = "SELECT l FROM LogInDB l WHERE l.passwordDB = :passwordDB")
    , @NamedQuery(name = "LogInDB.findByEmail", query = "SELECT l FROM LogInDB l WHERE l.email = :email")
    , @NamedQuery(name = "LogInDB.findByPosition", query = "SELECT l FROM LogInDB l WHERE l.position = :position")
    , @NamedQuery(name = "LogInDB.findByGrade", query = "SELECT l FROM LogInDB l WHERE l.grade = :grade")})
public class LogInDB implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "UserNameDB")
    private String userNameDB;
    @Basic(optional = false)
    @Column(name = "PasswordDB")
    private String passwordDB;
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @Column(name = "Position")
    private String position;
    @Column(name = "GRADE")
    private String grade;

    public LogInDB() {
    }

    public LogInDB(String userNameDB) {
        this.userNameDB = userNameDB;
    }

    public LogInDB(String userNameDB, String passwordDB, String position) {
        this.userNameDB = userNameDB;
        this.passwordDB = passwordDB;
        this.position = position;
    }

    public String getUserNameDB() {
        return userNameDB;
    }

    public void setUserNameDB(String userNameDB) {
        String oldUserNameDB = this.userNameDB;
        this.userNameDB = userNameDB;
        changeSupport.firePropertyChange("userNameDB", oldUserNameDB, userNameDB);
    }

    public String getPasswordDB() {
        return passwordDB;
    }

    public void setPasswordDB(String passwordDB) {
        String oldPasswordDB = this.passwordDB;
        this.passwordDB = passwordDB;
        changeSupport.firePropertyChange("passwordDB", oldPasswordDB, passwordDB);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        String oldPosition = this.position;
        this.position = position;
        changeSupport.firePropertyChange("position", oldPosition, position);
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        String oldGrade = this.grade;
        this.grade = grade;
        changeSupport.firePropertyChange("grade", oldGrade, grade);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userNameDB != null ? userNameDB.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogInDB)) {
            return false;
        }
        LogInDB other = (LogInDB) object;
        if ((this.userNameDB == null && other.userNameDB != null) || (this.userNameDB != null && !this.userNameDB.equals(other.userNameDB))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sis.LogInDB[ userNameDB=" + userNameDB + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
