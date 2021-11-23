package day45_Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_Iterators03 {

	public static void main(String[] args) {
		/*
		 Bir listede ki istenen sayi aralýgýnda olmayan elementleri silen
		 bir program yazýnýz....
		 (2. liste olusturmadan, gecerli liste uzerinde islem yapýnýz)
		 	örn:
		 	[2,13,56,23,45,14,40] istenen aralýk 20 ile 40 arasý(sýnýrlar dahil)
		 	output:[23,40]
		 */
		
		List<Integer> sayiListesi = new ArrayList<>();
		sayiListesi.add(2);
		sayiListesi.add(13);
		sayiListesi.add(56);
		sayiListesi.add(23);
		sayiListesi.add(45);
		sayiListesi.add(14);
		sayiListesi.add(40);
		
		
		ListIterator li1 = sayiListesi.listIterator();
		while(li1.hasNext()) {
			int temp = 	(int) li1.next();
		
			if(	temp < 20 || temp > 40) {
			li1.remove();
		}
			
		}
		System.out.println(sayiListesi);
	}

}
