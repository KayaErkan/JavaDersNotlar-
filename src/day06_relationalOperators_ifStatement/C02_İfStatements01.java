package day06_relationalOperators_ifStatement;

public class C02_ÝfStatements01 {

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
			System.out.println("Yasasýn java");// sartin sonucu true ise if body calýþýr
		}                                      // false ise if body çalýþmaz
		                                       // body çalýþsa da çalýþmasada body den sonraki saatýra geçer
		
		
		if(a+b < 0 || a*b > 20) {
			
			System.out.println("bitti bu iþ");
		} // þartýmýz false olduðu için body si çalýþmaz
		
		
		
		
		
		
		
		System.out.println(2+3*(4+5));

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
