package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;


public class C07_WhileLoops05 {

	public static void main(String[] args) {
		/*
		 Kullanýcýdan toplamak üzere sayý isteyin
		 toplam 200 oluncaya kadar sayi istemeye devam edin
		 toplam 200 ü gectiðinde
		 kullanýcýnýn kkaç sayý girdiðini ve bu sayýlarýn toplamýný yazdýrýn
 		 */
		// For loop ta bir iþlem yapabilmek için tekrar sayýsýný bilmek lazým
		// While loop da ise adým sayýsý deðil bitirme kosulu onemlýdýr
		
		Scanner scan = new Scanner (System.in);
		
		
		int sayi = 0;
		int toplam = 0;
		int sayac = 0;
		
		while (toplam<200) {
			System.out.println("Lütfen toplamak için bir tam sayý girin");
			sayi = scan.nextInt();
			toplam += sayi;
			sayac++;
		}
		
		// toplamýn 200 ü gectiðinden eminiz
		
		System.out.println("toplam " + sayac + " adet sayý girdiniz ve bu sayýlarýn toplamý : " + toplam);
		
		// *** eger adým saayýsý bilinmiyor veya öngörulemýyorsa
		// foor loop deðil do while loop kullanmak daha mantýklýdýr
		// eger adýmlar belli ise for loop kullanmak daha mantýklý oolabillir
		//iki fazla satýr  yazmakta,
		// veya deðiþimi unutup sonsuz loop'a girmekten kurtulmuþ oluruz.
		
	
		
	
	}

}
