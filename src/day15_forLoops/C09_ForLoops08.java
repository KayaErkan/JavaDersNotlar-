package day15_forLoops;

import java.util.Scanner;

public class C09_ForLoops08 {

	public static void main(String[] args) {
		//  Soru 11 ) Interview Question: Kullanicidan 10�den kucuk bir tamsayi isteyin
		//  ve girilen sayinin faktoryel�ini bulun. (5!=5*4*3*2*1)
		
		Scanner scan =new Scanner (System.in);
		
		System.out.println("l�tfen 10'dan k���k pozitif bir tamsay� girin");
		
		int sayi = scan.nextInt();
		
		int faktoriyel=1;
		
		for (int i = 1; i <= sayi; i++) {
			
			  faktoriyel*=i;
		}
		
		System.out.println("Girdi�iniz say�n�n faktoriyeli : " + faktoriyel);
		
		// kullann�c� 5 girdiyse bu i�lemin sonucunda consolda 5! = 1*2*3*4*5=120 yazd�ral�m 
		// 9-10 �dev
		
		

	}

}
