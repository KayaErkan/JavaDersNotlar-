package day06_relationalOperators_ifStatement;

public class C01_RelationalOperators {

	public static void main(String[] args) {
		
		System.out.println(15*3==40); // false
		
		System.out.println(15-3==12);// true
		
		boolean e�itMi = 24 / 2 == 12;
		
		System.out.println(e�itMi);
		
		
		
		
		System.out.println((5 + 2 > 8) || 9 < 6 ); // ikisi de yanl�� oldu�u i�in sonu� false
		System.out.println((5 + 2 < 8) || 9 < 6 ); // or operator� oldu�u i�in ve bir tane true bar�nd�rd��� i�in true olur
		
			
		System.out.println((5 + 2 > 8) &&  9 < 6 );// And operatoru kullan�ld��� i�in bir tane false bar�nd�rmas� hepsini false yapar
		System.out.println((5 + 2 < 8) || 9 >= 6 );// or operatoru oldugu i�in bir tane true bar�nd�rd�g� i�in sonu� true olur
		
		// And Operator� m�kemmelliyet�idir her iki de�er true olursa sonu� true olur her iki de�erden biri false olursa false sonucunu verir
		// Or operat�r� iyimserdir sadece her iki de�erin  false olmas� durumunda sonucu false verir di�er durumlarda hep true d�ner
		
		
		
		
		
		
		
		

	}

}
