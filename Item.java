package Strategy_Design_Pattern_lab;

public class Item {

	private String upcCode;
	private int price;


	public Item(String upc, int cost){
		upcCode = upc;
		price = cost;
	}


	public String getUpcCode(){
		return upcCode;
	}


	public int getPrice(){
		return price;
	}
}
