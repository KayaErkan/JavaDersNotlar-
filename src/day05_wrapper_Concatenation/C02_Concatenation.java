package day05_wrapper_Concatenation;

public class C02_Concatenation {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "World";
		int sayi1 = 3;
		int sayi2 = 4;
		
		
		//****** kesinlikle say� ve harf yazmadan sadece variable kullanarak********
		
		// Hello1 yazd�r�n
		
		System.out.println(str1 + (sayi2 - sayi1));
		
		// Hello 5 world 
		
		System.out.println(str1 + " " + (++sayi2) + " " + str2) ;
		
		// Hello 34
		System.out.println(str1 + " " +  sayi1+--sayi2);
		
		// 7World
		System.out.println(sayi1+sayi2+str2);
		
		//34
		
		System.out.println(sayi1+""+sayi2); // ==> 34 data t�r� string 
		
		// int'i Stringe �evirmek i�in methoda ihtiya� yok ama istersek kullanabiliriz
		
		String intdanCevrilen = ""+sayi1; //bu y�ntem method kullanmadan int'i stringe �evirir
		
		
		
		
		
		
		
		
		
		
		

	}

}
