package day20_arrays;

import java.util.Arrays;

public class C03_Arrays03 {

	public static void main(String[] args) {
		// verilen bir Array i büyükten küçüðe sýralayan bir method yazýnýz?

		int arr []= {3,15,10,11,9};
		
		arr = arrayiSirala(arr);
		
		arr = arrayiTerstenSirala(arr);
		
	}

	public static int [] arrayiTerstenSirala(int[] arr) {
		int [] temp = new int [arr.length]; // eski array ile ayný uzunlukta bir array oluþturdum
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[arr.length-1-i];
		}
		// temp arrayi istediðim gibi arr nin ters sýralanýþý oldu,
		// bunu main methoda döndürmem(return) lazým
		return temp;
	}

	public static int[] arrayiSirala(int[] arr) {
		// önceliklþe arrayý küçükten büyüge sýralamalýyýz
		Arrays.sort(arr);
		return arr;
	}

	

}
