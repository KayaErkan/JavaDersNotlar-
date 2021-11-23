package day22_23_arrayLists;

import java.util.Arrays;
import java.util.List;

public class C08_List08 {

	public static void main(String[] args) {
	// Arrayi Liste �evirmek
		
		String arr [] = {"3", "5", "7"};
		
		List<String> arrList = Arrays.asList(arr);
		
		System.out.println("list olarak " + arrList);
		
		arr[1] = "Ali"; // array�n bir eleman�n� de�i�tirdi�imde
		                // otomat�k olarak list'i de de�i�tiriyor
		
		System.out.println("List olarak2 " + arrList);
		
		arrList.set(0, "Ayse");// biz listeden de�i�tirdik ama
							  // java arrayi de de�i�tiriyor
		System.out.println("list : " + arrList);
		System.out.println("Array : " + Arrays.toString(arr));
		// list kullan�m� arraye g�re her zaman avantajl�d�r
		// baz� elementler kullan�lm�yor ise onlar�n ��kar�lmas� veya eklenmesi gereken 
		// elementlerin eklenmesi i�in list kullanmak avantajd�r
		

	}

}
