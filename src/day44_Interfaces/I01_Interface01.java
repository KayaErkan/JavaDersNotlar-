package day44_Interfaces;

public interface I01_Interface01 {
		
	public void motor (); // �nterface i�inde abstract methodlar ve 
	                      // �ZEL concreate methodlar olabilir
	
	/*
	 Bir abstract methodun body si olmad�g�ndan o methodun istenen dinamik �zelli�i
	 nas�l ger�ekles�tirece�ini bilmemiz mumkun de�ildir
	 Sadece ne yapacag�n�z biliriz.
	 
	 Bu method bize �unu anlat�r:
	 Beni inherit eden her concreate class�n dinamik motor ozelligi olmal�d�r
	 */
	
	void vites ();// Beni inherit eden her concreate class�n dinamik vites ozelligi olmal�d�r
	
	abstract void kasa();// Beni inherit eden her concreate class�n dinamik kasa ozelligi olmal�d�r
	
	/*
	 Interface de sadece ABSTRACT,PUBL�C methodlar olur
	 bu iki keywordu yazsak da yazmasak da java tum methodlar� bu sekilde kabul eder
	 */
	
	// Java da Interface olusturmak istiyorsak bastan o sekilde olu�turmal�y�z
	// Bir class sonradan baz� keywordlar kullan�larak Interface yap�lamaz
	
	String ISIM = "Mustafa"; // java isim kelimesini italik ve bold yapt�
	                         // Demek ki tum variable'lar final ve statictir. 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
