package day31_Varargs;

public class C02_Varargs02 {

	public static void main(String[] args) {
		// Varargs kullanarak verilen Stringleri birle�tiren concat isimli bir method olu�turun
		
		concat ("E","rkan" , "Kaya");
		concat("m","e","r","v","e");
	}

	private static void concat(String... string ) {
		String s = "";
		for (String each : string) {
			s=s.concat(each);
		}
		System.out.println(s);
	}

	
}
