package day36_inheritance02;

public class _01_Personel {

	public String isim;
	public int sayi;
	public _01_Personel() {// parametresiz bir cons olusturuldu
		//super();
		/*
		 java dan yardım alarak bir cons olusturdugumuzda ,
		 java cons'ın ilk satırına super(); keywordunu ekler
		 Eger icinde bulundugumuz class bir child class degilse super (); keywordu silinebilir
		 bugune kadar olusturdugumuz cons larda hiç super(); keywordu kullanmadık
		 Ancak bizim classlarımız child  class olmadıgından sorun olmadı
		 */
		
		System.out.println("parentteki personel p'siz cons calıştı");
	}
	
	public _01_Personel(String isim, int sayi) {// parametreli bir cons olusturuldu
		// super();
		System.out.println("parentteki personel p'li cons calıştı");
	}
	
	// Eski derslerden hatırlatma:
	// her  class default cons.'a sahiptir
	// default cons'in parametresi yoktur
	// Biz parametreli veya parametresiz bir cons olusturdugumuzda default cons silinir
	// eger biz sadece bir tane parametreli cons olusturursak java default olanı sildigi için
	// parametresiz coons kalmaz.
	// dolayısıyla biz parametreli bir cons olusturdugumuzda mutlaka default cons
	// yerine de parametresiz cons.olusturmamız gerekir.
	
	
	
	
	
}
