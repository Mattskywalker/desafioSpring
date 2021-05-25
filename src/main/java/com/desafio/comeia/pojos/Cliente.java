package com.desafio.comeia.pojos;

import com.desafio.comeia.enums.Tipo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Cliente {

    @Column
    private String nome;
    @Column
    private String endereco;
    @Column
    private Tipo tipo;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }
}
