package aula3.adsm.ex11;

public class TesteMensageiro {

	public static void main(String[] args) {
		FabricaMensageiros fabrica = ProdutorFabricaMensageiro.getFabrica();
		Mensageiro msg = fabrica.getInstance("HELLO");
		msg.escrever();
	}

}
