package aula3.adsm.ex22;

public class ProvedoraConfidencial implements Provedora {
	
	@Override
	public String proverInfo() {
		return lerArquivo("confidencial.txt");
	}

}
