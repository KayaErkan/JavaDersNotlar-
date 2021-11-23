package day04_increment_matematiksel_iþlemler;

public class C02_PreÝncrement_PostÝncrement {

	public static void main(String[] args) {
		
		int sayi1=20;
		
		int sayi2 = ++sayi1;
		
		System.out.println("Pre-Ýncrement sayi1 : " + sayi1);
		System.out.println("Pre-Ýncrement sayi2 : " + sayi2);
		
		
		 sayi2 = sayi1++;
		
		System.out.println("Post-Ýncrement sayi1 : " + sayi1); // 22
		System.out.println("Post-Ýncrement sayi2 : " + sayi2); // 21
		
		
		
		int sayi3 = 10;
		
		System.out.println("Pre-Ýncrement : " + ++sayi3);// 11
		
		System.out.println("Post-Ýncrement : " + sayi3++); // 11
		
		System.out.println("Post-Ýncremenet'tan sonra sayi3 : " + sayi3); // 12
		 
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
