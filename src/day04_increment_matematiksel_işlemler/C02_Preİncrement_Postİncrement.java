package day04_increment_matematiksel_işlemler;

public class C02_Preİncrement_Postİncrement {

	public static void main(String[] args) {
		
		int sayi1=20;
		
		int sayi2 = ++sayi1;
		
		System.out.println("Pre-İncrement sayi1 : " + sayi1);
		System.out.println("Pre-İncrement sayi2 : " + sayi2);
		
		
		 sayi2 = sayi1++;
		
		System.out.println("Post-İncrement sayi1 : " + sayi1); // 22
		System.out.println("Post-İncrement sayi2 : " + sayi2); // 21
		
		
		
		int sayi3 = 10;
		
		System.out.println("Pre-İncrement : " + ++sayi3);// 11
		
		System.out.println("Post-İncrement : " + sayi3++); // 11
		
		System.out.println("Post-İncremenet'tan sonra sayi3 : " + sayi3); // 12
		 
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
