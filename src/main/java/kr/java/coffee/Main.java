package kr.java.coffee;

import kr.java.coffee.dto.Product;

public class Main {

	public static void main(String[] args) {
		System.out.println("");
		
		Product p1 = new Product("A001"); 
		Product p2 = new Product("A001");
		
		System.out.println(p1);
		System.out.println(p2);

		if(p1.equals(p2)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		//이문장은 GitHub에서 작성
	}

}

