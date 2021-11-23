package day40_Exceptions02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_Exceptions03 {

	public static void main(String[] args) {
		
		/*
		 i� i�e try catch yerine 1 tane try ve multiple catch blogu kullanabiliriz.
		 Ancak bu durumda yazd�g�m�z exceptionlar aras�nda parent ve child
		 ili�kisi varsa once child class� yazmal�y�z.
		 Aksi takdirde (yani �nce parent yaz�l�rsa) child class'a i� kalmaz. 
		 java eri�ilemez catch blogu diyerek cte verir.
		 */
		
		
	try {
			FileInputStream fis = new FileInputStream("C:\\Users\\ERKAN\\eclipse-workspace\\java2021SummerTr\\src\\day40_Exceptions02\\File");
			int k = 0;
			
				while ((k = fis.read()) != -1) {
				System.out.print((char)k);
				}
			} catch (FileNotFoundException e) {// �nce child exceptionu yazd�k
				                     
			e.printStackTrace();
			
	}catch (IOException e) { // sonra parent exceptionu yazd�k
			
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("kod bloke olmam�s");
	}

}
