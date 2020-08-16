package com.roytuts.spring.data.jpa.entity.graphs.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department")
@NamedEntityGraph(name = "department.employees", attributeNodes = { @NamedAttributeNode("employeeCollection") })
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dept_id")
	private Integer deptId;

	@Column(name = "dept_name")
	private String deptName;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "deptId")
	private Collection<Employee> employeeCollection;

	public Department() {
	}

	public Department(Integer deptId) {
		this.deptId = deptId;
	}

	public Department(Integer deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Collection<Employee> getEmployeeCollection() {
		return employeeCollection;
	}

	public void setEmployeeCollection(Collection<Employee> employeeCollection) {
		this.employeeCollection = employeeCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (deptId != null ? deptId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Department)) {
			return false;
		}
		Department other = (Department) object;
		if ((this.deptId == null && other.deptId != null)
				|| (this.deptId != null && !this.deptId.equals(other.deptId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}

}
