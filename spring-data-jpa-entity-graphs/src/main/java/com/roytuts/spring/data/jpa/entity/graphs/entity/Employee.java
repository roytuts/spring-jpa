package com.roytuts.spring.data.jpa.entity.graphs.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Integer empId;

	@Column(name = "emp_first_name")
	private String empFirstName;

	@Column(name = "emp_last_name")
	private String empLastName;

	@Column(name = "emp_mgr_id")
	private Integer empMgrId;

	@Column(name = "emp_designation")
	private String empDesignation;

	@JoinColumn(name = "dept_id", referencedColumnName = "dept_id")
	@ManyToOne(optional = false)
	private Department deptId;

	public Employee() {
	}

	public Employee(Integer empId) {
		this.empId = empId;
	}

	public Employee(Integer empId, String empFirstName, String empLastName) {
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public Integer getEmpMgrId() {
		return empMgrId;
	}

	public void setEmpMgrId(Integer empMgrId) {
		this.empMgrId = empMgrId;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public Department getDeptId() {
		return deptId;
	}

	public void setDeptId(Department deptId) {
		this.deptId = deptId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (empId != null ? empId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) object;
		if ((this.empId == null && other.empId != null) || (this.empId != null && !this.empId.equals(other.empId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empMgrId=" + empMgrId + ", empDesignation=" + empDesignation + ", deptId=" + deptId + "]";
	}

}
