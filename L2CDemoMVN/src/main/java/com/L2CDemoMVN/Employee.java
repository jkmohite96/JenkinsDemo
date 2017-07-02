package com.L2CDemoMVN;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY, region = "employee")
@Entity
@Table(name = "EMPLOYEE_L2C")
public class Employee {
	
	@Id
	@GeneratedValue(strategy =GenerationType.TABLE )
	private int empid;

	@Column
	private String name;  
	
	@Column
	private float salary;  
	  
	public Employee() {}  
	public Employee(String name, float salary) {  
	    super();  
	    this.name = name;  
	    this.salary = salary;  
	}
	public int getId() {
		return empid;
	}
	public void setId(int id) {
		this.empid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}  

}
