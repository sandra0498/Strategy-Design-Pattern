package Strategy_Design_Pattern_lab;

public class CreditCardStrategy implements PaymentStrategy{

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;


	public CreditCardStrategy(String n, String num, String cv, String exp){
		name = n;
		cardNumber = num;
		cvv = cv;
		dateOfExpiry = exp;

	}


	@Override
	public void pay(int money) {
		System.out.println("Amount: $" + money + " paid with credit card");

	}
}
