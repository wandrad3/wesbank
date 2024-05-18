package com.br.wesbank.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity(name = "cliente_pf")
public class ClientPF extends AppUser {

    private String cpf;

    @OneToOne
	private Account account;
    // Construtor
    public ClientPF() {}

    public ClientPF(String fullName, String email, String password, String cpf, Account account, Agency agency) {
        super(fullName, email, password, agency);
        this.cpf = cpf;
        this.account = account;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

   
}
