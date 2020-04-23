package aula5.adsm.ex92;

public class Handler {
	private Handler handler;
	private String nome;
	private long ultimoProcesso;
	
	public Handler(Handler handler, String nome) {
		this.handler = handler;
		this.nome = nome;
	}
	
	public Handler(String nome) {
		this.nome = nome;
	}

	public Handler getHandler() {
		return handler;
	}

	public String getNome() {
		return nome;
	}

	public long getUltimoProcesso() {
		return ultimoProcesso;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setUltimoProcesso(long ultimoProcesso) {
		this.ultimoProcesso = ultimoProcesso;
	}
	
	public void processa() {
		long novoTempo = System.currentTimeMillis();
		if(novoTempo - this.ultimoProcesso < 3) {
			System.out.println("Handler "+ nome + " ocupado. Enviando para Handler " + this.handler.getNome());
			this.handler.processa();
		} else {
			this.ultimoProcesso = novoTempo;
			System.out.println(" Handler " + nome + " processou");
		}
		
	}
	
}
