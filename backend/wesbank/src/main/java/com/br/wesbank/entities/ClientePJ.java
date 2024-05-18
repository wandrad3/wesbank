package com.br.wesbank.entities;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name = "client_pj")
public class ClientePJ extends AppUser{
	
	private String cnpj;
	
	@OneToOne
	private Account account;
	

	public ClientePJ() {
	}

	public ClientePJ(String fullName, String email, String password, String cnpj,Account account, Agency agency) {
		super(fullName, email, password, agency);
		this.cnpj = cnpj;
		this.account = account;
	}



	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		return "ClientePJ [cnpj=" + cnpj +  '\'' +
                ", " + super.toString() +
                ']';
	}	
}