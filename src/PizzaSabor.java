
public abstract class PizzaSabor extends Pizza  {

	private Pizza pizza;
	
	public PizzaSabor(Pizza pizza) {
		
		this.pizza = pizza;
		this.setNome(pizza.getNome());
	}

	public Pizza getPizza() {
		return pizza;
	}

	


	
}
