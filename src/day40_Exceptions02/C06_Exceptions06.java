package day40_Exceptions02;

import java.util.ArrayList;
import java.util.List;

public class C06_Exceptions06 {

	public static void main(String[] args) {
		/*
		  list ve array de var olmayan bir indexle iþlem yapmak isterseniz
		  Java IndexOutOfBoundsException verir.
		 */
		
		int arr [] = {1,2,5,6};
		System.out.println(arr[1]); // 2
		System.out.println(arr[3]); // 6
		//System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
		
		List<String> list = new ArrayList<>();
		list.add("Bahattin");
		list.add("Kazým");
		list.add("Celil");
		System.out.println(list);
		System.out.println(list.get(1)); // Kazým	
		System.out.println(list.get(3)); // IndexOutOfBoundsException
		
		
		
	}

}
