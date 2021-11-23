package day42_ErrorsGarbageCollector;

import java.util.Date;

public class C03_CheckMemory03 {

	public static void main(String[] args) {

		//gc() mmethodu ile jvm e istekte bulunuruz ve istegimizin dikkate al�nmas�n�n
		//veya sonuclar�n�n garantisi yoktur
		
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total Memory :" + rt.totalMemory());
		System.out.println("Looptan once Free Memory : " + rt.freeMemory());
		
		Date d = null;
		// bu ad�mda cilg�nca date objesi olu�tural�m
		for(int i = 0; i < 100000; i++) {
			d = new Date(i);
			d = null;
		}
		
		// deli gibi Date objesi olusturduk simdi freeMemory methodunu tekrar cag�ral�m
		System.out.println("After loop Free Memory : " + rt.freeMemory());
		
		// rt referans degiskeni ile jvm'e garbage collector'u calistirma isteginde bulunal�m
		rt.gc(); // ya da System.gc();
		System.out.println("After GC Free Memory : " + rt.freeMemory());
		
		// Bende ki �rnek c�kt� su sekilde, siz cal��t�rd�g�n�zda sizde farkl� olacakt�r
		// GC tum olusturulan objeleri silmeyi garanti etmedi�i i�in 
		//After Gc Free Memoryf arkl�l�klar gosterir
		
		//Total Memory :132120576
		//Free Memory : 130566592
		//After loop Free Memory : 128469464
		//After GC Free Memory : 7787384
		
	}

}
