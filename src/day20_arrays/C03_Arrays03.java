package day20_arrays;

import java.util.Arrays;

public class C03_Arrays03 {

	public static void main(String[] args) {
		// verilen bir Array i b�y�kten k����e s�ralayan bir method yaz�n�z?

		int arr []= {3,15,10,11,9};
		
		arr = arrayiSirala(arr);
		
		arr = arrayiTerstenSirala(arr);
		
	}

	public static int [] arrayiTerstenSirala(int[] arr) {
		int [] temp = new int [arr.length]; // eski array ile ayn� uzunlukta bir array olu�turdum
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[arr.length-1-i];
		}
		// temp arrayi istedi�im gibi arr nin ters s�ralan��� oldu,
		// bunu main methoda d�nd�rmem(return) laz�m
		return temp;
	}

	public static int[] arrayiSirala(int[] arr) {
		// �ncelikl�e array� k���kten b�y�ge s�ralamal�y�z
		Arrays.sort(arr);
		return arr;
	}

	

}
