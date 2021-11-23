package day19_arrays;

import java.util.Arrays;

public class C02_Arrays02 {

	public static void main(String[] args) {
		// Soru 1: Elemanlari “Ali” , “Veli”, “Ayse” ve “Fatma” 
		// olan bir array olusturun ve bu  array’i yazdirin.

		// 1. yöntem: önce oluþturup sonra istediðim indekslere deger atýyorum
		String isimler [] = new String [4];
		isimler [0] = "Ali";
		isimler [1] = "Veli";
		isimler [2] = "Ayþe";
		isimler [3] = "Fatma";
		
		System.out.println(Arrays.toString(isimler));
		// 2. yontem: hem oluþturup hemde tüm indekslere deger atýyorum
		
		String isimler2 [] = {"Ali", "Veli", "Ayþe", "Fatma"};
		
		//isimmler arrayindeki veli yerine hasan yazalým
		isimler[1] = "Hasan";
		
		// isimler[5] = "Hakan"; // Array run time da oluþturulur dolayýsýyla 
		// java 5. index varmý yokmu bilmiyor.
		// Syntex acýsýndan sorun olmadýgý için cte hatasý vermez
		// run ettiðimizde 5. indexi bulamadýgý için Run Time Error verecekktir.
		
		System.out.println(isimler.length);// 4
		System.out.println(isimler[3]); // fatma
		System.out.println(isimler2[1]); // veli
		System.out.println(isimler[1]); // hasan
		
		// Tüm elemanlarý yazdýrma:
		// 1.yol loop kullanma
		// sadece degerleri yazdýrmýþ olduk
		
		for (int i = 0; i < isimler2.length; i++) {
			System.out.print(isimler2[i] + " ");
			
		}
		
		System.out.println(" ");
		
		// 2. yol Arrays classýndan yardým alýrýz:
		
		System.out.println(Arrays.toString(isimler));
		
		
		
		
		
 		
		
	}

}
