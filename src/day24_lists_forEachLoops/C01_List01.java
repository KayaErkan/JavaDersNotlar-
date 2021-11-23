package day24_lists_forEachLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C01_List01 {
public static void main(String[] args) {
	/*1) Kullanicidan isimler isteyin ve bunlari bir list’te depolayin.
	     Kullanici yeter yazana kadar isim istemeye devam edin.
        
         Kullanici isim girmeyi bitirdiginde toplam kac isim girdigini ve bunlardan kac
         tanesinin asagidaki listede olan isimlerden oldugunu yazdirin
         
         isimList=Ali , Veli, Ayse, Fatma, Zeki, Kemal
        
         Not : yeter için kucuk buyuk harf onemli degil ancak isimler için önemlidir!
	*/
	
	Scanner scan = new Scanner (System.in);
	List<String> girilenÝsimler = new ArrayList<>();
	String isim;
	
	
	do {
		System.out.println("Lütfen listeye eklemek için isim giriniz \nBitirmek için yeter yaziniz");
		
		isim = scan.nextLine(); // kullanýcýdan isim aldým
		if (!isim.equalsIgnoreCase("yeter")) { // yeter deðilse ismii listeye ekledim
			girilenÝsimler.add(isim);
		}
	}while(!isim.equalsIgnoreCase("yeter")); // kullanýcý yeter yazmadigi sürece tekrar ettim
	
	// karþýlaþtýýrmak istediðimiz listeyi oluþturalým
	// Listenin uzuunluðu deðiþmeyeceði için Array oluþturup list e cevirebilirim
	// böylece 6 ismi tek tek eklemek zorunda kalmam
	
	String isimler [] = {"Ali" , "Veli", "Ayse", "Fatma", "Zeki", "Kemal"};
	List<String> isimList = Arrays.asList(isimler);
	
	// elimizde 2 tane liste var
	// 1- kullanýcýdan aldýgýmýz isimlerin oldugu giirilenÝsimler
	// 2- karþýlaþtýracagýmýz liste ----isimler---
	
	System.out.println("Toplam : " + girilenÝsimler.size() + " isim girdiniz");
	int count = 0;
	for (int i = 0; i < girilenÝsimler.size(); i++) {
		
		if (isimList.contains(girilenÝsimler.get(i))) {
			count++; // eger girdiðimiz isim isimLÝst te varsa count'u bir arttýrdým
		}
	}
	System.out.println("Girdiginiz isimlerden " + count + " tanesi bendeki listede kayitli");
	
	
	
	
	
	
	
	
	
	
	
	
}
}
