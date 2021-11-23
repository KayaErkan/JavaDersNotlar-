package day15_forLoops;

import java.util.Scanner;

public class C11_ForLoops10HomeWork {

	public static void main(String[] args) {
		// // Soru 9 ) Interview Question : Kullanicidan bir String isteyin. 
		//             Kullaniciningirdigi String'in
		//             palindrome olup olmadigini kontrol eden bir program yazin.
		 
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String kelime = scan.nextLine();
		String terstenKelime = "";
		
		for (int i = 0; i < kelime.length ();i++) {
			terstenKelime += kelime.substring(kelime.length()-1-i, kelime.length() -i);
		}
		if(kelime.equals(terstenKelime)) {
			System.out.println("girilen isim palindromdur");
		}else {
			System.out.println("girilen isim palindrom deðildir");
		}
		
		
		
		

	}

}
