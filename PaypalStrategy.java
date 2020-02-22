package Strategy_Design_Pattern_lab;

public class PaypalStrategy implements PaymentStrategy {

	private String emailid;
	private String password;


	public PaypalStrategy(String email, String psw){

		emailid = email;
		password = psw;
	}


	@Override
	public void pay(int money) {
		System.out.println("Amount: $" + money + " paid using Paypal");
	}
}
