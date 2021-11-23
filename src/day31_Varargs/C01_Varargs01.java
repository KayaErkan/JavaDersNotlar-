package day31_Varargs;

public class C01_Varargs01 {

	public static void main(String[] args) {
		// verilen iki sayýnýn toplamýný bulan mmethood yazýnýz
		// verilen iki sayýnýn toplamýný bulan mmethood yazýnýz	
		int sayi1 = 17;
		int sayi2 = 20;
		int sayi3 = 35;
		topla(12,36,98,25);
		topla(17,20,35);
		ikiSayiTopla(sayi1,sayi2);
		ucSayýTopla(sayi1,sayi2,sayi3);
	}

	private static void ucSayýTopla(int sayi1,int sayi2,int sayi3) {
		System.out.println("uc sayýnýn toplamý :" + (sayi1+sayi2+sayi3));
		
	}

	private static void ikiSayiTopla(int sayi1,int sayi2) {
		System.out.println("uc sayýnýn toplamý :" + (sayi1+sayi2));
		
	}
	public static void topla(int... sayi) {
		int toplam = 0;
		for (int i : sayi) {
			toplam += i;
		}
		System.out.println("Varargs toplam : " + toplam);
	}

}
