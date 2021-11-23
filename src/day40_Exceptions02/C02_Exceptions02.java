package day40_Exceptions02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_Exceptions02 {

	public static void main(String[] args) {
		
		/*
		 eger kodumuzu yazdýgýmýzda birden fazlaexception'la iliþkili duurm olusuyorsa
		 içiçe try-catch bloklarý olusturabiliriz.
		 bu ornekte ilk önce dosyayý okutmak istedik java ya dosyayý bulamazsam
		 diye bizden yardým istedi
		 Biz de try-catch blogu ile FileNotFoundException ile 
		 handle etmesinde yardýmcý olduk.
		 sonra dosyadaki yazýlarý okumaya calýþtýk ve java yeniden "ya dosyayý okuyamazsam"
		 diye yardým istedi
		 biz de try catch blogu ile IOException ile handle etmesini sagladýk.
		 
		*/
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\ERKAN\\eclipse-workspace\\java2021SummerTr\\src\\day40_Exceptions02\\File");
			int k = 0;
			try {
				while ((k = fis.read()) != -1) {
				System.out.print((char)k);
				}
			} catch (IOException e) {// dosyalarla ilgili genel okuma ve 
				                     // yazma sorunlarý ile handle eder
			
			e.printStackTrace();
			}
		
		
		} catch (FileNotFoundException e) {
			
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("kod bloke olmamýs");

	}

}
