package aula4.adsm.ex71;

public class Duplicar extends TransformadorDeTextos{

	@Override
	protected void transformar(String texto) {
		String duplicata;
		duplicata = texto;
		System.out.println("String duplicada: "+ duplicata + " " + texto);	
		
	}

}
