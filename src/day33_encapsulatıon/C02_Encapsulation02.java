package day33_encapsulat�on;

public class C02_Encapsulation02 {
	private String okulkIsmi="Yildiz Koleji";
	// okul isminin baska classlardan okunmas�n� ama deger atanamamas�n� istiyorsak
	// getter() methodu olu�turuyoruz
	private String tcNo = "12345678910";
	private int hesapNo = 5554321;
	// obje olu�turularak deger atan�p kullan�lmas�n� istedi�imiz ama
	// ilk atad�g�m�z degerin g�runmemesini istiyorsak setter() methodunuu kullan�r�z
	
	public int sayi = 100;
	
	public static void main(String[] args) {
		// eger ula�mak istedigim class uyeleri (class members)
		// public degilse baska packagelerden ula�mak i�in extra i�lem yapmam�z gerekir.
		
		// yapabilecegimiz i�lremleden 1. si Encapsulation d�r (data saklama)
		// bu class'ta kimseyle payla�mak istemedi�imiz variaible ve methodlar olu�tural�m
		
		// Private yap�nca g�venlik konusunu halletmi� olduk
		// Ancak class uyelerini private olmas� oop konsepte ayk�r�
		// Encapsulat�on clas�m�zda olu�turdugumuz class uyelerine
		// kimlerin ne oranda �la�abilecegini belirlemek i�in yap�l�r

	}
	   private void denemeMethodu() {
		System.out.println("Deneme methodu cali�ti");
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
