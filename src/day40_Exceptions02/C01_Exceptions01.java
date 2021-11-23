package day40_Exceptions02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_Exceptions01 {

	public static void main(String[] args) {
		// javaya bir dosyay� okumas�n� veya dosyaya yazmas�n� s�yledi�imizde
		// Java "ya dosyay� bulamazsam" der ve bizden ��z�m �retmemizi bekler
		// dossya bulma ile ilgili except�on t�r� : FileNotFoundException d�r
		// java kodu yazar yazmaz buradaki oals� problemi g�r�r ve cte verir
		// kodumuzu yazd�g�m�z anda ortaya ��kan bu tip exception'lara 
		//Checked except�on denir.
		
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\ERKAN\\eclipse-workspace\\java2021SummerTr\\src\\day40_Exceptions02\\File");
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();// t�m hata a��klamalar�n� yazd�r�r ama kod bloke olmaz
			System.out.println(e.getMessage());// daha az hata ac�klamas� yazd�r�r
		}
		
		System.out.println("kod bloke olmam�s");
		
		
		
		
		
		
	}

}
