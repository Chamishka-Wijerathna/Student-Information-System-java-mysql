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
@Table(name = "AcademicStaff", catalog = "sql2390162", schema = "")
@NamedQueries({
    @NamedQuery(name = "AcademicStaff.findAll", query = "SELECT a FROM AcademicStaff a")
    , @NamedQuery(name = "AcademicStaff.findByStaffNo", query = "SELECT a FROM AcademicStaff a WHERE a.staffNo = :staffNo")
    , @NamedQuery(name = "AcademicStaff.findByName", query = "SELECT a FROM AcademicStaff a WHERE a.name = :name")
    , @NamedQuery(name = "AcademicStaff.findByDob", query = "SELECT a FROM AcademicStaff a WHERE a.dob = :dob")
    , @NamedQuery(name = "AcademicStaff.findByAddress", query = "SELECT a FROM AcademicStaff a WHERE a.address = :address")
    , @NamedQuery(name = "AcademicStaff.findByContactNo", query = "SELECT a FROM AcademicStaff a WHERE a.contactNo = :contactNo")
    , @NamedQuery(name = "AcademicStaff.findBySubject", query = "SELECT a FROM AcademicStaff a WHERE a.subject = :subject")
    , @NamedQuery(name = "AcademicStaff.findByPayment", query = "SELECT a FROM AcademicStaff a WHERE a.payment = :payment")})
public class AcademicStaff implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "StaffNo")
    private String staffNo;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "DOB")
    private String dob;
    @Basic(optional = false)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @Column(name = "ContactNo")
    private int contactNo;
    @Basic(optional = false)
    @Column(name = "Subject")
    private String subject;
    @Basic(optional = false)
    @Column(name = "Payment")
    private int payment;

    public AcademicStaff() {
    }

    public AcademicStaff(String staffNo) {
        this.staffNo = staffNo;
    }

    public AcademicStaff(String staffNo, String name, String dob, String address, int contactNo, String subject, int payment) {
        this.staffNo = staffNo;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.contactNo = contactNo;
        this.subject = subject;
        this.payment = payment;
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        String oldStaffNo = this.staffNo;
        this.staffNo = staffNo;
        changeSupport.firePropertyChange("staffNo", oldStaffNo, staffNo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        String oldSubject = this.subject;
        this.subject = subject;
        changeSupport.firePropertyChange("subject", oldSubject, subject);
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        int oldPayment = this.payment;
        this.payment = payment;
        changeSupport.firePropertyChange("payment", oldPayment, payment);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (staffNo != null ? staffNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcademicStaff)) {
            return false;
        }
        AcademicStaff other = (AcademicStaff) object;
        if ((this.staffNo == null && other.staffNo != null) || (this.staffNo != null && !this.staffNo.equals(other.staffNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sis.AcademicStaff[ staffNo=" + staffNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
