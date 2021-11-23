package day03_datacasting_increment;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {
		
		/* kullanýcýdan ismini ve soyismini isteyip aþaðýdaki þekilde yazdýrýn
		 * isminiz:
		 * soyisminiz:
		 * kursumuza katýlýmýnýz alinmistir, tesekkür ederiz.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi ve soyisminizi yazýnýz,\nisminizi yazdýktan sonra ENTER a basýnýz");
		
		// syso içinde alt satýra geçmek istediðimizde \n yazýlýr.
		// \n den sonra boþluk býrakýrsak ikinci satýrýn baþýnda boþluk olmuþ olur
		
		String name =scan.nextLine();
		String surname = scan.nextLine();
		
		// next --> sadece ilk kelimeyialýr,girilen deðer daha uzunsa ilk kkelimeden sonrasý yazýlamamýþ olur
		//nextLine--> satýrýn onuna kadar girilen tüm deðerleri alýr.
		
		System.out.println("Ýsminiz : " + name +"\nSoyisminiz : " + surname + "\nkursumuza katýlýmýnýz alinmistir, tesekkür ederiz");
		
		scan.close(); // bnunu yazýnca bundan sonraki iþlemlerde scan kullanýlmaz yani scan'i kapatmýþ oluruz..
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
