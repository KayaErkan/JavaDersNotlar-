package day19_arrays;

import java.util.Arrays;

public class C02_Arrays02 {

	public static void main(String[] args) {
		// Soru 1: Elemanlari �Ali� , �Veli�, �Ayse� ve �Fatma� 
		// olan bir array olusturun ve bu  array�i yazdirin.

		// 1. y�ntem: �nce olu�turup sonra istedi�im indekslere deger at�yorum
		String isimler [] = new String [4];
		isimler [0] = "Ali";
		isimler [1] = "Veli";
		isimler [2] = "Ay�e";
		isimler [3] = "Fatma";
		
		System.out.println(Arrays.toString(isimler));
		// 2. yontem: hem olu�turup hemde t�m indekslere deger at�yorum
		
		String isimler2 [] = {"Ali", "Veli", "Ay�e", "Fatma"};
		
		//isimmler arrayindeki veli yerine hasan yazal�m
		isimler[1] = "Hasan";
		
		// isimler[5] = "Hakan"; // Array run time da olu�turulur dolay�s�yla 
		// java 5. index varm� yokmu bilmiyor.
		// Syntex ac�s�ndan sorun olmad�g� i�in cte hatas� vermez
		// run etti�imizde 5. indexi bulamad�g� i�in Run Time Error verecekktir.
		
		System.out.println(isimler.length);// 4
		System.out.println(isimler[3]); // fatma
		System.out.println(isimler2[1]); // veli
		System.out.println(isimler[1]); // hasan
		
		// T�m elemanlar� yazd�rma:
		// 1.yol loop kullanma
		// sadece degerleri yazd�rm�� olduk
		
		for (int i = 0; i < isimler2.length; i++) {
			System.out.print(isimler2[i] + " ");
			
		}
		
		System.out.println(" ");
		
		// 2. yol Arrays class�ndan yard�m al�r�z:
		
		System.out.println(Arrays.toString(isimler));
		
		
		
		
		
 		
		
	}

}
