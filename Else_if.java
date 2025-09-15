package day3;

public class Else_if {

	public static void main(String[] args) {
		
		double marks =7.75 ;
		if (marks >= 7.75 && marks <= 10.00)
		{
			System.out.println("distinction");
		}
		else if (marks <7.75 && marks >= 6.75)
		{
			System.out.println("first class");
		}
		else if (marks < 6.75 && marks >= 6.00)
		{
			System.out.println("second class ");
		}
		else if (marks < 6.00 && marks >=4.5)
		{
			System.out.println("third class");
	     }
		else if(marks>10)
		{
			System.out.println("system error");
		}
		else
		{
			System.out.println("better luck next time");
		}

	}

}
