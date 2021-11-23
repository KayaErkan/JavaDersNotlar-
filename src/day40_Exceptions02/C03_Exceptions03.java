package day40_Exceptions02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_Exceptions03 {

	public static void main(String[] args) {
		
		/*
		 iç içe try catch yerine 1 tane try ve multiple catch blogu kullanabiliriz.
		 Ancak bu durumda yazdýgýmýz exceptionlar arasýnda parent ve child
		 iliþkisi varsa once child classý yazmalýyýz.
		 Aksi takdirde (yani önce parent yazýlýrsa) child class'a iþ kalmaz. 
		 java eriþilemez catch blogu diyerek cte verir.
		 */
		
		
	try {
			FileInputStream fis = new FileInputStream("C:\\Users\\ERKAN\\eclipse-workspace\\java2021SummerTr\\src\\day40_Exceptions02\\File");
			int k = 0;
			
				while ((k = fis.read()) != -1) {
				System.out.print((char)k);
				}
			} catch (FileNotFoundException e) {// önce child exceptionu yazdýk
				                     
			e.printStackTrace();
			
	}catch (IOException e) { // sonra parent exceptionu yazdýk
			
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("kod bloke olmamýs");
	}

}
