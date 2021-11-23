package day02_variablesscanner;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		
		// 1- kullanýcýdan iki tam sayý alýp bu sayýlarýn toplam,fark ve çarpýmlarýný yazdýrýn
		
		//kullanýcýdan deðer almak için 3 addým atmalýyýz
		// Scanner objesi oluþtururuz
		Scanner scan = new Scanner(System.in); 
		
		// ikinci adým kullanýcýdan ne istediðimizi yazdýralým
		System.out.println("Lütfen iki tam sayý giriniz");
		
		// 3.adým next metodunu kullanarak girilen deðerleri alýp oluþturacaðýmýz variable lara atayalým
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println("girdiðiniz sayýlarýn toplamý : " + (sayi1 + sayi2));
		System.out.println("girdiðiniz sayýlarýn farký : " + (sayi1 - sayi2));
		System.out.println("girdiðiniz sayýlarýn carpýmý : " + (sayi1 * sayi2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
