package day22_23_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C04_List04 {

	public static void main(String[] args) {
		// verilen bir arrayde tekrar eden elementleri silip 
		// tekrarsýz yeni bir array haline getirin

		int arr [] = {2,3,5,7,3,5,2,6,3,1,4,2,3,8,5,10}; // length 13
		
		List<Integer> sayilar = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (!sayilar.contains(arr[i])) {
				
				sayilar.add(arr[i]);
			}
		}
		
		System.out.println(sayilar); // liste olarak tekrarsýz elementlerden oluþur
		Collections.sort(sayilar);
		System.out.println("List olarak tekrarsýz sayýlar : " +sayilar);
		
		// Yeni bir array oluþturup bu elementleri yeni bir array e eklemeliyiz
		// yeni arrayýn lengthi 7 olacak
		
		int yeniArr[] = new int [sayilar.size()];
		
		for (int i = 0; i < yeniArr.length; i++) {
			
			yeniArr[i] = sayilar.get(i);
		}
		
		System.out.println("Tekrarsýz Array : " + Arrays.toString(yeniArr));
		
	}

}
