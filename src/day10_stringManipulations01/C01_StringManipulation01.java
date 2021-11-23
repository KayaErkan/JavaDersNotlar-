package day10_stringManipulations01;

public class C01_StringManipulation01 {

	public static void main(String[] args) {
		
		String name1 = "Ali Can";
		String name2 = "Ali Can";
		String name3 = name2 + "";
		String name4 = "Ali";
		String name5 = "Can";
		String name6 = name4 + " " + name5;
		
		System.out.println(name1.equals(name2)); // true
		System.out.println(name1.equals(name3)); // true
		System.out.println(name2.equals(name6)); // true
		
		// ilk �� kar��la�t�rma da de�erler ayn� oldu�u i�in sonu� hep true oldu
		
		System.out.println(name1 == (name2)); // true
		System.out.println(name1 == (name3)); // false
		System.out.println(name2 == (name6)); // false
		System.out.println("*************************************************");	
		// farkl� objeler ayn� de�eri ald���nda java referanslara bakar
		// bu referanslar ayn� ise == true dondurur, yoksa false dondurur
		//de�erleri kar��la�t�rmak ve s�rpriz ya�amamak istiyorsan�z equals() kullanmal�s�n�z
		
		
		String name7 = "ALI CAN";
		String name8 = "ALI cAn";
		String name9 = "ali can";
		String name10 = "Alican";
		
		System.out.println(name1.equals(name7)); // false
		System.out.println(name1.equalsIgnoreCase(name7));// true
		System.out.println(name7.equalsIgnoreCase(name9));// true
		System.out.println(name8.equalsIgnoreCase(name9));// true
		System.out.println(name9.equalsIgnoreCase(name10)); // false
		
		
		
		
		
		
		
		
	}

}
