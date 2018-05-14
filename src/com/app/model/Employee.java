package com.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emptaboo")
public class Employee {
@Id
@Column(name="eid")
private int empId;
@Column(name="ename")
private String empName;
@Column(name="esal")
private double empSal;
@Column(name="email")
private String email;
private String ofcname;
@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
@JoinColumn(name="aidfk",unique=true)
private Address addr;

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public double getEmpSal() {
	return empSal;
}

public void setEmpSal(double empSal) {
	this.empSal = empSal;
}

public Address getAddr() {
	return addr;
}

public void setAddr(Address addr) {
	this.addr = addr;
}

public Employee() {
	super();
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", addr=" + addr + "]";
}

}
