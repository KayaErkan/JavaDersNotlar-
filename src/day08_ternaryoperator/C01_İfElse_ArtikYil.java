package day08_ternaryoperator;

import java.util.Scanner;

public class C01_�fElse_ArtikYil {

	public static void main(String[] args) {
		
		
		/*Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
		Kural 1: 4 ile bolunemeyen yillar artik yil degildir
		Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
		Kural 3: 4�un kati olmasina ragmen 100 ile bolunebilen yillardan 
		sadece 400�un kati olan yillar artik yildir */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("L�tfen art�k yil kontrol� i�in bir y�l giriniz :");
		
		int y�l = scan.nextInt();
		
		if(y�l % 4 != 0) {
			System.out.println("Girdi�iniz y�l art�k y�l de�il");
		}else if (y�l % 100 != 0) {
			System.out.println("Girdi�iniz y�l art�k y�ld�r");
		}else if(y�l % 400 == 0) {
			System.out.println("Girdi�iniz y�l Art�k y�ld�r");
		}else {
			System.out.println("Girdi�iniz y�l art�k y�l de�ildir");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
