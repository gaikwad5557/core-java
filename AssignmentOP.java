package day3;

public class AssignmentOP {

	public static void main(String[] args) {
		//assignment operator
		int a = 10;
		System.out.println(a);
	    
		
		int b= 20;
		b+=5;  //shorthand operator/type of assignment operator
		       //b=b+5
		System.out.println(b);
		
		b-=3;
		System.out.println(b);
		
		
		b*=2;
		System.out.println(b);
		
		
		b/=2;
		System.out.println(b);
		
		
		b%=3;
		System.out.println(b);
		System.out.println(b++); // post increment
		                          //here print b 
		                          
		System.out.println(b);//here b+1

	}

}
