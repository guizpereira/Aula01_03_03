package aula4.adsm.ex51;

public class Teste {
	public static void main(String[] args) {
		IOFacade ioFacade = new IOFacade();
		System.out.println(ioFacade.abrirTexto("teste.txt"));
		System.out.println(ioFacade.abrirBinario("teste.txt"));
		System.out.println(ioFacade.abrirObjeto("teste.txt"));
		}

}
