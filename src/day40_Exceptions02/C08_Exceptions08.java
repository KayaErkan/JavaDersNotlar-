package day40_Exceptions02;

import java.util.Scanner;

public class C08_Exceptions08 {

	public static void main(String[] args) {
		/*
		 	Kullanýcýdan carpma yapmak için bir String isteyin 
		 	Kullanýcýnýn girdigi String saadece sayýlardan olusuyorsa sayýyý 2 ile
		 	carpýp sonucu yazdýrýn.
		 	Kullanýcý sayýlardana olusmayan bir String girerse 
		 	"Girdiginiz String sayýya cevrilemez" yazdýrýn
		 */
		
		Scanner scan =new Scanner (System.in);
		System.out.println("lütfen 2 ile carpmak için biir String giriniz:");
		String str = scan.nextLine();
		
		try {
		System.out.println(2*Integer.parseInt(str));
		}catch (NumberFormatException e) {
			System.out.println("Girdiginiz String sayýya cevrilemez");
		}
	}

}
