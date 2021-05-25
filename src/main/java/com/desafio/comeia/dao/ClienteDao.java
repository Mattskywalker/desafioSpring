package com.desafio.comeia.dao;

import com.desafio.comeia.pojos.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class ClienteDao implements ClienteDaoInterface{

    @Override
    public void adicionar(Cliente cliente) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        try{
            tx.begin();
            em.persist(cliente);
            tx.commit();

        }catch (Exception e){
            e.printStackTrace();

        }finally {
            em.close();
        }

    }

    @Override
    public void pesquisar() {

    }

    @Override
    public List<Cliente> listar() {
        return null;
    }

    @Override
    public void deletar() {

    }

    @Override
    public void alterar() {

    }
}
