package day40_Exceptions02;

import java.io.FileInputStream;
import java.io.IOException;

public class C04_Exceptions04 {

	public static void main(String[] args) {
		/*
		  Eger handle edilecek exceptionlar arasýnda parent-child iliþkisi varsa
		  bu durum da child exception için catch blogu yazmasak da kodumuz calýþýr
		  child exceptýon'i silmenin;
		  pozitif yani: tek catch blogu ile tum exceptýonlar handle edilebilir
		  negatif yönü: bir sorunla karsýlastýgýmýzda bunun dosya bulunmadýgý için mi
		  yoksa dosya okunamadýgý için mi oldugu anlaþýlamaz
		 */
		
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\ERKAN\\eclipse-workspace\\java2021SummerTr\\src\\day40_Exceptions02\\File");
			int k = 0;
			
				while ((k = fis.read()) != -1) {
				System.out.print((char)k);
				}
			}
			
	    catch (IOException e) { 

			System.out.println(e.getMessage());
		}
		
		System.out.println("kod bloke olmamýs");
	}
	}


