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
		
		// ilk üç karþýlaþtýrma da deðerler ayný olduðu için sonuç hep true oldu
		
		System.out.println(name1 == (name2)); // true
		System.out.println(name1 == (name3)); // false
		System.out.println(name2 == (name6)); // false
		System.out.println("*************************************************");	
		// farklý objeler ayný deðeri aldýðýnda java referanslara bakar
		// bu referanslar ayný ise == true dondurur, yoksa false dondurur
		//deðerleri karþýlaþtýrmak ve sürpriz yaþamamak istiyorsanýz equals() kullanmalýsýnýz
		
		
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
