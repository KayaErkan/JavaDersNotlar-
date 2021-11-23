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

		// *********************************************************** önemli burasý

		// java primitive data türleri için de method'larýn kullanýlabilmesi için
		// her pirimitive data türü için bir WRAPPER CLASS oluþturmuþ
		// ***********************************************************

		Integer sayi2 = 10;
		System.out.println(sayi2.MAX_VALUE); // int'in alacaðý max deðer 2147483647
		System.out.println(sayi2.MIN_VALUE); // int'in alabileceði min deðer -2147483648

		// short'un min ve max deðerlerini yazdýrýn

		Short sayi3 = 0;
		System.out.println(sayi3.MAX_VALUE);// short'un max deðeri 32767
		System.out.println(Short.MIN_VALUE);// short'un min deðeri -32768

		// Wrapper Class kullanýmýna bir örnek verelim:
		String okulNo = "858";

		// Eger String bir variable sadece sayýlardan oluþuyorsa bu stringi int'a
		// çevirebiliriz

		int okulNoSayiOlarak = Integer.parseInt(okulNo);

		// System.out.println(okulNo++); okulNo String olarak tanýmlandýðý için
		// matematiksel iþlem yapýlamaz

		System.out.println(++okulNoSayiOlarak);

		Character basHarf = 'a';

		System.out.println(basHarf.charValue());// a yazdýrýr.

		System.out.println(Character.toUpperCase('a'));

	}

}
