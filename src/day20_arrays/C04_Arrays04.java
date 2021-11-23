package day20_arrays;

import java.util.Arrays;

public class C04_Arrays04 {

	public static void main(String[] args) {
		String str = "Java, cand�r";

		// split methodu bize bir array d�ner, d�nen array� ya direk yazd�rmal�y�z
		
		System.out.println(Arrays.toString(str.split(",")));
		// veya methoddan d�nen String barindiran bir array oldugundan
		// bir array olu�turup ona assign edebiliriz.
		
		String bolunmusKelimeArray[] = str.split(","); // Java cand�r
		System.out.println(bolunmusKelimeArray[1]);// cand�r
		
		String bolunmusKelimeArray2[] = str.split("a");
		System.out.println(Arrays.toString(bolunmusKelimeArray2));
		System.out.println(bolunmusKelimeArray2.length);
		
		String bolunmusKelimeArray3[] = str.split(""); // Stringi karakterlere ay�r�r
		                                               // b�t�n charlar bir eleman olur
		System.out.println(Arrays.toString(bolunmusKelimeArray3));
		System.out.println(bolunmusKelimeArray3.length);
		
		
		// �dev: asag�dak� Stringi terse �evir:
		
		String cumle = "Java ogren, rahat yasa"; // c�mle ka� kelimeden olu�ur
		String KelimeArrayi[] = cumle.split(" ");
		System.out.println("C�mledeki kelime say�s� :" + KelimeArrayi.length);
		
		// harf say�s�n� nas�l buluruz:
		String cumle2 = cumle.replaceAll("\\W","");
		System.out.println(cumle2);
		System.out.println(cumle2.length());
		
		String harfArrayi[] = cumle2.split("");
		System.out.println(harfArrayi.length);
		
		
		
	}

}
