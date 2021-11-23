package day46_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList01 {

	public static void main(String[] args) {
		
		// linked bagl� demek
		// linked list te tum elemanlar tren gibi birbirine bagl�d�r
		
		//collect�ons larda obj olustururken ;
		// olusturmak istedigimiz collect�on'�n class m� yoksa �nterface 'm� olduguna bakmal�y�z
		// eger olusturmak istedigimiz coll.interface �se 
		// data turu olarak o �nterface'i, cons. olarak ise uygun bir class secmeliyiz
		//simdiye kadar L�st(�nterface) olustururken cons olarak ArrayList() seciyorduk
		
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

		// L�nkedList List ve Queue �nterface'lerine implement ile child oldugundan 
		// her iki �nterface de ki tum methodlar� override etmek zorundad�r
	// i�lev olarak ayn� i�i yapan addLast queue'dan ve add() ise List'den inherit edilmi�tir
		
     //Ben bir linkedList olusturmak istiyorum ama sadece list ozell�kler�n� tas�s�n �st�yorum
		
		List<String> listlist = new LinkedList<>();
		listlist.add("sadece list ten gelen ozellikler var cunku data type'� List yapt�m");
		
	// Ben bir linkedList olusturmak istiyorum ama sadece Queue ozell�kler�n� tas�s�n �st�yorum
		Queue<String> queuelist = new LinkedList<>();
		queuelist.add("sadece list ten gelen ozellikler var cunku data type'� Queue yapt�m");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
