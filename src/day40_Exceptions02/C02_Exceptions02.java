package day40_Exceptions02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_Exceptions02 {

	public static void main(String[] args) {
		
		/*
		 eger kodumuzu yazd�g�m�zda birden fazlaexception'la ili�kili duurm olusuyorsa
		 i�i�e try-catch bloklar� olusturabiliriz.
		 bu ornekte ilk �nce dosyay� okutmak istedik java ya dosyay� bulamazsam
		 diye bizden yard�m istedi
		 Biz de try-catch blogu ile FileNotFoundException ile 
		 handle etmesinde yard�mc� olduk.
		 sonra dosyadaki yaz�lar� okumaya cal��t�k ve java yeniden "ya dosyay� okuyamazsam"
		 diye yard�m istedi
		 biz de try catch blogu ile IOException ile handle etmesini saglad�k.
		 
		*/
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\ERKAN\\eclipse-workspace\\java2021SummerTr\\src\\day40_Exceptions02\\File");
			int k = 0;
			try {
				while ((k = fis.read()) != -1) {
				System.out.print((char)k);
				}
			} catch (IOException e) {// dosyalarla ilgili genel okuma ve 
				                     // yazma sorunlar� ile handle eder
			
			e.printStackTrace();
			}
		
		
		} catch (FileNotFoundException e) {
			
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("kod bloke olmam�s");

	}

}
