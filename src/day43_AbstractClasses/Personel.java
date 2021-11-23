package day43_AbstractClasses;

public abstract class Personel {
	// Bir class� abstract yapmak i�in class keyword'unden �nce 
	// abstract yazmak yeterlidir.
	
	// abstracat bir class�n i�inde variable olabilir mi?
	// --> olabilir
	
	public String �sim = "Yasin";
	// variable'lar abstract olur mu?
	// --> olmaz
	//public abstract int sayi = 10;
	
	// abstract class�n tum concreat child'lar� abstract classtaki 
	// t�m dinamik ozellikleri yani methodlar� override etmek ZORUNDADIR!
	
	//Bir method abstract olabilir mi ve naas�l yap�l�r?
	//--> olabilir,abstract keywordu kulla�larak yap�l�r
	
	public abstract void maasHesapla();
	public abstract void maasBilgisi();
	
	// Birr abstract class da concreat method yaz�labilir mi?
	//--> yaz�labilir.
	public void ozelSigorta() {
		System.out.println("Bu personel ozel sigortal�d�r");
	}
	// Bir abstract class da abstract  ve concreat methodlar olabilir
	// concreate(yani abs olmayan) child class'lar abstract methodlar� override etmek zorundad�r
	// ama concreate methodlar� override etmek istege bagl�d�r.
	
}
