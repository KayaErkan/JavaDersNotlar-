package day40_Exceptions02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_Exceptions01 {

	public static void main(String[] args) {
		// javaya bir dosyayý okumasýný veya dosyaya yazmasýný söylediðimizde
		// Java "ya dosyayý bulamazsam" der ve bizden çözüm üretmemizi bekler
		// dossya bulma ile ilgili exceptýon türü : FileNotFoundException dýr
		// java kodu yazar yazmaz buradaki oalsý problemi görür ve cte verir
		// kodumuzu yazdýgýmýz anda ortaya çýkan bu tip exception'lara 
		//Checked exceptýon denir.
		
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\ERKAN\\eclipse-workspace\\java2021SummerTr\\src\\day40_Exceptions02\\File");
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();// tüm hata açýklamalarýný yazdýrýr ama kod bloke olmaz
			System.out.println(e.getMessage());// daha az hata acýklamasý yazdýrýr
		}
		
		System.out.println("kod bloke olmamýs");
		
		
		
		
		
		
	}

}
