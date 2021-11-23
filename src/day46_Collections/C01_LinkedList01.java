package day46_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList01 {

	public static void main(String[] args) {
		
		// linked baglý demek
		// linked list te tum elemanlar tren gibi birbirine baglýdýr
		
		//collectýons larda obj olustururken ;
		// olusturmak istedigimiz collectýon'ýn class mý yoksa ýnterface 'mý olduguna bakmalýyýz
		// eger olusturmak istedigimiz coll.interface ýse 
		// data turu olarak o ýnterface'i, cons. olarak ise uygun bir class secmeliyiz
		//simdiye kadar LÝst(ýnterface) olustururken cons olarak ArrayList() seciyorduk
		
		List<String> list = new ArrayList<>();
		list.add("X");
		list.add("Y"); // [X ,Y]
		
		
		LinkedList<String> ll1 = new LinkedList<>();
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);//[A, B]
		ll1.add(1,"C");
		System.out.println(ll1);//[A, C, B]
		ll1.addAll(list);
		System.out.println(ll1);//[A, C, B, X, Y]
		ll1.addAll(2, list);//!!!!!!!!!!!!!!!!!
		System.out.println(ll1);//[A, C, X, Y, B, X, Y]
		
		ll1.addLast("K");
		System.out.println(ll1);//[A, C, X, Y, B, X, Y, K]

		// LÝnkedList List ve Queue ýnterface'lerine implement ile child oldugundan 
		// her iki ýnterface de ki tum methodlarý override etmek zorundadýr
	// iþlev olarak ayný iþi yapan addLast queue'dan ve add() ise List'den inherit edilmiþtir
		
     //Ben bir linkedList olusturmak istiyorum ama sadece list ozellýklerýný tasýsýn ýstýyorum
		
		List<String> listlist = new LinkedList<>();
		listlist.add("sadece list ten gelen ozellikler var cunku data type'ý List yaptým");
		
	// Ben bir linkedList olusturmak istiyorum ama sadece Queue ozellýklerýný tasýsýn ýstýyorum
		Queue<String> queuelist = new LinkedList<>();
		queuelist.add("sadece list ten gelen ozellikler var cunku data type'ý Queue yaptým");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
