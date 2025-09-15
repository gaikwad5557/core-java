package day3;

public class Else_if2 {

	public static void main(String[] args) {
		double price = 1000;
		if (price >=5000 && price <= 10000)
		{
			System.out.println("5% discount");
			double discount = price * 0.05;
			System.out.println("off price :"+discount);
			double cost = price - discount;
			System.out.println("after discount:"+ cost);
		}
		else if (price > 10000 && price <= 15000)
		{
			System.out.println("10% discount");
			double discount = price * 0.10;
			System.out.println("off price:"+discount);
			double cost = price - discount;
			System.out.println("after discount:" + cost);
		}
		else if (price > 15000)
		{
			System.out.println("20% discount");
			double discount = price * 0.20;
			System.out.println("off price:" +discount);
			double cost = price - discount;
			System.out.println("after discount:" + cost);
			
		}
		else 
		{
			System.out.println("no any discount");
		}
	}

}               
