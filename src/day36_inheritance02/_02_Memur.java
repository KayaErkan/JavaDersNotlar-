package day36_inheritance02;

public class _02_Memur extends _01_Personel{

	public int  maas ;
	
	
	public _02_Memur() {
		super();
		System.out.println("Child class parametresiz constructor calisti");
	}

	public _02_Memur(int maas) {
		super("sehher",6000);
		System.out.println("Child class parametreli constructor cali�ti");
		
	}
	
	
	
	/*
	 �nheritance da constructor olu�turdugumuzda javan�n otomatik olarak constructor'a
	 koydugu super() keyword �nemlidir.
	 super () keywprd default cons gibidir. Biz g�rmesekte cal�s�r, ancak yerine
	 baska bir keyword yazarsak etkisiz hale gelir.
	 
	 **** extends varsa yerine bi�ey yazmad�kca super() calisir.
	 
	 */
	
	
	
	public static void main(String[] args) {
		
		_02_Memur obj1 = new _02_Memur(2400);
		

		
	}



}
