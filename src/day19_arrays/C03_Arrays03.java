package day19_arrays;

import java.util.Arrays;

public class C03_Arrays03 {

	public static void main(String[] args) {
		
		int arr [] =new int [5];
		System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0]
		// ben 1 iken oluşturdugum array i sonradan uzunlugunu değiştirebilirmiyim?
		
		// [0, 0, 0, 0, 0,5]

		// arr[5] = 5;
		
		// array'in length i sonradan değiştirilemez
		// arrayin kullanışsız kılan da bu özelliğidir
		
		arr[2] = 1;
		System.out.println(Arrays.toString(arr)); // [0, 0, 1, 0, 0]

		
		arr = new int [6]; // bu ekleme yapmaz,deger olarak 6 elemanlık yeni bir array yapar.
		System.out.println(Arrays.toString(arr)); // 0, 0, 0, 0, 0, 0]
		
		
		// ARRAY'in length i DEGİŞTİRİLEMEZ!!!!!!!!
		
		
		
	}

}
