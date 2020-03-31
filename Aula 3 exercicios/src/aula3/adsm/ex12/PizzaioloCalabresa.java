package aula3.adsm.ex12;

public class PizzaioloCalabresa implements Pizzaiolo{

	@Override
	public Pizza criarPizza() {
		return new PizzaCalabresa();
	}

	@Override
	public Calzone criarCalzone() {
		return new CalzoneCalabresa();
	}

}
