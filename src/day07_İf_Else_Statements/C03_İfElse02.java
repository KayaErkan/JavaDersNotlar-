package day07_İf_Else_Statements;

import java.util.Scanner;

public class C03_İfElse02 {

	public static void main(String[] args) {
		
		/*Soru 2) Kullanicidan bir karakter girmesini isteyin
		 *  ve girilen karakterin harf olup olmadigini yazdirin
		 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lütfen bir karakter giriniz");
		
		char karakter = scan.next().charAt(0);
		
		if (karakter >= 'A' && karakter <= 'Z' || karakter >= 'a' && karakter <= 'z' ) {
			System.out.println("Girilen karakter harf");
		} else {
			System.out.println("Girilen karakter harf değil");
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
