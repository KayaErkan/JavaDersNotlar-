package day15_forLoops;

import java.util.Scanner;

public class C10_ForLoops09HomeWork {

	public static void main(String[] args) {
		//Soru 11 ) Interview Question: Kullanicidan 10�den kucuk bir tamsayi isteyin
		// kullann�c� 5 girdiyse bu i�lemin sonucunda consolda 5! = 1*2*3*4*5=120 yazd�ral�m

		
		Scanner scan =new Scanner (System.in);
		System.out.println("l�tfen 10'dan k���k pozitif bir tamsay� girin");
		
		int sayi = scan.nextInt();
		
		int faktoriyel=1;
		System.out.print(sayi + "! = ");
		for (int i = 1; i <= sayi; i++) {
			faktoriyel = faktoriyel*i;
			System.out.print(i);
			if (i != sayi) {
				System.out.print("*");
			}
			  
		}
		
		System.out.print(" = " + faktoriyel);
		
		
		
		
		
		
		
		
		
		
	}

}
