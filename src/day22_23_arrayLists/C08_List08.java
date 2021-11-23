package day22_23_arrayLists;

import java.util.Arrays;
import java.util.List;

public class C08_List08 {

	public static void main(String[] args) {
	// Arrayi Liste çevirmek
		
		String arr [] = {"3", "5", "7"};
		
		List<String> arrList = Arrays.asList(arr);
		
		System.out.println("list olarak " + arrList);
		
		arr[1] = "Ali"; // arrayýn bir elemanýný deðiþtirdiðimde
		                // otomatýk olarak list'i de deðiþtiriyor
		
		System.out.println("List olarak2 " + arrList);
		
		arrList.set(0, "Ayse");// biz listeden deðiþtirdik ama
							  // java arrayi de deðiþtiriyor
		System.out.println("list : " + arrList);
		System.out.println("Array : " + Arrays.toString(arr));
		// list kullanýmý arraye göre her zaman avantajlýdýr
		// bazý elementler kullanýlmýyor ise onlarýn çýkarýlmasý veya eklenmesi gereken 
		// elementlerin eklenmesi için list kullanmak avantajdýr
		

	}

}
