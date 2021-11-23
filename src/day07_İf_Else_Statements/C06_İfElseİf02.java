package day07_İf_Else_Statements;

import java.util.Scanner;

public class C06_İfElseİf02 {

	public static void main(String[] args) {
		/* 3) Kullsnıcıdan gün ismini alın ve hafta içi veya haftasonu olduğunu yazdırın
		 * örnek:gun=pazar output = "hafta sonu"
		 * gun = salı output = "hafta içi"
		 * *** String için equals methodu kullanın
		 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lütfen gün ismini giriniz...");
		
		String gunİsmi = scan.next().toLowerCase();
		
		
		
		if(gunİsmi.equals("pazaretesi") || gunİsmi.equals("salı") || gunİsmi.equals("carsamba") 
				|| gunİsmi.equals("persembe") || gunİsmi.equals("cuma" )) {
			
			System.out.println("Girdiginiz gun haftaici");
			
		}else if(gunİsmi.equals("cumartesi")  || gunİsmi.equals("pazar"))  {
			
			System.out.println("Girdiğiniz gün hafta sonu");
			
		}else {
			System.out.println(" Lütfen Geçerli Gün Adı Giriniz");
		}
		
		scan.close();

	}

}
