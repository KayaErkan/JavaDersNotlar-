package day18_doWhileLoopScope;

import java.util.Scanner;

public class C03_DoWhileLoop02 {

	public static void main(String[] args) {
		/*
		 * Soru 3) Kullanicidan toplamak uzere pozitif sayilar isteyin, 
		 * islemi bitirmek icin 0’a basmasini soyleyin.
 
 			Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve 
 			girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
 			kullanýcý negatif sayi girerse ignore edin
		 */

		// bankacýlýkta kullanýlan menü uygulamalarý while loop ile yapýlýr!!!
		
		Scanner scan = new Scanner(System.in);
	
		double sayi = 5;
		int count = 0;
		double sayýlarToplamý = 0;
		
		do {
			System.out.println("lütfen toplamak için pozitif sayýlar giriniz " 
					+"\nislemi bitirmek için 0'a basýn ");
			sayi = scan.nextDouble();
			// kullanýcýdan aldýðým sayýyý pozitif mi diye konntrol etmeliyiz
			if (sayi > 0) {
				sayýlarToplamý += sayi;
				count++;
			}else if(sayi < 0 ){ System.out.println("pozitif sayý girmeliydiniz" 
					+ "\nbu sayý negatif oldugu için yok sayýyorum");
			}
			
		}
		while(sayi != 0.0);
		
		System.out.println("girdiðiniz sayýlardan " + count + " tanesi pozitif idi"
				+"\nve pozitif sayilarýn toplamý " + sayýlarToplamý);
		
	}

}
