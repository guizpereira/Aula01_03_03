package aula3.adsm.ex21;

public class Programa {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String[] lista = {"Guedes, Ericson", "James Gosling", "Naughton, Patrick"};
		//se nada for passado como parâmetro
		if(args.length == 0) {
			args = lista;
		}
		Nomes nomes = new Nomes(args);
	}

}
