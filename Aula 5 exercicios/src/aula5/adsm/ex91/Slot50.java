package aula5.adsm.ex91;

public class Slot50 implements Slot{

	private Slot slot;
	
	public Slot50() {
	};
	
	@Override
	public double recebeMoeda(int moeda) {
		if (moeda == 50) {
			System.out.println("-- Recebeu  R$0,50");
			return 0.5;
		}else {
			return this.slot.recebeMoeda(moeda);
		}	
	}

	@Override
	public void setSlot(Slot s) {
		this.slot = s;
		
	}


}
