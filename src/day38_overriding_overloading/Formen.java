package day38_overriding_overloading;

public class Formen extends Isci{

	public String sorumluOlduguBolum = "bak�m";
	public String isim = "Emrullah";
	public static void main(String[] args) {
		
		// Inheritance ra data turu olarak class ismi kullan�m�
		//Bir classtra obj uret�rken data turu olarak class�n kendisini
		// veya parentlar�n� kullanabiliriz.
		//olusturdugumuz obj ile variable kullanmam�zgerekirse hangi degeri
		// alacag�n� anlamak i�in once data turu olan classa gideriz
		//orada arad�g�m�z variable varsa kullan�r�z,yoksa parent'lar�na
		//bakar�z,yukar� dogru giderken ilk buldugu degeri kullan�r�z.
		
		
		Formen fr1 =new Formen ();
		// fr1 objesini kullanrak hangi class'lar�n variable lar� g�rebilirim.
		fr1.sorumluOlduguBolum = "Marangozhane";
		fr1.maas = 10000;
		System.out.println(fr1.isim + " " + fr1.sorumluOlduguBolum + " " + fr1.maas);
		// Emre Marangozhane 10000
		
		Isci fr2 = new Formen();
		// Data turu olarak Isci secildigi i�in
		fr2.bolum = "Kaynak atolyesi";
		
		System.out.println(fr2.isim + " " + fr2.bolum + " " + fr2.maas);
		// Mesut Kaynak atolyesi 5000

		Personel fr3 = new Formen();
		System.out.println(fr3.isim);//emre
		
		
	}

}
