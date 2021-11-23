package day39_exceptions;

public class C04_Exception04 {

	public static void main(String[] args) {
		// try catch bloguunndaki e nin görevi
		
		int sayi1 = 10 ;
		int sayi2 = 0;
		
		C02_Exception02 exp = new C02_Exception02 ();
		// esitligin solundaki C02_Exception02 hem class adý hem de exp objesi için data turu
		
		
		try {
			
			System.out.println(sayi1/sayi2);
		
		}catch(ArithmeticException e){
		
			// ArithmeticException java da bir class ve e objesi için data turu
		// e ise ArithmeticException classýndan olusturduguumuz objenýn adý
		// o zaman ismi e koymak zorunda degiliz ama genelde e kullanýlýr
			
			System.out.println("Sayýyý sýfýra bolemezsin");
			// bizim kullanýcýya vermek istedigimiz mesaj
			
			System.out.println(e);//java.lang.ArithmeticException: / by zero
		
			// bu durumda hem javaya durumu yazmasý için fýrsat vermiþ  
	    //hemde applicatýonu bloke etmemiþ oluruz	
			
			System.out.println(e.getMessage()); // by zero
			
			e.printStackTrace();
			/*
			 java.lang.ArithmeticException: / by zero
	         at day40_exceptions.C04_Exception04.main(C04_Exception04.java:17)
			 
			 */
		}
		System.out.println("kod bloke olmamýs");
	}

}
