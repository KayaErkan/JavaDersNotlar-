package day07_�f_Else_Statements;

import java.util.Scanner;

public class C06_�fElse�f02 {

	public static void main(String[] args) {
		/* 3) Kullsn�c�dan g�n ismini al�n ve hafta i�i veya haftasonu oldu�unu yazd�r�n
		 * �rnek:gun=pazar output = "hafta sonu"
		 * gun = sal� output = "hafta i�i"
		 * *** String i�in equals methodu kullan�n
		 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("L�tfen g�n ismini giriniz...");
		
		String gun�smi = scan.next().toLowerCase();
		
		
		
		if(gun�smi.equals("pazaretesi") || gun�smi.equals("sal�") || gun�smi.equals("carsamba") 
				|| gun�smi.equals("persembe") || gun�smi.equals("cuma" )) {
			
			System.out.println("Girdiginiz gun haftaici");
			
		}else if(gun�smi.equals("cumartesi")  || gun�smi.equals("pazar"))  {
			
			System.out.println("Girdi�iniz g�n hafta sonu");
			
		}else {
			System.out.println(" L�tfen Ge�erli G�n Ad� Giriniz");
		}
		
		scan.close();

	}

}
