package day45_Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterators01 {

	public static void main(String[] args) {

		List<String> list =new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		System.out.println(list);//[A, B, C, D]
		
		// her elemana B harfi ekleyelim
		
		for (String each : list) {
			each += "B";
			System.out.print(each + " ");
		}
		System.out.println(" ");
		System.out.println(list);//[A, B, C, D]
		
		// collectýons'da her yapý index'i desteklemez: Ornegin Sat'de index olmaz
		// index olmayýnca mecburen tum elemanlara ulaþmak için For-each loop kullanýlýr
		//For-each loop ile de update veya delete yapamayýz
		// bunun için java iterator Interface'sini olusturmustur.....
		
		Iterator it1 = list.iterator();
		// next(),hasnext(),remove() methodlarýna sahiptir
		// listedeki tum elemanlarý ýterator kullanarak silelim
		
		while (it1.hasNext()) {
			it1.next();
			it1.remove();
		}
		System.out.println(list); // []
		System.out.println(list.size()); // 0
		
		
		
		
		
		
	}

}
