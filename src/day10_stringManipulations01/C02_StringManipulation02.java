package day10_stringManipulations01;

public class C02_StringManipulation02 {

	public static void main(String[] args) {
		
		// length: verilen Stringdeki karakter sayýsýný döndürür
		
		String str = "Java Guzeldir";
		System.out.println(str.length()); // 13
		
		String str2 = "";
		
		System.out.println(str2.length()); // 0 
		
		str2 = null;
		
		// System.out.println(str2.length()); --> hata verir
		
		// str'ýn son harfinin indexi nedir?
		
		// str 'ýn uuzunluðu 13 
		// son harfin indexi 12
		
		String str3 = "lkfgjgasdgklhgggh;Gbgþhöklþhg;hgþhög,hGhgçþhçg,hi;gdlpfgk;gdfþgökdfolgl";
		
		// str3'ün son harfinin indexini bulmak için;
		// str3.length()-1; ile son index bulunur
		
		System.out.println(str3.length()-1);
		
		
		
		
		
		
		
		

	}

}
