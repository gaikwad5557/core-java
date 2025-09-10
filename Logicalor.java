package day3;

public class Logicalor {

	public static void main(String[] args) {
		
		
		int a=10;
		int b=20;
		int c=30;
		
		boolean A1= a<b;
		boolean A2= b<c;
		boolean A3= a<c;
		
		System.out.println(A1);
		System.out.println(A2);
		System.out.println(A3);
		
		System.out.println("@@@@@@@@@@@@@@@@@@");
		
		System.out.println(A1||A2||A3);
		                  //true||true||true
	}

}
