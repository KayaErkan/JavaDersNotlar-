package day04_increment_matematiksel_i�lemler;

public class C04_Modulos {

	public static void main(String[] args) {
		// 5496 say�s�n�n rakamlar toplam�n� bulal�m
		
		
		int sayi = 5496;
		int rakamlarToplam� = 0;
		
		// bir say�n�n rakamlar toplam�n� bulmak i�in her basamak de�erinde 3 i�lem yapar�z
		// bu sat�rda sayi = 5496, rakamlarToplam� = 0
 		
		// 1- say� % 10 ile son basama�� elde ederiz.
		
		int rakam = sayi %10;
		
		// 2- bu rakam� rakamlar toplam�na ekleriz.
		
		rakamlarToplam� += rakam;
		
		// 3- de�erini ald���m�z son basamaktan kurtulmak i�in say�y� 10' a b�leriz
		
		sayi /= 10;
		
		// bu sat�ra geldi�imde say� 549, rakamlar toplami = 6
		
		
		rakam = sayi % 10;
		
		rakamlarToplam� += rakam;
		
		sayi /= 10;
		
		
		
		
		// bu sat�ra geldi�imde say� 54, rakamlar toplami = 15
		
		rakam = sayi % 10;
		
		rakamlarToplam� += rakam;
		
		sayi /= 10;
		
		
		
		// bu sat�ra geldi�imde say� 5, rakamlar toplami = 19
		
		rakam = sayi % 10;
		
		rakamlarToplam� += rakam;
		
		sayi /= 10;
		
		
		// kodumuzun sonunda rakamlar toplam� 24, say� ise 0 oldu
		
		
		System.out.println("Rakamlar Toplam� : " + rakamlarToplam�);
		System.out.println("Say�n�n son de�eri : " + sayi);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
