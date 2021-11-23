package day15_forLoops;

import java.util.Scanner;

public class C09_ForLoops08 {

	public static void main(String[] args) {
		//  Soru 11 ) Interview Question: Kullanicidan 10’den kucuk bir tamsayi isteyin
		//  ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		
		Scanner scan =new Scanner (System.in);
		
		System.out.println("lütfen 10'dan küçük pozitif bir tamsayý girin");
		
		int sayi = scan.nextInt();
		
		int faktoriyel=1;
		
		for (int i = 1; i <= sayi; i++) {
			
			  faktoriyel*=i;
		}
		
		System.out.println("Girdiðiniz sayýnýn faktoriyeli : " + faktoriyel);
		
		// kullannýcý 5 girdiyse bu iþlemin sonucunda consolda 5! = 1*2*3*4*5=120 yazdýralým 
		// 9-10 ödev
		
		

	}

}
