package day03_datacasting_increment;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {
		
		/* kullan�c�dan ismini ve soyismini isteyip a�a��daki �ekilde yazd�r�n
		 * isminiz:
		 * soyisminiz:
		 * kursumuza kat�l�m�n�z alinmistir, tesekk�r ederiz.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi ve soyisminizi yaz�n�z,\nisminizi yazd�ktan sonra ENTER a bas�n�z");
		
		// syso i�inde alt sat�ra ge�mek istedi�imizde \n yaz�l�r.
		// \n den sonra bo�luk b�rak�rsak ikinci sat�r�n ba��nda bo�luk olmu� olur
		
		String name =scan.nextLine();
		String surname = scan.nextLine();
		
		// next --> sadece ilk kelimeyial�r,girilen de�er daha uzunsa ilk kkelimeden sonras� yaz�lamam�� olur
		//nextLine--> sat�r�n onuna kadar girilen t�m de�erleri al�r.
		
		System.out.println("�sminiz : " + name +"\nSoyisminiz : " + surname + "\nkursumuza kat�l�m�n�z alinmistir, tesekk�r ederiz");
		
		scan.close(); // bnunu yaz�nca bundan sonraki i�lemlerde scan kullan�lmaz yani scan'i kapatm�� oluruz..
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
