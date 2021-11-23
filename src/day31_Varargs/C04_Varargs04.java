package day31_Varargs;

public class C04_Varargs04 {

	public static void main(String[] args) {
		
		int  arr [] = {1,3,5,7,9,10,11,12};
		System.out.println("array toplamý : " + arrTopla(arr));
		System.out.println("varargs toplami : " + varargstopla(1,3,5,7,9));
		System.out.println("varargsýn array parametreli toplami : " + varargstopla(arr));
		// varargs array gibi davrandýgý için herhangi bir arrayi parametre olarak alabilir
		
	}
	
	// Array elemanlarýný toplayan method
	public static int arrTopla(int[] arr) {
		int topla = 0;
		for (int each : arr) {
			topla += each;
		}	
		return topla;
	}
	// varargs elemanlarý toplayan method
	public static int varargstopla(int ... i) {
		int toplam = 0;
		for (int each : i) {
			toplam += each;
		}
		return toplam;
	}

}
