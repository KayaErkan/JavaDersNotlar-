package day41_Exceptions03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_Exceptions02 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\ERKAN\\eclipse-workspace\\java2021SummerTr\\src\\day40_Exceptions02\\File");
		
		/*
		 try-catch blogu exception ile handle etmekte kullan�l�r
		 throws keyword u ise sadece declarat�on d�r dolay�s�yla
		 throws kullan�lan bir method da exception olusursa KOD BLOKE olur
		 */
		int k = 0;
		
		while ((k = fis.read()) != -1) {
			System.out.print((char)k);
			}
		
		/*
		 eger birden fazla exception i�in throws keywordu kullanacaksak 
		 yazacag�n�z exceptionlar�n aras�ndaki ili�ki ve s�ralama �nemli olur 
		 egerr yazd�g�m�z exceptionlar aras�nda parent-child ili�kisi varsa
		 once child exception yaz�lmal�d�r.
		 Aksi takdirde child exception eri�ilemez olur.
		 
		 eger yazacakalr�m�z aras�nda parent-child ili�kisi varsa
		 istersek sadece parenti yazmam�z da yeterli olur.
		 */
	}

}
