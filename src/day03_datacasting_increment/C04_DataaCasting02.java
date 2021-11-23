package day03_datacasting_increment;

public class C04_DataaCasting02 {

	public static void main(String[] args) {
		
		double sayi1 = 1000.14;
		
		int sayi2 = (int) sayi1;
		
		// int < double ollduðu için java bunu otomatik cevirmez
		// manuel olarak eþitliðin saðýna parantez içinde int yazmalýyýz
		// java manuell giriþi görünce castinng iþlemini yapar ama data kayýplarý ve data deðiþimleri olabilir.
		
		System.out.println("double deðiþken : " + sayi1); // 1000.14
		
		System.out.println("int deðiþken : " + sayi2); // 1000
		
		// java da explicit narrowing data casting yapýlýrken daata kayýplarý olabliir
		
	
		byte sayi3 = (byte) sayi2;
		System.out.println("byte deðiþken : " + sayi3); // -24
	    // hatta data küçük data tipine uymasý için deðiþtirilebilir	
		
		// soru 5 --> 
		
		int sayi4 = 95;
		int sayi5 = 10;
		System.out.println("bölme sonucu : " + sayi4 / sayi5);
		
		// bölünen sayý ve bölen sayýý ikisi de int ise java sonucu int olarakk verir
		
		double sayi6 = 2000;
		
		System.out.println(sayi6 / sayi5); // 200.0
		
		double sayi7 = 5;
		System.out.println(sayi4 / sayi7); // 19.0
		
		
		
		
		
		
		
		
		
		
		

	}

}
