package day06_relationalOperators_ifStatement;

public class C02_�fStatements01 {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		
		if (a > b) {
			
			System.out.println("a b'den buyuk");
		}
		if(a == b) {
			System.out.println("sayilar esit");
		}
		
		
		if (a>b || a+b < 10) {
			System.out.println("Yasas�n java");// sartin sonucu true ise if body cal���r
		}                                      // false ise if body �al��maz
		                                       // body �al��sa da �al��masada body den sonraki saat�ra ge�er
		
		
		if(a+b < 0 || a*b > 20) {
			
			System.out.println("bitti bu i�");
		} // �art�m�z false oldu�u i�in body si �al��maz
		
		
		
		
		
		
		
		System.out.println(2+3*(4+5));

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
