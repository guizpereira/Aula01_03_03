package aula3.adsm.ex11;

public class FabricaMensageiroTela implements FabricaMensageiros {

	@Override
	public Mensageiro getInstance(String tipo) {
		switch(tipo) {
		case "HELLO":
			return new MensageiroHelloWorldTela();
		}
		return null;
	}

}
