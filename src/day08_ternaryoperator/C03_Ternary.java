package day08_ternaryoperator;

public class C03_Ternary {

	public static void main(String[] args) {
		
		int sayi = 75;
		
		String sonuc = sayi % 2 == 0 ? "Sayi Cift" : "Sayi Tek";
		
		System.out.println(sonuc);
		
		System.out.println(sayi > 100 ? "Sayi 100'den b�y�k" : 10 );
		
		// direk yazd�rd���m�z zaman sonuclar�n ikisi ayn� cinsten olmak zorunda de�il
		
		// String sonuc1 = (sayi > 100 ? "Sayi 100'den b�y�k" : 10 );
		
		// farkl� data turundeki sonuclar i�in atama yapamay�z.
		
		int y = 1;
		int z = 1;
		
		int a = y < 10 ? y++ : z++;
		
		System.out.println(y + "," + z + "," + a);
		
		
		
		
		
		
		
		
		
		

	}

}
