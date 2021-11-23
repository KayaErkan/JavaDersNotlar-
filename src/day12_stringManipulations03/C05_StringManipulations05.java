package day12_stringManipulations03;

public class C05_StringManipulations05 {

	public static void main(String[] args) {
		
		/*Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
 					String str1 = �$13.99�
 					String str2 = �$10.55�
 			ipucu : Double.parseDouble() methodunu kullanabilirsiniz. 
		 */
		
		String str1 = "$13.99";
		String str2 = "$10.55";
		
		str1 = str1.replace("$" , "");
		str2 = str2.replace("$" , "");
		
		System.out.println((str1) + (str2)); // $ i�aretinden kurtulduk ama bunlar hala
		                                     // String oldu�u i�in concat yapt�
		
		Double sayi1 = Double.parseDouble(str1); // ba�taki Doubleyi double �eklinde de yazabilirim
		Double sayi2 = Double.parseDouble(str2); // fakat ikinci double yi yazamam oyle,ama her ikisinin buyuk D ile yaz�lmas� tavsiye edilir
		
		System.out.println("iki say�n�n toplam� : $" + (sayi1 + sayi2));
		
		
		
		

	}

}
