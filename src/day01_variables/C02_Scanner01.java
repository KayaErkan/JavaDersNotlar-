package day01_variables;

import java.util.Scanner;

public class C02_Scanner01 {

	public static void main(String[] args) {
		
		// kullanýcýdan bilgi almak için 3 adýma ihtiyaç var
		// 1- Scannerclassýndan bir object oluþturuyoruz
		
		Scanner scan = new Scanner(System.in);
		
		// 2- kullanýcýya ne istediðimizi bildiren bir mesaj yazýn
		
		System.out.println("Lütfen Ýsminizi Giriniz");
		
		// kullanýcýdan istediðimiz bilginin data türüne göre
		// bir variable olusturup konsolda yazýlan bilgiyi kodlarýmýzýn içine alýyoruz
		
		String kullanýcýnýnÝsmi = scan.nextLine();
		
		System.out.println("Girddiðiniz isim : " + kullanýcýnýnÝsmi );
		
		
		
		
		
		
		
		
	

	}

}
