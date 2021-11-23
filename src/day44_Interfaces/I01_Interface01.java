package day44_Interfaces;

public interface I01_Interface01 {
		
	public void motor (); // Ýnterface içinde abstract methodlar ve 
	                      // ÖZEL concreate methodlar olabilir
	
	/*
	 Bir abstract methodun body si olmadýgýndan o methodun istenen dinamik özelliði
	 nasýl gerçeklesþtireceðini bilmemiz mumkun deðildir
	 Sadece ne yapacagýnýz biliriz.
	 
	 Bu method bize þunu anlatýr:
	 Beni inherit eden her concreate classýn dinamik motor ozelligi olmalýdýr
	 */
	
	void vites ();// Beni inherit eden her concreate classýn dinamik vites ozelligi olmalýdýr
	
	abstract void kasa();// Beni inherit eden her concreate classýn dinamik kasa ozelligi olmalýdýr
	
	/*
	 Interface de sadece ABSTRACT,PUBLÝC methodlar olur
	 bu iki keywordu yazsak da yazmasak da java tum methodlarý bu sekilde kabul eder
	 */
	
	// Java da Interface olusturmak istiyorsak bastan o sekilde oluþturmalýyýz
	// Bir class sonradan bazý keywordlar kullanýlarak Interface yapýlamaz
	
	String ISIM = "Mustafa"; // java isim kelimesini italik ve bold yaptý
	                         // Demek ki tum variable'lar final ve statictir. 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
