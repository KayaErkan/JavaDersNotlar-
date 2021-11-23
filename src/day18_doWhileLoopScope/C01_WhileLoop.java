package day18_doWhileLoopScope;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
		// kullan�c�dan iki pozitif say� isteyin
		// kullan�c� negatif say� girdi�inde 
		// girilen negatif say�lar� yok say�p yeniden deger isteyin
		// kullan�c� dogru giris yapt�g�nda "well done" ve say�lar�n carp�m�n� yazd�r�n
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("l�tfen iki pozitif tam say� giriniz");
		
		// �nce sart sonra i�lem olursa mecburen basta deger atad�k
		
		
		// say� atamas� yaparken de isttemedi�imiz degeri atayacaz  
		// c�nk� istedi�imiz de�eri verirsek loop �al��maz
		int sayi1 = 0;
		int sayi2 =0;
		// condition olarak parantez i�ine istemedi�imiz yani saglanmayacak olan durumu yazacaz
		// conditionu �u �ekilde de yapabilirdik (!(sayi1 > 0 && sayi2 > 0)) bu durumda �art� saglam�yor olacak
		
		while (sayi1 <= 0 || sayi2 <= 0) {
			sayi1 = scan.nextInt();
			sayi2 = scan.nextInt();
			if(sayi1 > 0 && sayi2 >0) {
				System.out.println("well done \ngirilen say�lar�n carp�m� : " + (sayi1*sayi2));
			}else {
				System.out.println("l�tfen iki pozitif tam say� girin");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
