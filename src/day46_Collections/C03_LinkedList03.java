package day46_Collections;

import java.util.LinkedList;

public class C03_LinkedList03 {

	public static void main(String[] args) {
		LinkedList<String> ll1 = new LinkedList<>();
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);//[A, B]
		
		System.out.println(ll1.remove(0));//A-> remove (ýndex) býze ýndexýný girdigimiz elemaný
		                                  // siler ve bize döndürür
		/* Eger listemiz ýnteger'lardan olusuyorsa parantez içine yazdýgýmýz sayýnýn 
		   index mi yoksa sayý mý oldugunu karýstýrmamak için java 
		   parantez içine yazýkaný index olarak kabul eder dolayýsýyla;
		   System.out.println(ll1.remove("B"));// true veya false döndürür
		   yukarýdaki method ýnteger için calýsmaz
		 */
		
		
		
		System.out.println(ll1);//[B]
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);//[B, A, B]
		
		System.out.println(ll1.remove("B"));// true veya false döndürür
		System.out.println(ll1);//[A, B] -> ilk B yi sildi
		
		ll1.addFirst("B");
		System.out.println(ll1);//[B, A, B]
	
		System.out.println(ll1.removeFirstOccurrence("C"));// true veya false döndürür
		System.out.println(ll1);//[B,A,B] -> C yi bulamadýgý için silemedi 
		
		System.out.println(ll1.remove());//B -> sildigi elemaný döndürdü
		System.out.println(ll1);//[A, B]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
