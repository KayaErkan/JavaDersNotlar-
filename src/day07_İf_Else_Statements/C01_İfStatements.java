package day07_�f_Else_Statements;

import java.util.Scanner;

public class C01_�fStatements {

	public static void main(String[] args) {
		
		/* 3) Kullsn�c�dan g�n ismini al�n ve hafta i�i veya haftasonu oldu�unu yazd�r�n
		 * �rnek:gun=pazar output = "hafta sonu"
		 * gun = sal� output = "hafta i�i"
		 * *** String i�in equals methodu kullan�n
		 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("L�tfen g�n ismini giriniz...");
		
		String gun�smi = scan.next().toLowerCase();
		
		// bayrak kullan�m� (flag)
		int flag = 0;
		
		if(gun�smi.equals("pazaretesi") || gun�smi.equals("sal�") || gun�smi.equals("carsamba") 
				|| gun�smi.equals("persembe") || gun�smi.equals("cuma" )) {
			
			System.out.println("Girdiginiz gun haftaici");
			flag++;
		}
		if(gun�smi.equals("cumartesi")  || gun�smi.equals("pazar"))  {
			
			System.out.println("Girdi�iniz g�n hafta sonu");
			flag++;
		}
		
		// pazar ==> flag = 1 2. if body'si calisacak
		// sali ==> flag = 1  1. �f body'si �al��acak
		// pezer ==> flag = 0
		
		if(flag == 0) {
			System.out.println("Lutfen gecerli bir gun ismi yaziniz");
		}
		
		
		scan.close();
		
		
		
		
		if ( 5 > 7 || 10 < 6 ) {

	        System.out.println("Elma");

	} else {

	      System.out.println("Armut");

	}
		
		
		
		

	}

}
