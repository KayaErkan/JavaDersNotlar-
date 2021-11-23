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
		// remove methodu 2 iki türlü kullanýlabilir
		// 1-silmek istediðimiz elementin indexini yazarsak
		//o elementi siler ve bize delil olarak sildiði elementi döndürür
		// yani remove gidip 30 u siler ve sildiði degeri bize gösterir
		// yani bunu sildim der tekrardan sayýlarý yazdýrdýgýmmýzda 30 hariç kalan sayýlarý vercektir
		
		
		System.out.println(sayilar); // [10, 20, 40]
		
		int silinenEleman = sayilar.remove(2);
		sayilar.add(silinenEleman);
		System.out.println(sayilar); // [10, 20, 40, 30]
		
		// remove 2. yöntem olarak direk silmek istediðimz deðeri yyazabiliriz 
		
		//sayilar.remove(20);
		// System.out.println(sayilar);
		// !!!!! eger listemiz sayýlardan olusuyorsa biz silmesini istediðimiz elemnti yazdgýmýzda
		// java index olarak algýlar
		// ama String liste için böyle bir problem olmaz
		
		
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
			System.out.println("Mehmeti bulamadým dolayýsýyla da silemedim");
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
