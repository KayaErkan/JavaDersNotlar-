package day02_variablesscanner;

public class C01_Variables {

	public static void main(String[] args) {
		
		// 1- farkl� �� data t�r�nde variable olu�tuurup yazd�r�n�z
		
		String kelime = "Merhaba";
		
		System.out.println(kelime); // bu kelimenin kar��l��� olan merhaba de�erini yazd�r�r.
		
		System.out.println("kelime"); // bu direk kelime yazd�r�r
		
		int  sayi = 20;
		
		System.out.println(sayi);
		
		// yazd�r�rken ba��na a��klama eklemek istersem
		// giirilen saay� : 20
		// e�er de�i�ken ve a��klamay� birlikte yazd�rmak istersek a�a��daki gibi olmal�
		System.out.println("girilen say� : " + sayi);
		
		boolean tatildeMi = true;
		System.out.println(tatildeMi);
		
		// konsolda bu sene tatile gittiniz mi ? - true
		
		System.out.println("Bu sene tatile gittiniz mi? : " + tatildeMi);
		
		/* 2- isim ve soyisim i�in iki variable olu�turun ve bunlar� 
		 * isminiz : Mehmet
		 * soyisminiz:Bulutluoz
		 * �eklinde yaz�n�z
		 */
		
		String name = "Erkan";
		String surname = "Kaya";
		System.out.println("�sminiz : " + name);
		System.out.println("Soyisminiz : " + surname);
		
		// 3- iki farkl� tamsay� data turunde 2 variable olu�turun bunlar�n toplam�n� yazd�r�n
		
		int sayi1 = 10;
		byte sayi2 = 5;
		
		System.out.println(sayi1 + sayi2);
		
		// toplama i�leminin basina aciklama yaparsak
		// iki say�n�n toplam� = 15
		System.out.println("�ki say�n�n toplam� = " + sayi1 + sayi2);
		
		// String ve say�sal i�lemleri birlikte yapt�rrd���m�zda matematiksel i�lemi parantez i�ine almal�y�z!
		
		System.out.println("�ki say�n�n toplam� = " + (sayi1 + sayi2));
		
		// 4- bir tamsay� ve bir ondal�kl� variable olu�turun ve bunlar�n toplam�n� yazd�r�n 
		
		int sayi3 = 15;
		double sayi4 = 3.14;
		System.out.println(sayi3 + sayi4);
		// toplam : 18.14 
		System.out.println("toplam : " + (sayi3 + sayi4));
		
		// 5- char data t�r�nde bir variable olu�turun ve yazd�r�n
		
		char karakter = '?';
		System.out.println(karakter);
		System.out.println("Girrilen karakter : " + karakter);
		
		// 6 - Bir tam say� bir de char de�i�ken olu�turun ve buunlar�n toplam�n� yazd�r�n
		 
		int sayi5 = 20;
		char harf = 'M';
		
		System.out.println(sayi5 + harf);
		// char data t�r�ndeki de�i�kenler matematiksel i�lemlerde kullan�l�rsa ASCII tablosu devreye girer
		// java o karakter yer�ne ASCII tablosundaki de�eri kullan�r!
		
		
	}

}
