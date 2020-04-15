package br.com.edsonbjr.model;

import javax.persistence.OneToMany;

public class Customer {
	
	private Integer id;
	private String name;
	private String email;
	
	@OneToMany
	private Address address;
	
	@OneToMany
	private Phone phone;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Address getAddress() {
		return address;
	}
	public Phone getPhone() {
		return phone;
	}

}
