package day43_AbstractClasses;

public abstract class Personel {
	// Bir classý abstract yapmak için class keyword'unden önce 
	// abstract yazmak yeterlidir.
	
	// abstracat bir classýn içinde variable olabilir mi?
	// --> olabilir
	
	public String Ýsim = "Yasin";
	// variable'lar abstract olur mu?
	// --> olmaz
	//public abstract int sayi = 10;
	
	// abstract classýn tum concreat child'larý abstract classtaki 
	// tüm dinamik ozellikleri yani methodlarý override etmek ZORUNDADIR!
	
	//Bir method abstract olabilir mi ve naasýl yapýlýr?
	//--> olabilir,abstract keywordu kullaýlarak yapýlýr
	
	public abstract void maasHesapla();
	public abstract void maasBilgisi();
	
	// Birr abstract class da concreat method yazýlabilir mi?
	//--> yazýlabilir.
	public void ozelSigorta() {
		System.out.println("Bu personel ozel sigortalýdýr");
	}
	// Bir abstract class da abstract  ve concreat methodlar olabilir
	// concreate(yani abs olmayan) child class'lar abstract methodlarý override etmek zorundadýr
	// ama concreate methodlarý override etmek istege baglýdýr.
	
}
