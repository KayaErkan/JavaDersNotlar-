package day46_Collections;

import java.util.LinkedList;



public class C02_LinkedList02 {

	public static void main(String[] args) {
		
		// Collect�ons daesitligin sol taraf�nda <> icinde data turu yaz�lmasa
		// veya data turu olarak object yaz�lsa collect�ons cal�s�r
		// ama boyle b�r kullan�mda surekl� casting yap�ld�g� i�in
		// zaman ve haf�za ac�s�ndan verimli de�ildir.
		
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 10000; i++) {
			LinkedList<Object> ll1 = new LinkedList<>();
			ll1.add("A"+i);//concatination
			ll1.add(20+i);// toplama
			ll1.add('C'+i);// ascii degerleri
		}
		System.out.println(System.currentTimeMillis());
		
		//System.out.println(ll1);// [A, 20, C]
		System.out.println("***********************************");

		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 10000; i++) {
			LinkedList ll2 = new LinkedList<>();
			ll2.add("B"+i);
			ll2.add(25+i);
			ll2.add('K'+i);
		}
		System.out.println(System.currentTimeMillis());
		
		//System.out.println(ll2);//[B, 25, K]
		System.out.println("***********************************");
		
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 10000; i++) {
			LinkedList<String> ll3 = new LinkedList<>();
			ll3.add("D" +i);
			ll3.add("" + 15 +i);
			ll3.add("" + 'Z'+i);
		}
		System.out.println(System.currentTimeMillis());
		
		//LinkedList<String> ll3 = new LinkedList<>();
		//ll3.add("D");
		//ll3.add("" + 15); // 26 ve 27. sat�rlar�,bas�na "" koyarak stringlestirdim
		//ll3.add("" + 'Z');
		//System.out.println(ll3);//[D, 15, Z]
		
		
		
		
		
		

	}

}
