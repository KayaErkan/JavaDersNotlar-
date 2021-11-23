package day31_Varargs;

public class C04_Varargs04 {

	public static void main(String[] args) {
		
		int  arr [] = {1,3,5,7,9,10,11,12};
		System.out.println("array toplam� : " + arrTopla(arr));
		System.out.println("varargs toplami : " + varargstopla(1,3,5,7,9));
		System.out.println("varargs�n array parametreli toplami : " + varargstopla(arr));
		// varargs array gibi davrand�g� i�in herhangi bir arrayi parametre olarak alabilir
		
	}
	
	// Array elemanlar�n� toplayan method
	public static int arrTopla(int[] arr) {
		int topla = 0;
		for (int each : arr) {
			topla += each;
		}	
		return topla;
	}
	// varargs elemanlar� toplayan method
	public static int varargstopla(int ... i) {
		int toplam = 0;
		for (int each : i) {
			toplam += each;
		}
		return toplam;
	}

}
