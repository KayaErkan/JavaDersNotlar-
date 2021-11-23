package day08_ternaryoperator;

import java.util.Scanner;

public class C02_ÝfElse_ArtikYil2 {

	public static void main(String[] args) {
		
		/*Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
        Kural 1: 4 ile bolunemeyen yillar artik yil degildir 
        Kural 2: 4’un kati olmasina ragmen 100 ile    bolunebilen yillardan 
                 sadece 400’un kati olan yillar artik yildir
		*/
		
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lütfen artik yil kontrolü için bir yil giriniz");
		
		int yýl = scan.nextInt();
				
		if(yýl % 4 != 0) {
			System.out.println("Girdiðiniz yýl Artýk yýl Deðildir");
		}else {
			
			if(yýl % 100 == 0 && yýl % 400 == 0) {
				System.out.println("Girdiðiniz yýl artýk yýl");
			} else if (yýl % 100 == 0 && yýl % 400 != 0) {
				System.out.println("Girdiðiniz yýl artýk yýl deðildirxx");
			}else {
				System.out.println("Girdiðiniz yýl artýk yýldýrxx");
			}
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
