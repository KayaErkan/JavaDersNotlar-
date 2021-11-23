package day07_Ýf_Else_Statements;

import java.util.Scanner;

public class C07_ÝfElseÝF03 {

	public static void main(String[] args) {
		
		// Soru 7) Kullanicidan 100 uzerinden notunu isteyin. 
		// Not’u harf sistemine cevirip yazdirin. 
        // 50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A”
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen notunuzu giriniz");
		
		double not = scan.nextDouble();
		
		if(not < 0 || not > 100) {
			System.out.println("Lütfen gecerli bir not giriniz");
		}else if (not < 50) {
			System.out.println("Notunuz D");
		}else if (not <= 60 ) { // 21. satýr ile beraber düþündügünde 50-60 arasý oluyor
			System.out.println("Notunuz C");
		}else if (not <= 80) {// 21 ve 23 satýrla birlikte 60-80 arasý demek
			System.out.println("Notunuz B");
		}else {
			System.out.println("Notunuz A");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
