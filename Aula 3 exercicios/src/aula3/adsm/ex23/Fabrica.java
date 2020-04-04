package aula3.adsm.ex23;

public class Fabrica {

	public Fabrica(String escolha) {
		Ferramenta l;

		if("arquivo".contentEquals(escolha)) {
			l = new FerramentaTxt();
			l.log();
			System.out.println(l.log());			
		}

		else if("console".equals(escolha)) {
			l = new FerramentaConsole();
			System.out.println(l.log());

		} 
		else {
			l = null;
		}
	}

}
