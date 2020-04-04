package aula3.adsm.ex23;

public class FerramentaConsole implements Ferramenta{

	@Override
	public String log() {
		int contar = 1;
		System.out.println("Contado ate 10...");
		for(int i=0; i<=9; i++) {
			System.out.println("Contagem: " + contar);
			contar++;
		}
		return "";
	}
	
	

}
