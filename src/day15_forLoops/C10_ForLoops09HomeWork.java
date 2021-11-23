package day15_forLoops;

import java.util.Scanner;

public class C10_ForLoops09HomeWork {

	public static void main(String[] args) {
		//Soru 11 ) Interview Question: Kullanicidan 10’den kucuk bir tamsayi isteyin
		// kullannýcý 5 girdiyse bu iþlemin sonucunda consolda 5! = 1*2*3*4*5=120 yazdýralým

		
		Scanner scan =new Scanner (System.in);
		System.out.println("lütfen 10'dan küçük pozitif bir tamsayý girin");
		
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
