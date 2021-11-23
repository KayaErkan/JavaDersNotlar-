package day07_Ýf_Else_Statements;

import java.util.Scanner;

public class C08_NestedÝfElse {

	public static void main(String[] args) {
		
		// Kullanicidan cinsiyet ve yas aliniz
		// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
		// calisan erkekse 65 yasindan buyukse emekli olabilir yazdirin
		// emekli olamayacaksa emekli olamazsin daha ... yil calisman lazim yazdirin
		
		
         Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen cinsiyetinizi giriniz \nErkek için E,Kadýn için K giriniz");
		
		char cinsiyet = scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lütfen Yaþýnýzý tam sayý olarak giriniz");
		
		int yas = scan.nextInt();
		
		if(cinsiyet == 'K') {// kadýnsa demek
			
			if(yas >= 60) {
				System.out.println("Emekli olabilirsin");
			}else {
				System.out.println("Emekli olamazsýn \nDaha " + (60-yas) + "yýl calýsmalýsýn");
				}
		}else if (cinsiyet == 'E'){ // erkekse demek
			if (yas >= 65) {
				System.out.println("Emekli olabilirsin");
			}else {
				System.out.println("Emekli olamazsýn \nDaha " + (60-yas) + "yýl calýsmalýsýn");
			}
		}else {// yanlýþ giriþ
			System.out.println("Lütfen Erkek için E,Kadýn için K giriniz");
		}
		
		
		

	}

}
