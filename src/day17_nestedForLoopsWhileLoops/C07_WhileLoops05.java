package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;


public class C07_WhileLoops05 {

	public static void main(String[] args) {
		/*
		 Kullan�c�dan toplamak �zere say� isteyin
		 toplam 200 oluncaya kadar sayi istemeye devam edin
		 toplam 200 � gecti�inde
		 kullan�c�n�n kka� say� girdi�ini ve bu say�lar�n toplam�n� yazd�r�n
 		 */
		// For loop ta bir i�lem yapabilmek i�in tekrar say�s�n� bilmek laz�m
		// While loop da ise ad�m say�s� de�il bitirme kosulu oneml�d�r
		
		Scanner scan = new Scanner (System.in);
		
		
		int sayi = 0;
		int toplam = 0;
		int sayac = 0;
		
		while (toplam<200) {
			System.out.println("L�tfen toplamak i�in bir tam say� girin");
			sayi = scan.nextInt();
			toplam += sayi;
			sayac++;
		}
		
		// toplam�n 200 � gecti�inden eminiz
		
		System.out.println("toplam " + sayac + " adet say� girdiniz ve bu say�lar�n toplam� : " + toplam);
		
		// *** eger ad�m saay�s� bilinmiyor veya �ng�rulem�yorsa
		// foor loop de�il do while loop kullanmak daha mant�kl�d�r
		// eger ad�mlar belli ise for loop kullanmak daha mant�kl� oolabillir
		//iki fazla sat�r  yazmakta,
		// veya de�i�imi unutup sonsuz loop'a girmekten kurtulmu� oluruz.
		
	
		
	
	}

}
