package day3;

public class Logicalop1 {

	public static void main(String[] args) {
		
		int age=20;
		int age2=25;
		int age3=30;
		
		System.out.println(age<age2);
		System.out.println(age2>age3);
		
		System.out.println("****************");
		
		System.out.println(age<age2&&age2>age3);
		
		
		double bankbalance = 540000.560;
		System.out.println("condition statify if true?");
		System.out.println(bankbalance>300000&& bankbalance>400000&& bankbalance<600000);
		

	}

}
