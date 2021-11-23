package day18_doWhileLoopScope;

import java.util.Scanner;

public class C03_DoWhileLoop02 {

	public static void main(String[] args) {
		/*
		 * Soru 3) Kullanicidan toplamak uzere pozitif sayilar isteyin, 
		 * islemi bitirmek icin 0�a basmasini soyleyin.
 
 			Kullanici 0�a bastiginda toplam kac pozitif sayi girdigini ve 
 			girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
 			kullan�c� negatif sayi girerse ignore edin
		 */

		// bankac�l�kta kullan�lan men� uygulamalar� while loop ile yap�l�r!!!
		
		Scanner scan = new Scanner(System.in);
	
		double sayi = 5;
		int count = 0;
		double say�larToplam� = 0;
		
		do {
			System.out.println("l�tfen toplamak i�in pozitif say�lar giriniz " 
					+"\nislemi bitirmek i�in 0'a bas�n ");
			sayi = scan.nextDouble();
			// kullan�c�dan ald���m say�y� pozitif mi diye konntrol etmeliyiz
			if (sayi > 0) {
				say�larToplam� += sayi;
				count++;
			}else if(sayi < 0 ){ System.out.println("pozitif say� girmeliydiniz" 
					+ "\nbu say� negatif oldugu i�in yok say�yorum");
			}
			
		}
		while(sayi != 0.0);
		
		System.out.println("girdi�iniz say�lardan " + count + " tanesi pozitif idi"
				+"\nve pozitif sayilar�n toplam� " + say�larToplam�);
		
	}

}
