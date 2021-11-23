package day14_methodCreationForLoop;

import java.util.Scanner;

public class C02_MethodCreation02 {

	public static void main(String[] args) {
		/*Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. 
		   Kullanici 2,3 veya 4 degerini girerse,
		   kullanicidan bu sayilari girmesini isteyin 
		   ve sayilarin toplamini yazdirin. 
		   Kullanici toplamak istedigi sayi adedini 
		   4’den buyuk girerse “Cok sayi girdiniz, ben toplayamam” yazdirin.*/
		
		Scanner scan = new Scanner (System.in);
		System.out.println("kaç sayý toplamak istersiniz :");
		int sayiAdedi = scan.nextInt();
		
		if (sayiAdedi < 2) {
			System.out.println("toplamak için en az 2 sayi girmelisiniz");
		}else if (sayiAdedi == 2) {
			ikiSayiTopla();
		}else if (sayiAdedi == 3) {
			ucSayiTopla();
		}else if (sayiAdedi == 4) {
			dortSayiTopla();
		}else {
			System.out.println("Çok sayý girdiniz,ben toplayamam");
		}
		
	}

	public static void dortSayiTopla() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen dort tamsayý giriniz");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int sayi3 = scan.nextInt();
		int sayi4 = scan.nextInt();
		System.out.println("Dort sayý girmeyi tercih ettiniz" 
				+ "\nGirilen dort sayýnýn toplamý : " + (sayi1 + sayi2 + sayi3 + sayi4));
		
	}

	public static void ucSayiTopla() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen uc tamsayý giriniz");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int sayi3 = scan.nextInt();
		System.out.println("Uc sayý girmeyi tercih ettiniz" 
				+ "\nGirilen uc sayýnýn toplamý : " + (sayi1 + sayi2 + sayi3));
		
	}

	public static void ikiSayiTopla() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen iki tamsayý giriniz");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		System.out.println("Ýki sayý girmeyi tercih ettiniz" 
				+ "\nGirilen iki sayýnýn toplamý : " + (sayi1 + sayi2));
		
	}

}
