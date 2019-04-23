package teste;

import java.sql.Connection;
import java.util.ArrayList;

import com.restaurante.jdbc.CNXJDBC;
import com.restaurantes.apirest.dao.RestauranteDAO;
import com.restaurantes.apirest.models.Restaurante;

public class Principal {

	public static void main(String[] args) {
		
		/**
		 * Verificação do Banco conectado ou não
		 */
		Connection c = CNXJDBC.conectar();
		
		if(c==null)
			System.out.println("Erro ao conectar o banco");
		else
			System.out.println("Banco conectado com sucesso");
		
		/**
		 * Duas linhas abaixo é válido para inserir, alterar, excluir e consultar 
		 * informações no banco
		 */
		// Utilizamos o objeto do tipo RestauranteDAO
		RestauranteDAO resDao = new RestauranteDAO();
		// Precisamos de um objeto do tipo restaurante
		Restaurante umRes = new Restaurante();
				
		/**
		 * Método para inserir a informação do restaurante
		 */
		// Setar o valor do nome
		umRes.setNome("Aspásia");
		umRes.setNome("Ketsui");
		umRes.setNome("Yakissobateria San´s");
		umRes.setNome("Yakissobateria San´s");
		umRes.setNome("Bar do Argentino");
		umRes.setNome("Deck Beach Bar");
		umRes.setNome("teste");
		umRes.setNome("Fogão Mineiro");
		
		resDao.inserirRestaurante(umRes);
		
		/**
		 * Retorna todos os Restaurantes cadastrados, percorrendo todos os
		 * itens de ocorrências no banco de dados
		 */
		ArrayList<Restaurante> listRestaurantes = resDao.listarTodosRestaurantes();
		for(Restaurante umRestaurante : listRestaurantes)
			System.out.println(umRestaurante.toString());
		
		/**
		 * Método para alterar as informações do restaurante existente
		 */
		//umRes.setId(3);
		//umRes.setNome("Espetinho do Luizinho");
		//resDao.alterarRestaurante(umRes);
		
		/**
		 * Método para excluir o restaurante existente
		 */
		//umRes.setId(6);
		//resDao.excluirRestaurante(umRes);
	}

}
