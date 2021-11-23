package day11_stringManipulations02;

public class C04_StringManipulations04 {

	public static void main(String[] args) {
		
		String kkNo = "Java 123 @#";
		
		System.out.println(kkNo.replace(" " , "")); // yazd�r�rken yap�lan i�lem yazd�r�ld��� sat�rda ge�erlidir
		
		System.out.println(kkNo); // ilk yazd�rd���m�z �ekilde konsolda g�r�n�r
		
		// replaceAll()
		
		System.out.println(kkNo.replaceAll("\\s", "")); // s sadece space
		System.out.println(kkNo.replaceAll("\\S", "*"));// S space olmayan hersey
		System.out.println(kkNo.replaceAll("\\w", "_")); // w harf veya rakamlar�n hepsi
		System.out.println(kkNo.replaceAll("\\W", "#")); // W harf veya rakamlar�n d���ndaki hersey
		System.out.println(kkNo.replaceAll("\\d", "0")); // rakamlar�n hepsi
		System.out.println(kkNo.replaceAll("\\D", "a")); // rakkamlar�n d�s�ndaki hersey
		
		// syso i�inde yap�lan manipulationlar as�l sitringi de�i�tirmez
		// yukar�daki b�t�n i�lemler sadece bulunduklar� sat�rda ge�erlidir 
		// kkNo ancak tekrardan atama yap�l�rsa de�i�ir 
		
		
		
		
		
	}

}
