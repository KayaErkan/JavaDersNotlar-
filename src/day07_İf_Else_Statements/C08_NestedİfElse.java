package day07_�f_Else_Statements;

import java.util.Scanner;

public class C08_Nested�fElse {

	public static void main(String[] args) {
		
		// Kullanicidan cinsiyet ve yas aliniz
		// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
		// calisan erkekse 65 yasindan buyukse emekli olabilir yazdirin
		// emekli olamayacaksa emekli olamazsin daha ... yil calisman lazim yazdirin
		
		
         Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen cinsiyetinizi giriniz \nErkek i�in E,Kad�n i�in K giriniz");
		
		char cinsiyet = scan.next().toUpperCase().charAt(0);
		
		System.out.println("L�tfen Ya��n�z� tam say� olarak giriniz");
		
		int yas = scan.nextInt();
		
		if(cinsiyet == 'K') {// kad�nsa demek
			
			if(yas >= 60) {
				System.out.println("Emekli olabilirsin");
			}else {
				System.out.println("Emekli olamazs�n \nDaha " + (60-yas) + "y�l cal�smal�s�n");
				}
		}else if (cinsiyet == 'E'){ // erkekse demek
			if (yas >= 65) {
				System.out.println("Emekli olabilirsin");
			}else {
				System.out.println("Emekli olamazs�n \nDaha " + (60-yas) + "y�l cal�smal�s�n");
			}
		}else {// yanl�� giri�
			System.out.println("L�tfen Erkek i�in E,Kad�n i�in K giriniz");
		}
		
		
		

	}

}
