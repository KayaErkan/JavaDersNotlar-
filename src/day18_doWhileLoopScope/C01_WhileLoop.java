package day18_doWhileLoopScope;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
		// kullanýcýdan iki pozitif sayý isteyin
		// kullanýcý negatif sayý girdiðinde 
		// girilen negatif sayýlarý yok sayýp yeniden deger isteyin
		// kullanýcý dogru giris yaptýgýnda "well done" ve sayýlarýn carpýmýný yazdýrýn
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("lütfen iki pozitif tam sayý giriniz");
		
		// önce sart sonra iþlem olursa mecburen basta deger atadýk
		
		
		// sayý atamasý yaparken de isttemediðimiz degeri atayacaz  
		// cünkü istediðimiz deðeri verirsek loop çalýþmaz
		int sayi1 = 0;
		int sayi2 =0;
		// condition olarak parantez içine istemediðimiz yani saglanmayacak olan durumu yazacaz
		// conditionu þu þekilde de yapabilirdik (!(sayi1 > 0 && sayi2 > 0)) bu durumda þartý saglamýyor olacak
		
		while (sayi1 <= 0 || sayi2 <= 0) {
			sayi1 = scan.nextInt();
			sayi2 = scan.nextInt();
			if(sayi1 > 0 && sayi2 >0) {
				System.out.println("well done \ngirilen sayýlarýn carpýmý : " + (sayi1*sayi2));
			}else {
				System.out.println("lütfen iki pozitif tam sayý girin");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
