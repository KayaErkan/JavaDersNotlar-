package day29_passByValue_mutableClass;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue01 {

	public static void main(String[] args) {
		// Soru3 : Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. Iki method olusturup
		// list elemanlarini artirmayi deneyelim
		// - 1. Method’da elemanlari for each loop kullanarak artirin
		// - 2. Method’da elemanlari set method’u kullanarak artirin
		// - Method’lari arka arkaya cagirip artislarin kalici olup olmadiklarini kontrol edelim.
		
		List<Integer> sayiList = new ArrayList<>();
		
		sayiList.add(10);
		
		sayiList.add(11);
		
		sayiList.add(12);
		
		System.out.println("ilk olusturdugumuz liste : " + sayiList);		// [10, 11, 12] yazdirir
		
		forLoopIleArttir(sayiList);
	
		System.out.println("For loop method' undan sonra list : " + sayiList); // [10, 11, 12] yazdirir
		
		setIleArttir(sayiList);
		
		System.out.println("Set method' undan sonra list : " + sayiList);	// [15, 16, 17] yazdirir
	}	
	private static void setIleArttir(List<Integer> sayiList) {
		
		// set ile elemanlari attiralim
		
		for (int i = 0; i < sayiList.size(); i++) {
			
			sayiList.set(i, sayiList.get(i) + 5);
			
		}
		
		// loop' dan sonra listeyi yazdiralim
		
		System.out.println("Set method' u icinde arttirimdan sonra list : " + sayiList); // [15, 16, 17] yazdirir
		
	}
	private static void forLoopIleArttir(List<Integer> sayiList) {
		
		// for loop ile elemanlari arttiralim
		
		System.out.print("For each loop ile arttirdigimiz elementler : ");		// 15 16 17 yazdirir
		
		for (Integer each : sayiList) {			// each loop' un disina cikamaz
			
			each += 5;
			
			System.out.print(each + " ");
			
		}
		
		System.out.println("");
		
		System.out.println("For each loop' dan sonraki list : " + sayiList); // [10, 11, 12] yazdirir
						
		// for each loop' da atama yapamadigim icin listeyi kalici olarak degistiremedim
		
		// for loop kullanip get method' u ile elementleri cagirinca da atama yapamadim. Dolayisiyla
		// for loop ile elementleri kalici olarak degistiremedik
	}	

	

}
