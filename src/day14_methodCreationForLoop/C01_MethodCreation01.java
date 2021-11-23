package day14_methodCreationForLoop;

import java.util.Scanner;

public class C01_MethodCreation01 {

	public static void main(String[] args) {
		// Soru 1 ) Kullanicidan bir sayi alin.
		//Bu sayinin tek mi cift mi oldugunu, 
		//sifirdan buyuk mu kucuk mu oldugunu, 
		//ayrica ve 100�den buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		//100�den kucukse sadece 1�ler basamagini 
		//yazdiran 3 method olusturun.

		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir tamsay� yaz�n�z");
		int sayi = scan.nextInt();
		
		tekMiCiftMiYazd�r(sayi);
		sifirlaKarsilastir(sayi);
		istenenBasamaklar�Yazddir(sayi);
		
	}

	public static void istenenBasamaklar�Yazddir(int sayi) {
		if (sayi < 100) {
			System.out.println("girdi�iniz sayinin birler basama�� : " +  (sayi %10));
		}else {
			int rakamlarToplami=0;
			int rakam = 0;
			rakam  = sayi% 10;
			rakamlarToplami += rakam;
			sayi/=10;
			
			rakam = sayi%10;
			rakamlarToplami += rakam;
			sayi /= 10;
			
			rakam = sayi % 10;
			rakamlarToplami+=rakam;
	
			System.out.println("Say�n�n birler,onlar y�zler basama��ndaki rakamlar toplam� : " + rakamlarToplami);	
			
		}
		
	}

	public static void sifirlaKarsilastir(int sayi) {
		if(sayi > 0 ) {
			System.out.println("girilen say� pozitif");
		}else if (sayi < 0 ) {
			System.out.println("girilen say� negatif");
		}else {
			System.out.println("0 say�s� pozitif yada negatif degildir ");
		}
		
	}

	public static void tekMiCiftMiYazd�r(int sayi) {
		if (sayi % 2 == 0) {
			System.out.println("Girilen say� cift bir sayidir");
		}else {
			System.out.println("Girilen say� tek say�d�r");
		}
		
		
		
		
		
		
		
		
	}

}
