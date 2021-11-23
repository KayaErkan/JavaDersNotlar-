package day41_Exceptions03;

import java.util.Scanner;

public class C01_Exceptions01 {

	public static void main(String[] args) {
		/*
		 Kullanýcýdan yasýný girmesini isteyin.
		 Kodunuzu kullanýcý sýfýrdan kucuk bir sayý girerse
		 Exception verecek þekilde yazýn.
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen yasýnýzý giriniz");
		int yas = scan.nextInt();
		
		if (yas > 0) {
			System.out.println("girdiginiz yas : " + yas);
		}else {
			throw new IllegalArgumentException();
		} 
		System.out.println("kod bloke olmamýs");
		
		/*
		 java ya bir exception throw etmek için throw ve new keyword'leri kullanýlýr
		 */
		
		/*
		 bu sekildee yazýlýrsa java exception throw eder ama
		 kodumuz da bloke olmus olur.
		 bloke olmasýný engellemek isterseniz ;
		 kodu try-catch ile surround yapabiliriz
		 */
		
		
	/* Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen yasýnýzý giriniz");
		int yas = scan.nextInt();
		
		try {
		if (yas > 0) {
			System.out.println("girdiginiz yas : " + yas);
		}else {
			throw new IllegalArgumentException();
		}
		}catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		System.out.println("kod bloke olmamýs");
		
	*/
		
		
		
		
		
		
		
		
	}

}
