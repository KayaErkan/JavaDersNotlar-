package day40_Exceptions02;

public class C05_Exceptions05 {

	public static void main(String[] args) {

		/*
		  Null olarak tanýmlanmýþ bir obje ile uygun olmayan bir iþlem yapmaya 
		  çalýþtýýgýnýzda java NullPointerException verir.
		  Unchecked exception'dýr.
		 */
		
		
		String str1 = " ";
		String str2 = "";
		String str3 = null; // null bir deger degildir sadecestr3'un hiçbirþeye ait
							// olmadýgýný soyleyen bir iþaretcidir(Pointer)
		 
		System.out.println(str1.length()); // 1
		System.out.println(str2.length()); // 0
		//System.out.println(str3.length()); // NullPointerException
		
		System.out.println(str3 + "bos"); // nullbos
		System.out.println(str3.concat("bos")); // NullPointerException
		
	}

}
