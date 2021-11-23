package day38_overriding_overloading;

public class Isci extends Personel{

	public String bolum = "Kaynak atolyesi";
	public int maas = 5000;
	public String isim = "Mesut";
	
	public int maasHesapla(String str) {
		return 30*8*15;// 30 : gun sayısı, 8 : gunluk mesaı, 15: saat ucretı  
	}
	
	public void mesai() {
		System.out.println("isciler gunluk 8 saat calısır");
	}
	// overloading: aynı isimde ama farklı method signature'larına sahip methodlardır
	//
	
	public int maasHesapla(int gunSayısı) {
		return gunSayısı*8*15; 
	}
	public int maasHesapla(int gunlukCalısmaSaati,int gunSayısı) {
		return gunSayısı*gunlukCalısmaSaati*15;  
	}
	public int maasHesapla(int gunlukCalısmaSaati,int gunSayısı, int saatUcreti) {
		return gunSayısı*gunlukCalısmaSaati*saatUcreti;  
	}
	
}
