package day14_methodCreationForLoop;

import java.util.Scanner;

public class C01_MethodCreation01 {

	public static void main(String[] args) {
		// Soru 1 ) Kullanicidan bir sayi alin.
		//Bu sayinin tek mi cift mi oldugunu, 
		//sifirdan buyuk mu kucuk mu oldugunu, 
		//ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		//100’den kucukse sadece 1’ler basamagini 
		//yazdiran 3 method olusturun.

		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir tamsayý yazýnýz");
		int sayi = scan.nextInt();
		
		tekMiCiftMiYazdýr(sayi);
		sifirlaKarsilastir(sayi);
		istenenBasamaklarýYazddir(sayi);
		
	}

	public static void istenenBasamaklarýYazddir(int sayi) {
		if (sayi < 100) {
			System.out.println("girdiðiniz sayinin birler basamaðý : " +  (sayi %10));
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
	
			System.out.println("Sayýnýn birler,onlar yüzler basamaðýndaki rakamlar toplamý : " + rakamlarToplami);	
			
		}
		
	}

	public static void sifirlaKarsilastir(int sayi) {
		if(sayi > 0 ) {
			System.out.println("girilen sayý pozitif");
		}else if (sayi < 0 ) {
			System.out.println("girilen sayý negatif");
		}else {
			System.out.println("0 sayýsý pozitif yada negatif degildir ");
		}
		
	}

	public static void tekMiCiftMiYazdýr(int sayi) {
		if (sayi % 2 == 0) {
			System.out.println("Girilen sayý cift bir sayidir");
		}else {
			System.out.println("Girilen sayý tek sayýdýr");
		}
		
		
		
		
		
		
		
		
	}

}
