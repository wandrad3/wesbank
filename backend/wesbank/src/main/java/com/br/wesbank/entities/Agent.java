package com.br.wesbank.entities;

import jakarta.persistence.Entity;

@Entity(name = "tb_agent")
public class Agent extends AppUser {

	private String cpf;
    // Construtor
    public Agent() {}

    public Agent(String fullName, String email, String password, Agency agency, String cpf) {
        super(fullName, email, password, agency);
        this.cpf = cpf;
    }

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



}
