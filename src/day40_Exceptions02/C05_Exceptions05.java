package day40_Exceptions02;

public class C05_Exceptions05 {

	public static void main(String[] args) {

		/*
		  Null olarak tan�mlanm�� bir obje ile uygun olmayan bir i�lem yapmaya 
		  �al��t��g�n�zda java NullPointerException verir.
		  Unchecked exception'd�r.
		 */
		
		
		String str1 = " ";
		String str2 = "";
		String str3 = null; // null bir deger degildir sadecestr3'un hi�bir�eye ait
							// olmad�g�n� soyleyen bir i�aretcidir(Pointer)
		 
		System.out.println(str1.length()); // 1
		System.out.println(str2.length()); // 0
		//System.out.println(str3.length()); // NullPointerException
		
		System.out.println(str3 + "bos"); // nullbos
		System.out.println(str3.concat("bos")); // NullPointerException
		
	}

}
