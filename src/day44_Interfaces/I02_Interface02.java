package day44_Interfaces;

public interface I02_Interface02 {

	/* Soru : Buradaki default ve static bizim bildigimiz default ve static mi?
	   Ceevap: HAYIR
	 */
	
	
	public default void deneme () {
		System.out.println("Default keywordlu methodd calýþtý");
	}
	/* bizim bildigimiz default access modifier dý
	   bir method da birden fazla access modifier olur mu?
	   Bizim interface de oluþturduguumuz tum methodlar public'tir
	   Interface'de default keyword kullanarak concreate method olusturabiliriz
	   buradaki default keyword access modifier deðil
	   java'nýn özel bir çözümüdür.
	   Buradaki default keyword bassýna yazýldýgý methodun concreate oldugunu belirtir
	   
	 */
	
	
	
	
	
	static  void deneme2 () {
		System.out.println("static keywordlu methodd calýþtý");
	}
	// yukarýda default keyword'u için yazdýklarýmýz static için de gecerlidir.
	// static ve default keywordu kullanarak olusturdugumuz methodlar 
	// override edilmek ZORUNA DEÐÝLDÝRLER!!!!!
	
	 
	
	
}
