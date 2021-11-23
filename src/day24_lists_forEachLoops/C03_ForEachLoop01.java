package day24_lists_forEachLoops;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop01 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Ayse");
		list1.add("Fatma");
		list1.add("�mer");
		
		List<String> list2 = new ArrayList<>();
		list2.add("Ali");
		list2.add("Kemal");
		list2.add("Hatice");
		list2.add("Fatma");
		list2.add("�mer");
		list2.add("Yusuf");
		
		// Bu listede ki isimlerden uzunlugu 4 harften fazla olan isimleri yazd�ral�m
		// For-each loop index veya size 'a bakmadan tek tek t�m elemntleri bize getirir
		
		for (String each : list1) {
			if(each.length() > 4) {
				System.out.println(each + " ");
			}
		}

	}

}
