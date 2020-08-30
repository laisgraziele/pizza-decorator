
public class Portuguesa extends PizzaSabor {
	
	public Portuguesa (Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getTamanho() {
		
		return this.getPizza().getTamanho();
	}

	@Override
	public double getPreco() {
		
		return 35.0 + this.getPizza().getPreco();
	}
	

}
