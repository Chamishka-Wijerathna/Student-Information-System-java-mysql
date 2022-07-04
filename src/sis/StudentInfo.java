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
@Table(name = "StudentInfo", catalog = "sql2390162", schema = "")
@NamedQueries({
    @NamedQuery(name = "StudentInfo.findAll", query = "SELECT s FROM StudentInfo s")
    , @NamedQuery(name = "StudentInfo.findByStudentNo", query = "SELECT s FROM StudentInfo s WHERE s.studentNo = :studentNo")
    , @NamedQuery(name = "StudentInfo.findByStudentName", query = "SELECT s FROM StudentInfo s WHERE s.studentName = :studentName")
    , @NamedQuery(name = "StudentInfo.findByGrade", query = "SELECT s FROM StudentInfo s WHERE s.grade = :grade")
    , @NamedQuery(name = "StudentInfo.findByDob", query = "SELECT s FROM StudentInfo s WHERE s.dob = :dob")
    , @NamedQuery(name = "StudentInfo.findByAddress", query = "SELECT s FROM StudentInfo s WHERE s.address = :address")
    , @NamedQuery(name = "StudentInfo.findByContactNo", query = "SELECT s FROM StudentInfo s WHERE s.contactNo = :contactNo")})
public class StudentInfo implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "StudentNo")
    private String studentNo;
    @Basic(optional = false)
    @Column(name = "StudentName")
    private String studentName;
    @Basic(optional = false)
    @Column(name = "Grade")
    private int grade;
    @Basic(optional = false)
    @Column(name = "DOB")
    private String dob;
    @Basic(optional = false)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @Column(name = "ContactNo")
    private int contactNo;

    public StudentInfo() {
    }

    public StudentInfo(String studentNo) {
        this.studentNo = studentNo;
    }

    public StudentInfo(String studentNo, String studentName, int grade, String dob, String address, int contactNo) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.grade = grade;
        this.dob = dob;
        this.address = address;
        this.contactNo = contactNo;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        String oldStudentNo = this.studentNo;
        this.studentNo = studentNo;
        changeSupport.firePropertyChange("studentNo", oldStudentNo, studentNo);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        String oldStudentName = this.studentName;
        this.studentName = studentName;
        changeSupport.firePropertyChange("studentName", oldStudentName, studentName);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        int oldGrade = this.grade;
        this.grade = grade;
        changeSupport.firePropertyChange("grade", oldGrade, grade);
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        String oldDob = this.dob;
        this.dob = dob;
        changeSupport.firePropertyChange("dob", oldDob, dob);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        int oldContactNo = this.contactNo;
        this.contactNo = contactNo;
        changeSupport.firePropertyChange("contactNo", oldContactNo, contactNo);
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
        if (!(object instanceof StudentInfo)) {
            return false;
        }
        StudentInfo other = (StudentInfo) object;
        if ((this.studentNo == null && other.studentNo != null) || (this.studentNo != null && !this.studentNo.equals(other.studentNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sis.StudentInfo[ studentNo=" + studentNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
