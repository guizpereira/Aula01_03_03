package aula4.adsm.ex71;

public class Maiusculo extends TransformadorDeTextos {

	@Override
	protected void transformar(String texto) {
		System.out.println("Texto em minusculo: " + texto.toLowerCase());
	}

}
