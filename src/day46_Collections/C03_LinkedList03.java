package day46_Collections;

import java.util.LinkedList;

public class C03_LinkedList03 {

	public static void main(String[] args) {
		LinkedList<String> ll1 = new LinkedList<>();
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);//[A, B]
		
		System.out.println(ll1.remove(0));//A-> remove (�ndex) b�ze �ndex�n� girdigimiz eleman�
		                                  // siler ve bize d�nd�r�r
		/* Eger listemiz �nteger'lardan olusuyorsa parantez i�ine yazd�g�m�z say�n�n 
		   index mi yoksa say� m� oldugunu kar�st�rmamak i�in java 
		   parantez i�ine yaz�kan� index olarak kabul eder dolay�s�yla;
		   System.out.println(ll1.remove("B"));// true veya false d�nd�r�r
		   yukar�daki method �nteger i�in cal�smaz
		 */
		
		
		
		System.out.println(ll1);//[B]
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);//[B, A, B]
		
		System.out.println(ll1.remove("B"));// true veya false d�nd�r�r
		System.out.println(ll1);//[A, B] -> ilk B yi sildi
		
		ll1.addFirst("B");
		System.out.println(ll1);//[B, A, B]
	
		System.out.println(ll1.removeFirstOccurrence("C"));// true veya false d�nd�r�r
		System.out.println(ll1);//[B,A,B] -> C yi bulamad�g� i�in silemedi 
		
		System.out.println(ll1.remove());//B -> sildigi eleman� d�nd�rd�
		System.out.println(ll1);//[A, B]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
