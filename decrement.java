package day3;

public class decrement {

	public static void main(String[] args) {
		int  age=20;
		age--;//20
		--age;//18
		--age;//17
		
		System.out.println(age+(--age)+(age--)-(age--));
		                   //17+17+17-16
		System.out.println(17+16+16-15);
	}

}
