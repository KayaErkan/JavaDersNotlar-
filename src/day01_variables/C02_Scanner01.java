package day01_variables;

import java.util.Scanner;

public class C02_Scanner01 {

	public static void main(String[] args) {
		
		// kullan�c�dan bilgi almak i�in 3 ad�ma ihtiya� var
		// 1- Scannerclass�ndan bir object olu�turuyoruz
		
		Scanner scan = new Scanner(System.in);
		
		// 2- kullan�c�ya ne istedi�imizi bildiren bir mesaj yaz�n
		
		System.out.println("L�tfen �sminizi Giriniz");
		
		// kullan�c�dan istedi�imiz bilginin data t�r�ne g�re
		// bir variable olusturup konsolda yaz�lan bilgiyi kodlar�m�z�n i�ine al�yoruz
		
		String kullan�c�n�n�smi = scan.nextLine();
		
		System.out.println("Girddi�iniz isim : " + kullan�c�n�n�smi );
		
		
		
		
		
		
		
		
	

	}

}
