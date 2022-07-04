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
@Table(name = "Result", catalog = "sql2390162", schema = "")
@NamedQueries({
    @NamedQuery(name = "Result.findAll", query = "SELECT r FROM Result r")
    , @NamedQuery(name = "Result.findByStudentNo", query = "SELECT r FROM Result r WHERE r.studentNo = :studentNo")
    , @NamedQuery(name = "Result.findByReligion", query = "SELECT r FROM Result r WHERE r.religion = :religion")
    , @NamedQuery(name = "Result.findBySinhala", query = "SELECT r FROM Result r WHERE r.sinhala = :sinhala")
    , @NamedQuery(name = "Result.findByEnglish", query = "SELECT r FROM Result r WHERE r.english = :english")
    , @NamedQuery(name = "Result.findByMathematics", query = "SELECT r FROM Result r WHERE r.mathematics = :mathematics")
    , @NamedQuery(name = "Result.findByScience", query = "SELECT r FROM Result r WHERE r.science = :science")})
public class Result implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "StudentNo")
    private String studentNo;
    @Basic(optional = false)
    @Column(name = "Religion")
    private int religion;
    @Basic(optional = false)
    @Column(name = "Sinhala")
    private int sinhala;
    @Basic(optional = false)
    @Column(name = "English")
    private int english;
    @Basic(optional = false)
    @Column(name = "Mathematics")
    private int mathematics;
    @Basic(optional = false)
    @Column(name = "Science")
    private int science;

    public Result() {
    }

    public Result(String studentNo) {
        this.studentNo = studentNo;
    }

    public Result(String studentNo, int religion, int sinhala, int english, int mathematics, int science) {
        this.studentNo = studentNo;
        this.religion = religion;
        this.sinhala = sinhala;
        this.english = english;
        this.mathematics = mathematics;
        this.science = science;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        String oldStudentNo = this.studentNo;
        this.studentNo = studentNo;
        changeSupport.firePropertyChange("studentNo", oldStudentNo, studentNo);
    }

    public int getReligion() {
        return religion;
    }

    public void setReligion(int religion) {
        int oldReligion = this.religion;
        this.religion = religion;
        changeSupport.firePropertyChange("religion", oldReligion, religion);
    }

    public int getSinhala() {
        return sinhala;
    }

    public void setSinhala(int sinhala) {
        int oldSinhala = this.sinhala;
        this.sinhala = sinhala;
        changeSupport.firePropertyChange("sinhala", oldSinhala, sinhala);
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        int oldEnglish = this.english;
        this.english = english;
        changeSupport.firePropertyChange("english", oldEnglish, english);
    }

    public int getMathematics() {
        return mathematics;
    }

    public void setMathematics(int mathematics) {
        int oldMathematics = this.mathematics;
        this.mathematics = mathematics;
        changeSupport.firePropertyChange("mathematics", oldMathematics, mathematics);
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        int oldScience = this.science;
        this.science = science;
        changeSupport.firePropertyChange("science", oldScience, science);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentNo != null ? studentNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Result)) {
            return false;
        }
        Result other = (Result) object;
        if ((this.studentNo == null && other.studentNo != null) || (this.studentNo != null && !this.studentNo.equals(other.studentNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sis.Result[ studentNo=" + studentNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
