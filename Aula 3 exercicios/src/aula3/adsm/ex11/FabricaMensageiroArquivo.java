package aula3.adsm.ex11;

public class FabricaMensageiroArquivo implements FabricaMensageiros {

	@Override
	public Mensageiro getInstance(String tipo) {
		switch(tipo) {
		case "HELLO":
			return new MensageiroHelloWorldArquivo();
		}
		return null;
	}

}
