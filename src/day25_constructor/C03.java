package day25_constructor;

public class C03 {

	int sayi = 10;
	String isim = "Mehmet";
	// ayni package deki farkl� classlardan bu variablelara ulasabiliriz
	//c�nk� access modifier yazmazsak default access modifier kullan�l�r
	// acces modifier default ise ayn� paketten heryerden ulasilabilir
	public static void main(String[] args) {
		// sayi = 20; degi�keni static olmad�g� i�in main method da kullanamam
		// deneme(); methodu static olmad�g� i�in main method da cag�ramam
		
		C03 obj1 = new C03();
		obj1.deneme();
		// ayn� classda olodugumuz halde static olmad�g� i�in kullanamad�g�m�z variable ve 
		// methodlar� obje olusturarak kullanabiliriz
		
		
	}
	public void deneme() {
		System.out.println("deneme methodu calisti");
	}
	

}
