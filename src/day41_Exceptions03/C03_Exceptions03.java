package day41_Exceptions03;

public class C03_Exceptions03 {

	public static void main(String[] args) {
		/*
		 - finally blogu try-catch blogu ile veya sadece try blogu ile çalýþýr.
		 - finally blogu catch ile ön gördugum bir sorun oldugunda calýþtýgý gibi
		   ongoremediðim bir exception olustugunda da calisir... 
		 */
		
		int arr [] = {1,4,7,8};
		
		try {
		System.out.println(arr[20]);
		
		}
		/*catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}*/
		
		finally {
			System.out.println("Ne olursa olsun bu satýr yazýlsýn");
		}
		System.out.println("Kod bloke olmamýþ");
		
		
		
		
		
		
		
		
		

	}

}
