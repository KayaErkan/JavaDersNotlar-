package day09_SwitchCase;

import java.util.Scanner;

public class C01_SwitchCase01 {

	public static void main(String[] args) {
		// Soru1 : Kullanicidan haftanin kacinci gunu oldugunu sorun
		// ve gun ismini yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Haftanýn kaçýncý gününde olduðunuzu giriniz");
		int günNo = scan.nextInt();

		switch (günNo) {
			case 1:
				System.out.println("Pazartesi günündesiniz");
				break;
			case 2 : 
				System.out.println("Salý Günündesiniz");
				break;
			case 3 :
				System.out.println("Çarþamba Günündesiniz");
				break;
			case 4:
				System.out.println("Perþembe Günündesiniz");
				break;
			case 5:
				System.out.println("Cuma Günündesiniz");
				break;
			case 6:
				System.out.println("Cumartesi Günündesiniz");
				break;
			case 7:
				System.out.println("Pazar Günündesiniz");
				break;
			default:
				System.out.println("Lütfen geçerli bir gün numarasý giriniz");
		}

	}

}
