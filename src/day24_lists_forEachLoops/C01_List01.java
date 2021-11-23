package day24_lists_forEachLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C01_List01 {
public static void main(String[] args) {
	/*1) Kullanicidan isimler isteyin ve bunlari bir list�te depolayin.
	     Kullanici yeter yazana kadar isim istemeye devam edin.
        
         Kullanici isim girmeyi bitirdiginde toplam kac isim girdigini ve bunlardan kac
         tanesinin asagidaki listede olan isimlerden oldugunu yazdirin
         
         isimList=Ali , Veli, Ayse, Fatma, Zeki, Kemal
        
         Not : yeter i�in kucuk buyuk harf onemli degil ancak isimler i�in �nemlidir!
	*/
	
	Scanner scan = new Scanner (System.in);
	List<String> girilen�simler = new ArrayList<>();
	String isim;
	
	
	do {
		System.out.println("L�tfen listeye eklemek i�in isim giriniz \nBitirmek i�in yeter yaziniz");
		
		isim = scan.nextLine(); // kullan�c�dan isim ald�m
		if (!isim.equalsIgnoreCase("yeter")) { // yeter de�ilse ismii listeye ekledim
			girilen�simler.add(isim);
		}
	}while(!isim.equalsIgnoreCase("yeter")); // kullan�c� yeter yazmadigi s�rece tekrar ettim
	
	// kar��la�t��rmak istedi�imiz listeyi olu�tural�m
	// Listenin uzuunlu�u de�i�meyece�i i�in Array olu�turup list e cevirebilirim
	// b�ylece 6 ismi tek tek eklemek zorunda kalmam
	
	String isimler [] = {"Ali" , "Veli", "Ayse", "Fatma", "Zeki", "Kemal"};
	List<String> isimList = Arrays.asList(isimler);
	
	// elimizde 2 tane liste var
	// 1- kullan�c�dan ald�g�m�z isimlerin oldugu giirilen�simler
	// 2- kar��la�t�racag�m�z liste ----isimler---
	
	System.out.println("Toplam : " + girilen�simler.size() + " isim girdiniz");
	int count = 0;
	for (int i = 0; i < girilen�simler.size(); i++) {
		
		if (isimList.contains(girilen�simler.get(i))) {
			count++; // eger girdi�imiz isim isimL�st te varsa count'u bir artt�rd�m
		}
	}
	System.out.println("Girdiginiz isimlerden " + count + " tanesi bendeki listede kayitli");
	
	
	
	
	
	
	
	
	
	
	
	
}
}
