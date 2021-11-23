package day02_variablesscanner;

public class C01_Variables {

	public static void main(String[] args) {
		
		// 1- farklý üç data türünde variable oluþtuurup yazdýrýnýz
		
		String kelime = "Merhaba";
		
		System.out.println(kelime); // bu kelimenin karþýlýðý olan merhaba deðerini yazdýrýr.
		
		System.out.println("kelime"); // bu direk kelime yazdýrýr
		
		int  sayi = 20;
		
		System.out.println(sayi);
		
		// yazdýrýrken baþýna açýklama eklemek istersem
		// giirilen saayý : 20
		// eðer deðiþken ve açýklamayý birlikte yazdýrmak istersek aþaðýdaki gibi olmalý
		System.out.println("girilen sayý : " + sayi);
		
		boolean tatildeMi = true;
		System.out.println(tatildeMi);
		
		// konsolda bu sene tatile gittiniz mi ? - true
		
		System.out.println("Bu sene tatile gittiniz mi? : " + tatildeMi);
		
		/* 2- isim ve soyisim için iki variable oluþturun ve bunlarý 
		 * isminiz : Mehmet
		 * soyisminiz:Bulutluoz
		 * þeklinde yazýnýz
		 */
		
		String name = "Erkan";
		String surname = "Kaya";
		System.out.println("Ýsminiz : " + name);
		System.out.println("Soyisminiz : " + surname);
		
		// 3- iki farklý tamsayý data turunde 2 variable oluþturun bunlarýn toplamýný yazdýrýn
		
		int sayi1 = 10;
		byte sayi2 = 5;
		
		System.out.println(sayi1 + sayi2);
		
		// toplama iþleminin basina aciklama yaparsak
		// iki sayýnýn toplamý = 15
		System.out.println("Ýki sayýnýn toplamý = " + sayi1 + sayi2);
		
		// String ve sayýsal iþlemleri birlikte yaptýrrdýðýmýzda matematiksel iþlemi parantez içine almalýyýz!
		
		System.out.println("Ýki sayýnýn toplamý = " + (sayi1 + sayi2));
		
		// 4- bir tamsayý ve bir ondalýklý variable oluþturun ve bunlarýn toplamýný yazdýrýn 
		
		int sayi3 = 15;
		double sayi4 = 3.14;
		System.out.println(sayi3 + sayi4);
		// toplam : 18.14 
		System.out.println("toplam : " + (sayi3 + sayi4));
		
		// 5- char data türünde bir variable oluþturun ve yazdýrýn
		
		char karakter = '?';
		System.out.println(karakter);
		System.out.println("Girrilen karakter : " + karakter);
		
		// 6 - Bir tam sayý bir de char deðiþken oluþturun ve buunlarýn toplamýný yazdýrýn
		 
		int sayi5 = 20;
		char harf = 'M';
		
		System.out.println(sayi5 + harf);
		// char data türündeki deðiþkenler matematiksel iþlemlerde kullanýlýrsa ASCII tablosu devreye girer
		// java o karakter yerýne ASCII tablosundaki deðeri kullanýr!
		
		
	}

}
