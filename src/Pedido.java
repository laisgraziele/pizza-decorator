
public class Pedido {
	
	public static void main(String[] args) {
		
		Pizza pizza = new PizzaDoisSabores();
		pizza = new Calabresa(pizza);
		pizza = new Portuguesa(pizza);
		
		
		infoPedido(pizza);
		
		 
	}
	
	public static void infoPedido(Pizza pizza) {
		
		System.out.println("O pedido " + pizza.getNome() + " de tamanho: " + pizza.getTamanho() + " foi recebido e deu o Total: " + pizza.getPreco());
	}
	

}
