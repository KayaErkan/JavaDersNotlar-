package day38_overriding_overloading;

public class GeciciIsci extends Isci{

	public String calýþstýgýBolum = "Yemekhane";
	
	public static void main(String[] args) {
		
		/* Overriding:
		 bir child class da parent classdan miras alýnan methodu 
		 degiþtirmeye overriding denir.
		
		 */
		GeciciIsci gi1 = new GeciciIsci();
		System.out.println(gi1.maasHesapla());
		gi1.mesai();
	}
	/* overriding yapmak için parent class daki method signature'ý 
	   ile child class da bir method olusturulur.
	   Signature ayný oldugundan sadece body degisir.
	   boylece parent methoddaki method child class için gecersiz hale gelir 
	 */
	public int maasHesapla() {
		return 30*8*10;
	}
	@Override // annotatýon
	public void mesai() {
		//super.mesai();
		System.out.println("Gecici iþciler haftada 25 saat calýsýr ");
	}
	/*  annotatýon: açýklama,dipnot demek
	    java anotatýon oldugu satýrda kodu ýnceleyenler için bir açýklama getiriyor
	    
	    // Anotatýon olmasý ýle olmamasý arasýndaki fark:
	     *Annotatýon sadece bir acýklama degildir 
	      override yaptýgýmýz method'u surekli kontrol eder ve  parent classdaki
	      overriden method signature'ý degistirilirse CTE verdirir.
	   
	    * Eger override edilen parent classdaki methodun(overriden) methodun da çalýþmasýný
	     istiyorsak overriding method'a super. ooverridenMethodIsmi yazarýz
	     eger overriding method' da super. yazýlmazsa 
	     overridden methood calýþmaz.
	 */
	
	/* Access modifier:
	 Child parent'ý sýnýrlandýramaz
	 yaný overriding methodun accessmodifier'ý overriden methodun access modifier'ýndan
	 daha dar olamaz. yani child class daký access modifier parent classýndakine eþit
	 veya daha geniþ olmalý...
	 */
	
	/* Return Type:
	   overriden methodun return type'ý primitive veya void ise 
	   overriding methodun return type'ý da ayný olmalý
	   
	   Eger return Type primitive degilse:
	   (overriding methodun return type'ý) IS_A (overriden methodun return type'ý) olmalýdýr
	    
	   
	   
	 */
	
	
	
	
	
	
	
	
}
