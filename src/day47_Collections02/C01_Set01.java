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
		/* Set'de onemli olan ozellik No duplicati�on ve eleman�n kumede var olup olmamas�d�r
		   s�ralama Set i�in �nemli de�ildir
		   Set i�in elemanlar� g�rd�g�m�z sirada verir veya elemanlar� naturel order ile verir
		   gibi bir cumle KULLANAMAYIZ!!
		  
		 */
		System.out.println(set1.hashCode());//571
	
		/* Collections'da hashCode() methodu o collection i�indeki tum 
		   elemanlar�n hashcode'lar�n�n toplam�n� verir.
		   yeni eleman eklersek dogal olarak hashcode ta deg�s�r
		 */
		
		
		
		
		
		
		
		
		
		
		
	}

}
