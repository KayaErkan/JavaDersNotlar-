package day07_Ýf_Else_Statements;

import java.util.Scanner;

public class C04_ÝfElse03 {

	public static void main(String[] args) {
		
		/* 3) kullanýcýya yaþýný sorun,
		 * eger yaþ 65'e eþit veya küçük ise "emekli olamazsýn , çalýþmalýsýn"
		 * 65'ten büyükse "emekli olabilirsin"
		 */
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Lütfen yaþýnýzý giriniz");
		
		int yas = scan.nextInt();
		
		if (yas <= 65 ) {
			System.out.println("emekli olamazsýn, çalýþmalýsýn");
		}else {
			System.out.println("emekli olabilirsin");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
