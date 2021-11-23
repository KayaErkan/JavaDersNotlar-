package day22_23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_List01 {

	public static void main(String[] args) {
		
		List <String> isimler = new ArrayList <> ();
		
		// add methodu  listenin sonuna ekleme yapar
		
		isimler.add("Ali");
		System.out.println(isimler); // [Ali]
		isimler.add("veli");
		isimler.add("Ayse");
		isimler.add("Fatma");
		isimler.add("Ali");
		
		System.out.println(isimler);// [Ali, veli, Ayse, Fatma, Ali]
		
		// özel bir indexe eklemek isterseniz, o zaman indexli add methodunu kullanmalýyýz
		
		isimler.add(3, "Nihan");
		System.out.println(isimler); // [Ali, veli, Ayse, Nihan, Fatma, Ali] 
		
		isimler.add(0, "Mehmet");// 
		System.out.println(isimler); // [Mehmet, Ali, veli, Ayse, Nihan, Fatma, Ali]
		
		List <String> yeniList = new ArrayList<>();
		
		yeniList.add("Fýrat");
		System.out.println(yeniList); // Fýrat
		
		// yani list in sonuna isimler listesine eklemek istersem
		
		yeniList.addAll(isimler);
		
		System.out.println(yeniList); // [Fýrat, Mehmet, Ali, veli, Ayse, Nihan, Fatma, Ali]
		
		// birde int elementlerin oldugu liste oluþturalým
		
		List <Integer> sayilar = new ArrayList<>(); // int primitive o yüzden wrapper class yazýlýr non-pri oldugu için
		
		sayilar.add(5);
		
		// yeni liste sayýlar list i ekleyebilirmiyim ?
		// farklý bir data turunden liste veya element ekleyemeyiz
		
		// yeniList.addAll(sayilar);
		// yeniList.add(5);
		
		
		
		
		
		
		
		
		
		
	}

}
