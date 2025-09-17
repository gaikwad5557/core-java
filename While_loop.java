package day3;

public class While_loop {

	public static void main(String[] args) {
		int i=0;
		while(i<=5)
		{
			System.out.println("hii");
			i++;
			
		}
		
		
		
		//divisible by 10
		
		int num=1;
		while(num<=1000)
		{
	      if (num%10==0)
	      {
	    	  System.out.println(num + "is divisible by 10");
	     
	      }  
	      
	      num++;
	      
		}
		
		
		
		
		//table of 15
		
		int tab=15;
		int j=1;
		while(j<=10)
		{
			System.out.println(tab*j);
			j++;
			
		}
		
		
		
		
		
		
		//table of 1 to10
		
		
		int t=1;
		while(t<=10)
		{
			System.out.println("table is of:"+t);
			int m=1;
			while(m<=10)
			{
				
				System.out.println(t+"*"+m+"="+(t*m));
				m++;
				
			}
			
			t++;
		}
		
		
		
		
		//square of 100 numbers
		
		int s=1;
		while (s<=100)
		{
			System.out.println(s+"="+(s*s));
			s++;
		}
	}

}
