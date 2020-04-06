package com.test.customer.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	
	private int id;
	@Transient
	private String name;
	@Transient
	private String lastname;
	
	private String fullname;
	@Transient
	@NotNull(message="Please provide date of birth")
	@Past(message = "Date of birth must be a past date")
	private LocalDate dateOfBirth;
	
	private int age;
	
	public Customer() {}
	
	public Customer(int id, String name, String lastname, String fullname, LocalDate dateOfBirth, int age,
			List<Product> products) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.fullname = fullname;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.products = products;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", fullname=" + fullname + ", age=" + age + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname() {
		this.fullname = name+""+lastname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge() {
		this.age = Period.between(dateOfBirth, LocalDate.now()).getDays();
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="customer_id", referencedColumnName="id")
	private List<Product> products = new ArrayList<>();
	
}
