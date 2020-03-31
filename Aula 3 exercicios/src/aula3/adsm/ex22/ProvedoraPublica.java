package aula3.adsm.ex22;

public class ProvedoraPublica implements Provedora{

	@Override	
	public String proverInfo() {
			return lerArquivo("publico.txt");
		}
}
