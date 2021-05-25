package com.desafio.comeia;

import com.desafio.comeia.dao.ClienteDao;
import com.desafio.comeia.dao.ClienteDaoInterface;
import com.desafio.comeia.pojos.Cliente;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComeiaApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ComeiaApplication.class, args);

		//Cliente cliente = new Cliente("1","nome");

		ClienteDaoInterface clienteDao = new ClienteDao();

		//clienteDao.adicionar();
	}

}
