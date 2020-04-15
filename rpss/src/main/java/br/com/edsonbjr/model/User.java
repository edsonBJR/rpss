package br.com.edsonbjr.model;

import javax.persistence.OneToMany;

public class User {
	
	private Integer id;
	private String name;
	private String email;
	private String cpfOuCnpj;
	
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
	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}
	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}

	public Address getAddress() {
		return address;
	}
	public Phone getPhone() {
		return phone;
	}
	
}
