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
@Table(name = "NonAcademicSatt", catalog = "sql2390162", schema = "")
@NamedQueries({
    @NamedQuery(name = "NonAcademicSatt.findAll", query = "SELECT n FROM NonAcademicSatt n")
    , @NamedQuery(name = "NonAcademicSatt.findByStaffNo", query = "SELECT n FROM NonAcademicSatt n WHERE n.staffNo = :staffNo")
    , @NamedQuery(name = "NonAcademicSatt.findByName", query = "SELECT n FROM NonAcademicSatt n WHERE n.name = :name")
    , @NamedQuery(name = "NonAcademicSatt.findByDob", query = "SELECT n FROM NonAcademicSatt n WHERE n.dob = :dob")
    , @NamedQuery(name = "NonAcademicSatt.findByAddress", query = "SELECT n FROM NonAcademicSatt n WHERE n.address = :address")
    , @NamedQuery(name = "NonAcademicSatt.findByContactNo", query = "SELECT n FROM NonAcademicSatt n WHERE n.contactNo = :contactNo")
    , @NamedQuery(name = "NonAcademicSatt.findByWorktype", query = "SELECT n FROM NonAcademicSatt n WHERE n.worktype = :worktype")
    , @NamedQuery(name = "NonAcademicSatt.findByPayment", query = "SELECT n FROM NonAcademicSatt n WHERE n.payment = :payment")})
public class NonAcademicSatt implements Serializable {

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
    @Column(name = "Work_type")
    private String worktype;
    @Basic(optional = false)
    @Column(name = "Payment")
    private int payment;

    public NonAcademicSatt() {
    }

    public NonAcademicSatt(String staffNo) {
        this.staffNo = staffNo;
    }

    public NonAcademicSatt(String staffNo, String name, String dob, String address, int contactNo, String worktype, int payment) {
        this.staffNo = staffNo;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.contactNo = contactNo;
        this.worktype = worktype;
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

    public String getWorktype() {
        return worktype;
    }

    public void setWorktype(String worktype) {
        String oldWorktype = this.worktype;
        this.worktype = worktype;
        changeSupport.firePropertyChange("worktype", oldWorktype, worktype);
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
        if (!(object instanceof NonAcademicSatt)) {
            return false;
        }
        NonAcademicSatt other = (NonAcademicSatt) object;
        if ((this.staffNo == null && other.staffNo != null) || (this.staffNo != null && !this.staffNo.equals(other.staffNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sis.NonAcademicSatt[ staffNo=" + staffNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
