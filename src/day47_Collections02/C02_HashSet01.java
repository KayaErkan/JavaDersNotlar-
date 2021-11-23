package day47_Collections02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class C02_HashSet01 {
	


		public static void main(String[] args) {
			
			// verilen bir arraydeki tekrarl� elemanlar� silip 
			// unique elemanlardan olusan bir array'e ceviren bir method yaz�n�z
			
			int arr[] = {2,3,4,3,5,3,6,4,7,4,8,5};
			
			int tekrars�zArray[] = tekrarlar�Sil(arr);
			System.out.println("Main method i�inde array olarak : " + Arrays.toString(tekrars�zArray));
			
		}

		public static int[] tekrarlar�Sil(int[] arr) {
			
			Set<Integer> set1 = new HashSet<>();
			for (Integer each : arr) {
				set1.add(each);
			}
			
			System.out.println("Set olarak method i�inde :" + set1);//[2, 3, 4, 5, 6, 7, 8]
			int tekrars�zArray [] = new int [set1.size()];
			
			int index = 0;
			for (int each :set1) {
				tekrars�zArray[index] = each;
				index++;
			}
			
			
			return tekrars�zArray;
		}


	}

