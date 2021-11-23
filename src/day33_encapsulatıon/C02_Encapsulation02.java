package day33_encapsulatýon;

public class C02_Encapsulation02 {
	private String okulkIsmi="Yildiz Koleji";
	// okul isminin baska classlardan okunmasýný ama deger atanamamasýný istiyorsak
	// getter() methodu oluþturuyoruz
	private String tcNo = "12345678910";
	private int hesapNo = 5554321;
	// obje oluþturularak deger atanýp kullanýlmasýný istediðimiz ama
	// ilk atadýgýmýz degerin görunmemesini istiyorsak setter() methodunuu kullanýrýz
	
	public int sayi = 100;
	
	public static void main(String[] args) {
		// eger ulaþmak istedigim class uyeleri (class members)
		// public degilse baska packagelerden ulaþmak için extra iþlem yapmamýz gerekir.
		
		// yapabilecegimiz iþlremleden 1. si Encapsulation dýr (data saklama)
		// bu class'ta kimseyle paylaþmak istemediðimiz variaible ve methodlar oluþturalým
		
		// Private yapýnca güvenlik konusunu halletmiþ olduk
		// Ancak class uyelerini private olmasý oop konsepte aykýrý
		// Encapsulatýon clasýmýzda oluþturdugumuz class uyelerine
		// kimlerin ne oranda ýlaþabilecegini belirlemek için yapýlýr

	}
	   private void denemeMethodu() {
		System.out.println("Deneme methodu caliþti");
	}
	public  String getOkulkIsmi() {
		return okulkIsmi;
	}
	public  void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
		System.out.println(hesapNo);
	}

}
