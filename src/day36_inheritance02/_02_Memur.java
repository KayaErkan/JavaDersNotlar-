package day36_inheritance02;

public class _02_Memur extends _01_Personel{

	public int  maas ;
	
	
	public _02_Memur() {
		super();
		System.out.println("Child class parametresiz constructor calisti");
	}

	public _02_Memur(int maas) {
		super("sehher",6000);
		System.out.println("Child class parametreli constructor caliþti");
		
	}
	
	
	
	/*
	 Ýnheritance da constructor oluþturdugumuzda javanýn otomatik olarak constructor'a
	 koydugu super() keyword önemlidir.
	 super () keywprd default cons gibidir. Biz görmesekte calýsýr, ancak yerine
	 baska bir keyword yazarsak etkisiz hale gelir.
	 
	 **** extends varsa yerine biþey yazmadýkca super() calisir.
	 
	 */
	
	
	
	public static void main(String[] args) {
		
		_02_Memur obj1 = new _02_Memur(2400);
		

		
	}



}
