package day47_Collections02;

import java.util.HashSet;
import java.util.Set;

public class C01_Set01 {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();
		set1.add("F");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("B");
		set1.add("A");
		set1.add("Y");
		set1.add("D");
		System.out.println(set1);//[A, B, C, D, F, Y]
		System.out.println(set1.hashCode());//425
		set1.add("M");
		set1.add("E");
		
		System.out.println(set1);//[A, B, C, D, E, F, Y, M]
		/* Set'de onemli olan ozellik No duplicatiýon ve elemanýn kumede var olup olmamasýdýr
		   sýralama Set için önemli deðildir
		   Set için elemanlarý gýrdýgýmýz sirada verir veya elemanlarý naturel order ile verir
		   gibi bir cumle KULLANAMAYIZ!!
		  
		 */
		System.out.println(set1.hashCode());//571
	
		/* Collections'da hashCode() methodu o collection içindeki tum 
		   elemanlarýn hashcode'larýnýn toplamýný verir.
		   yeni eleman eklersek dogal olarak hashcode ta degýsýr
		 */
		
		
		
		
		
		
		
		
		
		
		
	}

}
