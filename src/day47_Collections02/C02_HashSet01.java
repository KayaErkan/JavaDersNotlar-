package day47_Collections02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class C02_HashSet01 {
	


		public static void main(String[] args) {
			
			// verilen bir arraydeki tekrarlı elemanları silip 
			// unique elemanlardan olusan bir array'e ceviren bir method yazınız
			
			int arr[] = {2,3,4,3,5,3,6,4,7,4,8,5};
			
			int tekrarsızArray[] = tekrarlarıSil(arr);
			System.out.println("Main method içinde array olarak : " + Arrays.toString(tekrarsızArray));
			
		}

		public static int[] tekrarlarıSil(int[] arr) {
			
			Set<Integer> set1 = new HashSet<>();
			for (Integer each : arr) {
				set1.add(each);
			}
			
			System.out.println("Set olarak method içinde :" + set1);//[2, 3, 4, 5, 6, 7, 8]
			int tekrarsızArray [] = new int [set1.size()];
			
			int index = 0;
			for (int each :set1) {
				tekrarsızArray[index] = each;
				index++;
			}
			
			
			return tekrarsızArray;
		}


	}

