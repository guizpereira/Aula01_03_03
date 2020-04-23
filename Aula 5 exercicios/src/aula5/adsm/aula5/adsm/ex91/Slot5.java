package aula5.adsm.ex91;

public class Slot5 implements Slot{

	private Slot slot;
	
	public Slot5() {
	};
	
	@Override
	public double recebeMoeda(int moeda) {
		if (moeda == 5) {
			System.out.println("-- Recebeu  R$0,05");
			return 0.05;
		}else {
			return this.slot.recebeMoeda(moeda);
		}	
	}

	@Override
	public void setSlot(Slot s) {
		this.slot = s;
		
	}

}


