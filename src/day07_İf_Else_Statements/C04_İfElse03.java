package day07_�f_Else_Statements;

import java.util.Scanner;

public class C04_�fElse03 {

	public static void main(String[] args) {
		
		/* 3) kullan�c�ya ya��n� sorun,
		 * eger ya� 65'e e�it veya k���k ise "emekli olamazs�n , �al��mal�s�n"
		 * 65'ten b�y�kse "emekli olabilirsin"
		 */
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("L�tfen ya��n�z� giriniz");
		
		int yas = scan.nextInt();
		
		if (yas <= 65 ) {
			System.out.println("emekli olamazs�n, �al��mal�s�n");
		}else {
			System.out.println("emekli olabilirsin");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
