package day38_overriding_overloading;

public class Formen extends Isci{

	public String sorumluOlduguBolum = "bakým";
	public String isim = "Emrullah";
	public static void main(String[] args) {
		
		// Inheritance ra data turu olarak class ismi kullanýmý
		//Bir classtra obj uretýrken data turu olarak classýn kendisini
		// veya parentlarýný kullanabiliriz.
		//olusturdugumuz obj ile variable kullanmamýzgerekirse hangi degeri
		// alacagýný anlamak için once data turu olan classa gideriz
		//orada aradýgýmýz variable varsa kullanýrýz,yoksa parent'larýna
		//bakarýz,yukarý dogru giderken ilk buldugu degeri kullanýrýz.
		
		
		Formen fr1 =new Formen ();
		// fr1 objesini kullanrak hangi class'larýn variable larý görebilirim.
		fr1.sorumluOlduguBolum = "Marangozhane";
		fr1.maas = 10000;
		System.out.println(fr1.isim + " " + fr1.sorumluOlduguBolum + " " + fr1.maas);
		// Emre Marangozhane 10000
		
		Isci fr2 = new Formen();
		// Data turu olarak Isci secildigi için
		fr2.bolum = "Kaynak atolyesi";
		
		System.out.println(fr2.isim + " " + fr2.bolum + " " + fr2.maas);
		// Mesut Kaynak atolyesi 5000

		Personel fr3 = new Formen();
		System.out.println(fr3.isim);//emre
		
		
	}

}
