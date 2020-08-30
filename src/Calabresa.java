
public class Calabresa extends PizzaSabor {
	
	public Calabresa (Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getTamanho() {
		
		return this.getPizza().getTamanho();
	}

	@Override
	public double getPreco() {
		
		return 30.0 + this.getPizza().getPreco();
	}
	

}
