package aula3.adsm.ex23;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FerramentaTxt implements Ferramenta {

	@Override
	public String log() {

		try {

			FileWriter txt = new FileWriter("log.txt");
			PrintWriter gravarTxt = new PrintWriter(txt);
			int contar =1;
			for(int i = 0; i <= 9; i = i+1 ) {
				gravarTxt.println("Contagem " + contar);
				contar++;
			}
			txt.close();
		}catch (IOException error) {
			System.out.println("Erro ao criar o arquivo log.txt"+error);

		}

		return "Arquivo de texto criado com sucesso";
	}

}
