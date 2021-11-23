package day39_exceptions;

public class C04_Exception04 {

	public static void main(String[] args) {
		// try catch bloguunndaki e nin g�revi
		
		int sayi1 = 10 ;
		int sayi2 = 0;
		
		C02_Exception02 exp = new C02_Exception02 ();
		// esitligin solundaki C02_Exception02 hem class ad� hem de exp objesi i�in data turu
		
		
		try {
			
			System.out.println(sayi1/sayi2);
		
		}catch(ArithmeticException e){
		
			// ArithmeticException java da bir class ve e objesi i�in data turu
		// e ise ArithmeticException class�ndan olusturduguumuz objen�n ad�
		// o zaman ismi e koymak zorunda degiliz ama genelde e kullan�l�r
			
			System.out.println("Say�y� s�f�ra bolemezsin");
			// bizim kullan�c�ya vermek istedigimiz mesaj
			
			System.out.println(e);//java.lang.ArithmeticException: / by zero
		
			// bu durumda hem javaya durumu yazmas� i�in f�rsat vermi�  
	    //hemde applicat�onu bloke etmemi� oluruz	
			
			System.out.println(e.getMessage()); // by zero
			
			e.printStackTrace();
			/*
			 java.lang.ArithmeticException: / by zero
	         at day40_exceptions.C04_Exception04.main(C04_Exception04.java:17)
			 
			 */
		}
		System.out.println("kod bloke olmam�s");
	}

}
