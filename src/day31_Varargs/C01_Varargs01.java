package day31_Varargs;

public class C01_Varargs01 {

	public static void main(String[] args) {
		// verilen iki say�n�n toplam�n� bulan mmethood yaz�n�z
		// verilen iki say�n�n toplam�n� bulan mmethood yaz�n�z	
		int sayi1 = 17;
		int sayi2 = 20;
		int sayi3 = 35;
		topla(12,36,98,25);
		topla(17,20,35);
		ikiSayiTopla(sayi1,sayi2);
		ucSay�Topla(sayi1,sayi2,sayi3);
	}

	private static void ucSay�Topla(int sayi1,int sayi2,int sayi3) {
		System.out.println("uc say�n�n toplam� :" + (sayi1+sayi2+sayi3));
		
	}

	private static void ikiSayiTopla(int sayi1,int sayi2) {
		System.out.println("uc say�n�n toplam� :" + (sayi1+sayi2));
		
	}
	public static void topla(int... sayi) {
		int toplam = 0;
		for (int i : sayi) {
			toplam += i;
		}
		System.out.println("Varargs toplam : " + toplam);
	}

}
