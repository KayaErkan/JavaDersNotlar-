package day04_increment_matematiksel_i�lemler;

public class C02_Pre�ncrement_Post�ncrement {

	public static void main(String[] args) {
		
		int sayi1=20;
		
		int sayi2 = ++sayi1;
		
		System.out.println("Pre-�ncrement sayi1 : " + sayi1);
		System.out.println("Pre-�ncrement sayi2 : " + sayi2);
		
		
		 sayi2 = sayi1++;
		
		System.out.println("Post-�ncrement sayi1 : " + sayi1); // 22
		System.out.println("Post-�ncrement sayi2 : " + sayi2); // 21
		
		
		
		int sayi3 = 10;
		
		System.out.println("Pre-�ncrement : " + ++sayi3);// 11
		
		System.out.println("Post-�ncrement : " + sayi3++); // 11
		
		System.out.println("Post-�ncremenet'tan sonra sayi3 : " + sayi3); // 12
		 
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
