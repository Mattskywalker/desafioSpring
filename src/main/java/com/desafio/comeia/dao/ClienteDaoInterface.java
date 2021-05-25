package com.desafio.comeia.dao;

import com.desafio.comeia.pojos.Cliente;

import java.util.List;

public interface ClienteDaoInterface {

    public void adicionar(Cliente cliente);

    public void pesquisar();

    public List<Cliente> listar();

    public void deletar();

    public void alterar();
}
