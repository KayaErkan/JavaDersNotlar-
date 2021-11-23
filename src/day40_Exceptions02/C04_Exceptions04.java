package day40_Exceptions02;

import java.io.FileInputStream;
import java.io.IOException;

public class C04_Exceptions04 {

	public static void main(String[] args) {
		/*
		  Eger handle edilecek exceptionlar aras�nda parent-child ili�kisi varsa
		  bu durum da child exception i�in catch blogu yazmasak da kodumuz cal���r
		  child except�on'i silmenin;
		  pozitif yani: tek catch blogu ile tum except�onlar handle edilebilir
		  negatif y�n�: bir sorunla kars�last�g�m�zda bunun dosya bulunmad�g� i�in mi
		  yoksa dosya okunamad�g� i�in mi oldugu anla��lamaz
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
		
		System.out.println("kod bloke olmam�s");
	}
	}


