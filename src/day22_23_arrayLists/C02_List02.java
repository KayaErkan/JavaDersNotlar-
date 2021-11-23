package day22_23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_List02 {

	public static void main(String[] args) {
		
		List<Integer> sayilar = new ArrayList<>();
		
		sayilar.add(10);
		sayilar.add(20);
		
		System.out.println(sayilar.size()); // 2
		System.out.println(sayilar.isEmpty()); // false
		System.out.println(sayilar);
		
		sayilar.add(30);
		sayilar.add(40);
		System.out.println(sayilar); // [10, 20, 30, 40]
		
		// System.out.println(sayilar.remove(2)); // 30
		// remove methodu 2 iki t�rl� kullan�labilir
		// 1-silmek istedi�imiz elementin indexini yazarsak
		//o elementi siler ve bize delil olarak sildi�i elementi d�nd�r�r
		// yani remove gidip 30 u siler ve sildi�i degeri bize g�sterir
		// yani bunu sildim der tekrardan say�lar� yazd�rd�g�mm�zda 30 hari� kalan say�lar� vercektir
		
		
		System.out.println(sayilar); // [10, 20, 40]
		
		int silinenEleman = sayilar.remove(2);
		sayilar.add(silinenEleman);
		System.out.println(sayilar); // [10, 20, 40, 30]
		
		// remove 2. y�ntem olarak direk silmek istedi�imz de�eri yyazabiliriz 
		
		//sayilar.remove(20);
		// System.out.println(sayilar);
		// !!!!! eger listemiz say�lardan olusuyorsa biz silmesini istedi�imiz elemnti yazdg�m�zda
		// java index olarak alg�lar
		// ama String liste i�in b�yle bir problem olmaz
		
		
		List <String> isimler = new ArrayList<>();
		
		isimler.add("Ali");
		isimler.add("Ayse");
		isimler.add("Zeki");
		
		System.out.println(isimler.remove("Zeki")); // true
		System.out.println(isimler); // [Ali,Ayse]
		
		isimler.remove("Ayse");
		System.out.println(isimler); // [Ali]
		
		boolean sonuc = isimler.remove("Mehmmet");
		
		if (sonuc) {
			System.out.println("Mehmeti buldum ve sildim");
		}else {
			System.out.println("Mehmeti bulamad�m dolay�s�yla da silemedim");
		}
		
		
		isimler.remove(0);
		
		System.out.println(isimler); // []
		
		isimler.add("Ali");
		isimler.add("Ayse");
		isimler.add("Zeki");
		
		System.out.println(isimler); // [Ali, Ayse, Zeki]
		
		isimler.removeAll(isimler);		
		System.out.println(isimler); // []
		
		
		
		

	}

}
