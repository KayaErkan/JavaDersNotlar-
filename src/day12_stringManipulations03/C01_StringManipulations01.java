package day12_stringManipulations03;

public class C01_StringManipulations01 {

	public static void main(String[] args) {
		
		String str = "java cand�r";
		
		System.out.println(str.substring(5)); //cand�r yazd�racak (5 dahil ve sonras�n� yazd�racak)
		System.out.println(str.substring(10)); // r harfini yazd�racak
		System.out.println(str.substring(11)); // 11 = length yani hi�bi�ey yazd�rmayacak
		System.out.println("*******************");
	//	System.out.println(str.substring(20)); // hata verir
		
		System.out.println(str.substring(5,8)); // can
		System.out.println(str.substring(2,3)); // v
		System.out.println(str.substring(5,5)); // hi� bi�ey yazd�rmayacak
		System.out.println("***********************");
		System.out.println(str.substring(5,11)); // cand�r
	// 	System.out.println(str.substring(5,1)); // hata verir
		
		System.out.println(str.substring(3,4) + str.substring(8,9));// ad
		
		
		
		
		
		

	}

}
