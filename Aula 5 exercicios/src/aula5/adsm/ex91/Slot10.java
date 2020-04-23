package aula5.adsm.ex91;

public class Slot10 implements Slot{

	private Slot slot;
	
	public Slot10() {
	};
	
	@Override
	public double recebeMoeda(int moeda) {
		if (moeda == 10) {
			System.out.println("-- Recebeu  R$0,10");
			return 0.1;
		}else {
			return this.slot.recebeMoeda(moeda);
		}	
	}

	@Override
	public void setSlot(Slot s) {
		this.slot = s;
		
	}

}
