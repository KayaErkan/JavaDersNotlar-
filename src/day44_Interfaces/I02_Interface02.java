package day44_Interfaces;

public interface I02_Interface02 {

	/* Soru : Buradaki default ve static bizim bildigimiz default ve static mi?
	   Ceevap: HAYIR
	 */
	
	
	public default void deneme () {
		System.out.println("Default keywordlu methodd cal��t�");
	}
	/* bizim bildigimiz default access modifier d�
	   bir method da birden fazla access modifier olur mu?
	   Bizim interface de olu�turduguumuz tum methodlar public'tir
	   Interface'de default keyword kullanarak concreate method olusturabiliriz
	   buradaki default keyword access modifier de�il
	   java'n�n �zel bir ��z�m�d�r.
	   Buradaki default keyword bass�na yaz�ld�g� methodun concreate oldugunu belirtir
	   
	 */
	
	
	
	
	
	static  void deneme2 () {
		System.out.println("static keywordlu methodd cal��t�");
	}
	// yukar�da default keyword'u i�in yazd�klar�m�z static i�in de gecerlidir.
	// static ve default keywordu kullanarak olusturdugumuz methodlar 
	// override edilmek ZORUNA DE��LD�RLER!!!!!
	
	 
	
	
}
