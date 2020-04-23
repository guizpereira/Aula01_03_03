package aula5.adsm.ex81.ex82;

public class Noticia {
	String textoNoticia;
	int dia;
	int mes;
	String topico;
	public Noticia(String textoNoticia, int dia, int mes, String topico) {
		super();
		this.textoNoticia = textoNoticia;
		this.dia = dia;
		this.mes = mes;
		this.topico = topico;
	}
	public String getTextoNoticia() {
		return textoNoticia;
	}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public String getTopico() {
		return topico;
	}
	public void setTextoNoticia(String textoNoticia) {
		this.textoNoticia = textoNoticia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public void setTopico(String topico) {
		this.topico = topico;
	}

	@Override
	public String toString() {
		return "Texto: " + textoNoticia + "\n" + "Data:" + dia + "/" + mes + ", Tópico: " + topico + "\n";
	}

}
