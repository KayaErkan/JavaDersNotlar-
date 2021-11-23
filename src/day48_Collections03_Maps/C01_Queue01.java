package day48_Collections03_Maps;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue01 {

	public static void main(String[] args) {
		/* Queue bir interfacedir dolayýsýyla obje uretemeyýz 
		   child class'ý olan priorityQueue ve LinkedList constructoor secimine
		   göre olusturdugumuz queue'nun davranýslarý deðiþir. 
		 */
		Queue<String> k1 = new PriorityQueue<>();
		k1.add("D");
		k1.add("C");
		k1.add("M");
		k1.add("A");
		System.out.println(k1);//[A, C, M, D]
		
		/* Queue(kuyruk) yapýsý geregi insertýon order'a göre sýralama yapmasý beklenir
		   Ancak constructor olarak priorityQueue sectiðimiz için java tarafýndan belirlenir
		   prriority'e göre sýralama yapar.
		 */
	
	// Biz de istersek priority kuralýný tanýmlayabiliriz..o zaman bizim istegimize göre sýralar 	
		
		Queue<String> k2 = new LinkedList<>();
		
		/* Ayný elemanlarla fakat LinkedList constructor'ý kullanarak olusturdugumuz 
		   queue ise  beklenenlere uygun olarak ekleme sýrasýna göre yazdýrýr.
		 */
		k2.add("D");
		k2.add("C");
		k2.add("M");
		k2.add("A");
		System.out.println(k2);//[D, C, M, A]
		
		// Queue'nun yapýsý geregi FIFO kuralý gecerlidir
		 
		k2.offer("Z");
		// en sona eleman ekler
		
		System.out.println(k2);//[D, C, M, A, Z]
		System.out.println(k2.peek());// D -> silmeden ilk elemaný bize döndürür.
		System.out.println(k2);//[D, C, M, A, Z]
		k2.remove();
		System.out.println(k2);//[C, M, A, Z]
		k2.remove();
		System.out.println(k2);//[M, A, Z]
		System.out.println(k2.remove("A"));// true
		System.out.println(k2);//[M, Z]
		k2.poll();
		System.out.println(k2);//[Z]
		// poll methodu ilk elemaný siler
		
		System.out.println(k2.element());//Z-> silmeden ilk elemaný getirir
		
		k2.remove(); // bu satýrda son eleman olan z'de silindi artýk queue bos 
		System.out.println(k2.isEmpty());//true
		k2.poll();//bos bir queue da kullanýlýrsa excp. vermez,null döndürür
		
		// k2.remove(); // bos bir queue dan remove() ile eleman silmek istersek exception verir
		// System.out.println(k2.element()); // queue bossa excp. verir

		
		
	}

}
