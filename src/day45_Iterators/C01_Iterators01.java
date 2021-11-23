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
		
		// collect�ons'da her yap� index'i desteklemez: Ornegin Sat'de index olmaz
		// index olmay�nca mecburen tum elemanlara ula�mak i�in For-each loop kullan�l�r
		//For-each loop ile de update veya delete yapamay�z
		// bunun i�in java iterator Interface'sini olusturmustur.....
		
		Iterator it1 = list.iterator();
		// next(),hasnext(),remove() methodlar�na sahiptir
		// listedeki tum elemanlar� �terator kullanarak silelim
		
		while (it1.hasNext()) {
			it1.next();
			it1.remove();
		}
		System.out.println(list); // []
		System.out.println(list.size()); // 0
		
		
		
		
		
		
	}

}
