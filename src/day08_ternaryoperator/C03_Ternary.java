package day08_ternaryoperator;

public class C03_Ternary {

	public static void main(String[] args) {
		
		int sayi = 75;
		
		String sonuc = sayi % 2 == 0 ? "Sayi Cift" : "Sayi Tek";
		
		System.out.println(sonuc);
		
		System.out.println(sayi > 100 ? "Sayi 100'den büyük" : 10 );
		
		// direk yazdırdığımız zaman sonucların ikisi aynı cinsten olmak zorunda değil
		
		// String sonuc1 = (sayi > 100 ? "Sayi 100'den büyük" : 10 );
		
		// farklı data turundeki sonuclar için atama yapamayız.
		
		int y = 1;
		int z = 1;
		
		int a = y < 10 ? y++ : z++;
		
		System.out.println(y + "," + z + "," + a);
		
		
		
		
		
		
		
		
		
		

	}

}
