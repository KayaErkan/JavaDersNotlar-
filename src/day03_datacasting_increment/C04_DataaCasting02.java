package day03_datacasting_increment;

public class C04_DataaCasting02 {

	public static void main(String[] args) {
		
		double sayi1 = 1000.14;
		
		int sayi2 = (int) sayi1;
		
		// int < double olldu�u i�in java bunu otomatik cevirmez
		// manuel olarak e�itli�in sa��na parantez i�inde int yazmal�y�z
		// java manuell giri�i g�r�nce castinng i�lemini yapar ama data kay�plar� ve data de�i�imleri olabilir.
		
		System.out.println("double de�i�ken : " + sayi1); // 1000.14
		
		System.out.println("int de�i�ken : " + sayi2); // 1000
		
		// java da explicit narrowing data casting yap�l�rken daata kay�plar� olabliir
		
	
		byte sayi3 = (byte) sayi2;
		System.out.println("byte de�i�ken : " + sayi3); // -24
	    // hatta data k���k data tipine uymas� i�in de�i�tirilebilir	
		
		// soru 5 --> 
		
		int sayi4 = 95;
		int sayi5 = 10;
		System.out.println("b�lme sonucu : " + sayi4 / sayi5);
		
		// b�l�nen say� ve b�len say�� ikisi de int ise java sonucu int olarakk verir
		
		double sayi6 = 2000;
		
		System.out.println(sayi6 / sayi5); // 200.0
		
		double sayi7 = 5;
		System.out.println(sayi4 / sayi7); // 19.0
		
		
		
		
		
		
		
		
		
		
		

	}

}
