package day10_stringManipulations01;

public class C02_StringManipulation02 {

	public static void main(String[] args) {
		
		// length: verilen Stringdeki karakter say�s�n� d�nd�r�r
		
		String str = "Java Guzeldir";
		System.out.println(str.length()); // 13
		
		String str2 = "";
		
		System.out.println(str2.length()); // 0 
		
		str2 = null;
		
		// System.out.println(str2.length()); --> hata verir
		
		// str'�n son harfinin indexi nedir?
		
		// str '�n uuzunlu�u 13 
		// son harfin indexi 12
		
		String str3 = "lkfgjgasdgklhgggh;Gbg�h�kl�hg;hg�h�g,hGhg��h�g,hi;gdlpfgk;gdf�g�kdfolgl";
		
		// str3'�n son harfinin indexini bulmak i�in;
		// str3.length()-1; ile son index bulunur
		
		System.out.println(str3.length()-1);
		
		
		
		
		
		
		
		

	}

}
