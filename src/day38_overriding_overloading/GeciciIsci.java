package day38_overriding_overloading;

public class GeciciIsci extends Isci{

	public String cal��st�g�Bolum = "Yemekhane";
	
	public static void main(String[] args) {
		
		/* Overriding:
		 bir child class da parent classdan miras al�nan methodu 
		 degi�tirmeye overriding denir.
		
		 */
		GeciciIsci gi1 = new GeciciIsci();
		System.out.println(gi1.maasHesapla());
		gi1.mesai();
	}
	/* overriding yapmak i�in parent class daki method signature'� 
	   ile child class da bir method olusturulur.
	   Signature ayn� oldugundan sadece body degisir.
	   boylece parent methoddaki method child class i�in gecersiz hale gelir 
	 */
	public int maasHesapla() {
		return 30*8*10;
	}
	@Override // annotat�on
	public void mesai() {
		//super.mesai();
		System.out.println("Gecici i�ciler haftada 25 saat cal�s�r ");
	}
	/*  annotat�on: a��klama,dipnot demek
	    java anotat�on oldugu sat�rda kodu �nceleyenler i�in bir a��klama getiriyor
	    
	    // Anotat�on olmas� �le olmamas� aras�ndaki fark:
	     *Annotat�on sadece bir ac�klama degildir 
	      override yapt�g�m�z method'u surekli kontrol eder ve  parent classdaki
	      overriden method signature'� degistirilirse CTE verdirir.
	   
	    * Eger override edilen parent classdaki methodun(overriden) methodun da �al��mas�n�
	     istiyorsak overriding method'a super. ooverridenMethodIsmi yazar�z
	     eger overriding method' da super. yaz�lmazsa 
	     overridden methood cal��maz.
	 */
	
	/* Access modifier:
	 Child parent'� s�n�rland�ramaz
	 yan� overriding methodun accessmodifier'� overriden methodun access modifier'�ndan
	 daha dar olamaz. yani child class dak� access modifier parent class�ndakine e�it
	 veya daha geni� olmal�...
	 */
	
	/* Return Type:
	   overriden methodun return type'� primitive veya void ise 
	   overriding methodun return type'� da ayn� olmal�
	   
	   Eger return Type primitive degilse:
	   (overriding methodun return type'�) IS_A (overriden methodun return type'�) olmal�d�r
	    
	   
	   
	 */
	
	
	
	
	
	
	
	
}
