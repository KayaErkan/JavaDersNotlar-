package day09_SwitchCase;

import java.util.Scanner;

public class C02_SwitchCase02 {

	public static void main(String[] args) {
		/*Soru3 : Kullanicidan bir sayi girmesini isteyin
 		Girilen sayi
 		10 ise “Iki basamakli en kucuk sayi 
 		100 ise “uc basamakli en kucuk sayi”
 		1000 ise “dort basamakli en kucuk sayi”
 		diger durumlarda “Girdigin sayiyi degistir” yazdirin
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayý giriniz");
		int sayi = scan.nextInt();

		switch (sayi) {
			case 10:
				System.out.println("Ýki basamakli en küçük sayý");
				break;
			case 100:
				System.out.println("Uc basamaklý en kucuk sayý");
				break;
			case 1000:
				System.out.println("Dort basamaklý en kucuk sayý");
				break;
			default:
				System.out.println("Girdiðin sayýyý deðiþtir");
		}
		
		
		
		
		
		
		
		

	}

}
