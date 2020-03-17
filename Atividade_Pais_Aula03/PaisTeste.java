package usjt.aula02;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class PaisTeste {
	pais, copia;
	static int id = 0;
	@Test
	public void Test1Carregar() {
		System.out.println("carregar");
		System.out.println(PaisDao.carregar(1));
	}

	@Test
	public void Test2Criar() {
		System.out.println("criar");
		PaisDAO.criar(nomepais, populacaopais, areapais);
		id = cliente.getId();
		System.out.println(id);
		copia.setId(id);
		assertEquals("testa criacao", cliente, copia);
	}

	@Test
	public void Test3Atualizar() {
		System.out.println("atualizar");
		cliente.setFone("00000000");
		copia.setFone("00000000");		
		cliente.atualizar();
		cliente.carregar();
		assertEquals("testa atualizacao", cliente, copia);
	}

	@Test
	public void Test4Excluir() {
		System.out.println("excluir");
		copia.setId(-1);
		copia.setNome(null);
		copia.setFone(null);
		copia.setEmail(null);
		cliente.excluir();
		cliente.carregar();
		assertEquals("testa exclusao", cliente, copia);
	}
}

}
