package day20_arrays;

import java.util.Arrays;

public class C04_Arrays04 {

	public static void main(String[] args) {
		String str = "Java, candýr";

		// split methodu bize bir array döner, dönen arrayý ya direk yazdýrmalýyýz
		
		System.out.println(Arrays.toString(str.split(",")));
		// veya methoddan dönen String barindiran bir array oldugundan
		// bir array oluþturup ona assign edebiliriz.
		
		String bolunmusKelimeArray[] = str.split(","); // Java candýr
		System.out.println(bolunmusKelimeArray[1]);// candýr
		
		String bolunmusKelimeArray2[] = str.split("a");
		System.out.println(Arrays.toString(bolunmusKelimeArray2));
		System.out.println(bolunmusKelimeArray2.length);
		
		String bolunmusKelimeArray3[] = str.split(""); // Stringi karakterlere ayýrýr
		                                               // bütün charlar bir eleman olur
		System.out.println(Arrays.toString(bolunmusKelimeArray3));
		System.out.println(bolunmusKelimeArray3.length);
		
		
		// ödev: asagýdaký Stringi terse çevir:
		
		String cumle = "Java ogren, rahat yasa"; // cümle kaç kelimeden oluþur
		String KelimeArrayi[] = cumle.split(" ");
		System.out.println("Cümledeki kelime sayýsý :" + KelimeArrayi.length);
		
		// harf sayýsýný nasýl buluruz:
		String cumle2 = cumle.replaceAll("\\W","");
		System.out.println(cumle2);
		System.out.println(cumle2.length());
		
		String harfArrayi[] = cumle2.split("");
		System.out.println(harfArrayi.length);
		
		
		
	}

}
