package day48_Collections03_Maps;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue01 {

	public static void main(String[] args) {
		/* Queue bir interfacedir dolay�s�yla obje uretemey�z 
		   child class'� olan priorityQueue ve LinkedList constructoor secimine
		   g�re olusturdugumuz queue'nun davran�slar� de�i�ir. 
		 */
		Queue<String> k1 = new PriorityQueue<>();
		k1.add("D");
		k1.add("C");
		k1.add("M");
		k1.add("A");
		System.out.println(k1);//[A, C, M, D]
		
		/* Queue(kuyruk) yap�s� geregi insert�on order'a g�re s�ralama yapmas� beklenir
		   Ancak constructor olarak priorityQueue secti�imiz i�in java taraf�ndan belirlenir
		   prriority'e g�re s�ralama yapar.
		 */
	
	// Biz de istersek priority kural�n� tan�mlayabiliriz..o zaman bizim istegimize g�re s�ralar 	
		
		Queue<String> k2 = new LinkedList<>();
		
		/* Ayn� elemanlarla fakat LinkedList constructor'� kullanarak olusturdugumuz 
		   queue ise  beklenenlere uygun olarak ekleme s�ras�na g�re yazd�r�r.
		 */
		k2.add("D");
		k2.add("C");
		k2.add("M");
		k2.add("A");
		System.out.println(k2);//[D, C, M, A]
		
		// Queue'nun yap�s� geregi FIFO kural� gecerlidir
		 
		k2.offer("Z");
		// en sona eleman ekler
		
		System.out.println(k2);//[D, C, M, A, Z]
		System.out.println(k2.peek());// D -> silmeden ilk eleman� bize d�nd�r�r.
		System.out.println(k2);//[D, C, M, A, Z]
		k2.remove();
		System.out.println(k2);//[C, M, A, Z]
		k2.remove();
		System.out.println(k2);//[M, A, Z]
		System.out.println(k2.remove("A"));// true
		System.out.println(k2);//[M, Z]
		k2.poll();
		System.out.println(k2);//[Z]
		// poll methodu ilk eleman� siler
		
		System.out.println(k2.element());//Z-> silmeden ilk eleman� getirir
		
		k2.remove(); // bu sat�rda son eleman olan z'de silindi art�k queue bos 
		System.out.println(k2.isEmpty());//true
		k2.poll();//bos bir queue da kullan�l�rsa excp. vermez,null d�nd�r�r
		
		// k2.remove(); // bos bir queue dan remove() ile eleman silmek istersek exception verir
		// System.out.println(k2.element()); // queue bossa excp. verir

		
		
	}

}
