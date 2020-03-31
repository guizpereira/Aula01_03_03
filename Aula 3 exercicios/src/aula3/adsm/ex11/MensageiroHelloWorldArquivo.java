package aula3.adsm.ex11;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MensageiroHelloWorldArquivo implements Mensageiro {

	@Override
	public void escrever() {
		try {
			PrintWriter writer = new PrintWriter("mensagem.txt");
			writer.write("Hello World!");
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
