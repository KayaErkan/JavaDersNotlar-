package day40_Exceptions02;

import java.util.Scanner;

public class C08_Exceptions08 {

	public static void main(String[] args) {
		/*
		 	Kullan�c�dan carpma yapmak i�in bir String isteyin 
		 	Kullan�c�n�n girdigi String saadece say�lardan olusuyorsa say�y� 2 ile
		 	carp�p sonucu yazd�r�n.
		 	Kullan�c� say�lardana olusmayan bir String girerse 
		 	"Girdiginiz String say�ya cevrilemez" yazd�r�n
		 */
		
		Scanner scan =new Scanner (System.in);
		System.out.println("l�tfen 2 ile carpmak i�in biir String giriniz:");
		String str = scan.nextLine();
		
		try {
		System.out.println(2*Integer.parseInt(str));
		}catch (NumberFormatException e) {
			System.out.println("Girdiginiz String say�ya cevrilemez");
		}
	}

}
