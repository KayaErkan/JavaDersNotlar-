package day09_SwitchCase;

import java.util.Scanner;

public class C02_SwitchCase02 {

	public static void main(String[] args) {
		/*Soru3 : Kullanicidan bir sayi girmesini isteyin
 		Girilen sayi
 		10 ise �Iki basamakli en kucuk sayi 
 		100 ise �uc basamakli en kucuk sayi�
 		1000 ise �dort basamakli en kucuk sayi�
 		diger durumlarda �Girdigin sayiyi degistir� yazdirin
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam say� giriniz");
		int sayi = scan.nextInt();

		switch (sayi) {
			case 10:
				System.out.println("�ki basamakli en k���k say�");
				break;
			case 100:
				System.out.println("Uc basamakl� en kucuk say�");
				break;
			case 1000:
				System.out.println("Dort basamakl� en kucuk say�");
				break;
			default:
				System.out.println("Girdi�in say�y� de�i�tir");
		}
		
		
		
		
		
		
		
		

	}

}
