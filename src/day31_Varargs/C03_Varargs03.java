package day31_Varargs;

public class C03_Varargs03 {

	public static void main(String[] args) {
		// verilen int lerden ilki haric tum sayilari toplayan ve
		// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdirin.
		
		topla(2,5,55,21,33);
		topla (0,45,35,34);
		topla (5,30,35,36,32,30,31);
	}

	private static void topla(int carpýlacakSayi, int... toplanacaklar) {
		int toplam = 0;
		for (int each : toplanacaklar) {
			toplam += each;
		}
		System.out.println("sonuc : " + (carpýlacakSayi*toplam));
		
	}

	

}
