package day25_constructor;

public class C03 {

	int sayi = 10;
	String isim = "Mehmet";
	// ayni package deki farklý classlardan bu variablelara ulasabiliriz
	//cünkü access modifier yazmazsak default access modifier kullanýlýr
	// acces modifier default ise ayný paketten heryerden ulasilabilir
	public static void main(String[] args) {
		// sayi = 20; degiþkeni static olmadýgý için main method da kullanamam
		// deneme(); methodu static olmadýgý için main method da cagýramam
		
		C03 obj1 = new C03();
		obj1.deneme();
		// ayný classda olodugumuz halde static olmadýgý için kullanamadýgýmýz variable ve 
		// methodlarý obje olusturarak kullanabiliriz
		
		
	}
	public void deneme() {
		System.out.println("deneme methodu calisti");
	}
	

}
