package day38_overriding_overloading;

public class Isci extends Personel{

	public String bolum = "Kaynak atolyesi";
	public int maas = 5000;
	public String isim = "Mesut";
	
	public int maasHesapla(String str) {
		return 30*8*15;// 30 : gun say�s�, 8 : gunluk mesa�, 15: saat ucret�  
	}
	
	public void mesai() {
		System.out.println("isciler gunluk 8 saat cal�s�r");
	}
	// overloading: ayn� isimde ama farkl� method signature'lar�na sahip methodlard�r
	//
	
	public int maasHesapla(int gunSay�s�) {
		return gunSay�s�*8*15; 
	}
	public int maasHesapla(int gunlukCal�smaSaati,int gunSay�s�) {
		return gunSay�s�*gunlukCal�smaSaati*15;  
	}
	public int maasHesapla(int gunlukCal�smaSaati,int gunSay�s�, int saatUcreti) {
		return gunSay�s�*gunlukCal�smaSaati*saatUcreti;  
	}
	
}
