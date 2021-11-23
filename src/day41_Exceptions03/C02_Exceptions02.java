package day41_Exceptions03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_Exceptions02 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\ERKAN\\eclipse-workspace\\java2021SummerTr\\src\\day40_Exceptions02\\File");
		
		/*
		 try-catch blogu exception ile handle etmekte kullanýlýr
		 throws keyword u ise sadece declaratýon dýr dolayýsýyla
		 throws kullanýlan bir method da exception olusursa KOD BLOKE olur
		 */
		int k = 0;
		
		while ((k = fis.read()) != -1) {
			System.out.print((char)k);
			}
		
		/*
		 eger birden fazla exception için throws keywordu kullanacaksak 
		 yazacagýnýz exceptionlarýn arasýndaki iliþki ve sýralama önemli olur 
		 egerr yazdýgýmýz exceptionlar arasýnda parent-child iliþkisi varsa
		 once child exception yazýlmalýdýr.
		 Aksi takdirde child exception eriþilemez olur.
		 
		 eger yazacakalrýmýz arasýnda parent-child iliþkisi varsa
		 istersek sadece parenti yazmamýz da yeterli olur.
		 */
	}

}
