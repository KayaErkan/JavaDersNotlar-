package day43_AbstractClasses;

public class Isci extends Personel {

	public static void main(String[] args) {
		Isci isci1 = new Isci();
		isci1.maasHesapla();//���iler i�in maas 5000 tl
		isci1.maasBilgisi();//i��iler g�nl�k 8 saat cal�s�r
		isci1.�sim="Rumeysa";//abstract parent class da ki variable'lar� istersem kullanabilirim
		System.out.println(isci1.�sim);//Rumeysa
		//System.out.println(isim);
		isci1.ozelSigorta();//Bu personel ozel sigortal�d�r
		//abstract parent classdaki concreat methodu istersem kullan�r�m
		//Bu methodu override etmedik ama parent-child ili�kisi ile kullanabildik 

	}

	@Override
	public void maasHesapla() {
		// parent class daki abstract methodu implement(uyarlama) etti
		//1- Sen abstract bir class'� parent edindiysen mutlaka oradaki abstract methodu
		// implement etmelisin
		//2- parent class  daki method da body olmad�g� i�in onu kullanman�n anlam� yok
		// biz child class'da body olan method (concreat) kullan�p i�lem yapmal�y�z
		System.out.println("���iler i�in maas 5000 tl");
		
	}

	@Override
	public void maasBilgisi() {
		System.out.println("i��iler g�nl�k 8 saat cal�s�r");
		
	}

}
