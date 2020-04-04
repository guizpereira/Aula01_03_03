package aula4.adsm.ex61;

import java.util.Calendar;

public class Sorteador {
	public void mensagemDoDia() {
		Calendar c = Calendar.getInstance();
		
		MensagemDoDia h = null;
		
		if(c.get(Calendar.DAY_OF_WEEK) == 1) {
			h = new Domingo();
		}
		
		if(c.get(Calendar.DAY_OF_WEEK) == 2) {
			h = new Segunda();
		}
		
		if(c.get(Calendar.DAY_OF_WEEK) == 3) {
			h = new Terca();
		}
		
		if(c.get(Calendar.DAY_OF_WEEK) == 4) {
			h = new Quarta();
		}
		
		if(c.get(Calendar.DAY_OF_WEEK) == 5) {
			h = new Quinta();
		}
		
		if(c.get(Calendar.DAY_OF_WEEK) == 6) {
			h = new Sexta();
		}
		
		if(c.get(Calendar.DAY_OF_WEEK) == 7) {
			h = new Sabado();
		}
		
		System.out.println(h.mensagemDeHoje());
	}

}
