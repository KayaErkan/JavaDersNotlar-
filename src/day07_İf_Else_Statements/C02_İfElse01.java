package day07_Ýf_Else_Statements;

import java.util.Scanner;

public class C02_ÝfElse01 {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin
		//        ve dikdortgenin kare olup olmadigini yazdirin
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen diktorgenin kenarlarýný giriniz \nýlk kenarý yyazýnca ENTER'a basýnýz");
		
		double kenar1 = scan.nextDouble();
		double kenar2 =scan.nextDouble();
		
		if (kenar1 == kenar2) {
			System.out.println("Girdiðiniz diktorgen kare");
		}else {
			System.out.println("Girdiðiniz diktorgen kare deðil");
		}
		
		
		
		scan.close();
		
		
		
		
		
		
		

	}

}
