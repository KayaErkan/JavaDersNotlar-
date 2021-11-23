package day43_AbstractClasses;

public class Isci extends Personel {

	public static void main(String[] args) {
		Isci isci1 = new Isci();
		isci1.maasHesapla();//Ýþçiler için maas 5000 tl
		isci1.maasBilgisi();//iþçiler günlük 8 saat calýsýr
		isci1.Ýsim="Rumeysa";//abstract parent class da ki variable'larý istersem kullanabilirim
		System.out.println(isci1.Ýsim);//Rumeysa
		//System.out.println(isim);
		isci1.ozelSigorta();//Bu personel ozel sigortalýdýr
		//abstract parent classdaki concreat methodu istersem kullanýrým
		//Bu methodu override etmedik ama parent-child iliþkisi ile kullanabildik 

	}

	@Override
	public void maasHesapla() {
		// parent class daki abstract methodu implement(uyarlama) etti
		//1- Sen abstract bir class'ý parent edindiysen mutlaka oradaki abstract methodu
		// implement etmelisin
		//2- parent class  daki method da body olmadýgý için onu kullanmanýn anlamý yok
		// biz child class'da body olan method (concreat) kullanýp iþlem yapmalýyýz
		System.out.println("Ýþçiler için maas 5000 tl");
		
	}

	@Override
	public void maasBilgisi() {
		System.out.println("iþçiler günlük 8 saat calýsýr");
		
	}

}
