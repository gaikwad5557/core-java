package day3;

public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=20;
		++age;  //pre increment //21
		age++;  //post increment//21 then 22
		
		System.out.println(age +(++age)+(age++));
		                   //22+23+23
		System.out.println(age);
		
		

	}

}
