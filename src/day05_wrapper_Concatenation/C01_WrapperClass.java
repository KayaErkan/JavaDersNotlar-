package day05_wrapper_Concatenation;

public class C01_WrapperClass {

	public static void main(String[] args) {
		String isim = "mehmet";
		int sayi1 = 10;

		System.out.println(isim.charAt(2)); // h
		// isim. dedigimizde bircok method listeleniyor, cunku isim variable'inin data
		// turu String
		// ve String non-primitive dir.
		// non-primitive deger'in yaninda method'lar vardir
		// sayi. sayi variable'inin data turu int
		// ve int primitive dir
		// primitive data turleri sadece value'ya sahiptirler method'lari yoktur.

		// *********************************************************** �nemli buras�

		// java primitive data t�rleri i�in de method'lar�n kullan�labilmesi i�in
		// her pirimitive data t�r� i�in bir WRAPPER CLASS olu�turmu�
		// ***********************************************************

		Integer sayi2 = 10;
		System.out.println(sayi2.MAX_VALUE); // int'in alaca�� max de�er 2147483647
		System.out.println(sayi2.MIN_VALUE); // int'in alabilece�i min de�er -2147483648

		// short'un min ve max de�erlerini yazd�r�n

		Short sayi3 = 0;
		System.out.println(sayi3.MAX_VALUE);// short'un max de�eri 32767
		System.out.println(Short.MIN_VALUE);// short'un min de�eri -32768

		// Wrapper Class kullan�m�na bir �rnek verelim:
		String okulNo = "858";

		// Eger String bir variable sadece say�lardan olu�uyorsa bu stringi int'a
		// �evirebiliriz

		int okulNoSayiOlarak = Integer.parseInt(okulNo);

		// System.out.println(okulNo++); okulNo String olarak tan�mland��� i�in
		// matematiksel i�lem yap�lamaz

		System.out.println(++okulNoSayiOlarak);

		Character basHarf = 'a';

		System.out.println(basHarf.charValue());// a yazd�r�r.

		System.out.println(Character.toUpperCase('a'));

	}

}
