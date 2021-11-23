package day50_Maps02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C02_Maps02 {

	public static void main(String[] args) {
		
		// verilen bir string de ki harflerin kacar kez kullanýldýgýný 
		// return eden bir method yazýnýz
		//ornek: input: hellooo output: H=1, e= 1, l = 2, O = 3
		String input = "Hellooo";
		Map<String, Integer> methoddanGelenMap = harfSayisiBul(input);
		System.out.println(methoddanGelenMap);
		

	}

	public static Map<String, Integer> harfSayisiBul(String input) {
		
		String harfler[] = input.split("");
		System.out.println(Arrays.toString(harfler));
		Map<String, Integer>harfKullanýmSayýsý = new HashMap<>();
		
		for (String each : harfler) {
			if(!harfKullanýmSayýsý.containsKey(each)) {
				harfKullanýmSayýsý.put(each , 1);
				
			}else {
				harfKullanýmSayýsý.put(each , harfKullanýmSayýsý.get(each)+1);
			}
			
		}
		
		
		return harfKullanýmSayýsý;
	}

}
