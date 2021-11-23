package day36_inheritance02;

public class _01_Personel {

	public String isim;
	public int sayi;
	public _01_Personel() {// parametresiz bir cons olusturuldu
		//super();
		/*
		 java dan yard�m alarak bir cons olusturdugumuzda ,
		 java cons'�n ilk sat�r�na super(); keywordunu ekler
		 Eger icinde bulundugumuz class bir child class degilse super (); keywordu silinebilir
		 bugune kadar olusturdugumuz cons larda hi� super(); keywordu kullanmad�k
		 Ancak bizim classlar�m�z child  class olmad�g�ndan sorun olmad�
		 */
		
		System.out.println("parentteki personel p'siz cons cal��t�");
	}
	
	public _01_Personel(String isim, int sayi) {// parametreli bir cons olusturuldu
		// super();
		System.out.println("parentteki personel p'li cons cal��t�");
	}
	
	// Eski derslerden hat�rlatma:
	// her  class default cons.'a sahiptir
	// default cons'in parametresi yoktur
	// Biz parametreli veya parametresiz bir cons olusturdugumuzda default cons silinir
	// eger biz sadece bir tane parametreli cons olusturursak java default olan� sildigi i�in
	// parametresiz coons kalmaz.
	// dolay�s�yla biz parametreli bir cons olusturdugumuzda mutlaka default cons
	// yerine de parametresiz cons.olusturmam�z gerekir.
	
	
	
	
	
}
