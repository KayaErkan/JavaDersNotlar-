package day41_Exceptions03;

public class C03_Exceptions03 {

	public static void main(String[] args) {
		/*
		 - finally blogu try-catch blogu ile veya sadece try blogu ile �al���r.
		 - finally blogu catch ile �n g�rdugum bir sorun oldugunda cal��t�g� gibi
		   ongoremedi�im bir exception olustugunda da calisir... 
		 */
		
		int arr [] = {1,4,7,8};
		
		try {
		System.out.println(arr[20]);
		
		}
		/*catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}*/
		
		finally {
			System.out.println("Ne olursa olsun bu sat�r yaz�ls�n");
		}
		System.out.println("Kod bloke olmam��");
		
		
		
		
		
		
		
		
		

	}

}
