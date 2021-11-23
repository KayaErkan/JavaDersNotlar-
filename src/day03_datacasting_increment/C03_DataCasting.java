package day03_datacasting_increment;

public class C03_DataCasting {

	public static void main(String[] args) {
	
		byte sayi1 = 17;
		
		System.out.println("byte deðiþken ile : " + sayi1);
		
		short sayi2 = sayi1;// sayi2 diye bir variable oluþturuldu ve deðer olarak sayi1 in deðeri atandý.
		// eþitliðin solu short saðý ise byte short > byte olduðu için bu atamayý java kabul eder.
		
		System.out.println("short deðiþken ile : " + sayi2);
		
		int sayi3 = sayi2;
		System.out.println("int deðiþken ile : " + sayi3);
				
		
		float sayi4 = sayi3;
		System.out.println("float deðiþken ile : " + sayi4);
		
		double sayi5 = sayi2;
		System.out.println("double deðiþken ile : " + sayi5);
		
		// buna auto widening denir..

	}

}
