package aula3.adsm.ex22;

public class FactoryProvedora {
	
	public FactoryProvedora(String senha) {
		Provedora p;
		if (senha.equals("desi gnpatt er ns")) {
			p = new ProvedoraConfidencial();
		}else {
			p = new ProvedoraPublica();
		} 
		System.out.println(p.proverInfo());
	} 
	
}
