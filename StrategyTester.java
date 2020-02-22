package Strategy_Design_Pattern_lab;

public class StrategyTester {

	public static void main(String[]args){


		ShoppingCart cart = new ShoppingCart();
		PaymentStrategy payment = new CreditCardStrategy("Credit card holder", "191923846", "1245","11/15");
		Item a = new Item("4567", 10);
		Item b = new Item("765123", 5);


		cart.addItem(a);
		cart.addItem(b);


		payment.pay(cart.calculateTotal());






	}






}
