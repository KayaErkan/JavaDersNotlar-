package day21_multidimensionalArrays;

public class C02_MDArrays02 {

	public static void main(String[] args) {
		// Soru 1 ) Asagidaki multi dimensional array�in tum elemanlarinin 
		// carpimini ekrana  yazdiran bir method yaziniz. 
		// { {1,2,3}, {4,5,6} }

		int arr [][] = {{1,2,3} , {4,5,6}};
		
		int carpim = 1;
		 
		for (int i = 0; i < arr.length; i++) {// outer  array i�in
			
			for (int j = 0; j < arr[i].length; j++) {
			
				carpim *= arr[i][j];
				
				System.out.print(arr[i][j] + " ");
				
			}
		}
		 System.out.println("\nt�m elementlerin carpimi : " + carpim);
		
		
		
		
		
		
	}

}
