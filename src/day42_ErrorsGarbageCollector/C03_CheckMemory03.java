package day42_ErrorsGarbageCollector;

import java.util.Date;

public class C03_CheckMemory03 {

	public static void main(String[] args) {

		//gc() mmethodu ile jvm e istekte bulunuruz ve istegimizin dikkate alýnmasýnýn
		//veya sonuclarýnýn garantisi yoktur
		
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total Memory :" + rt.totalMemory());
		System.out.println("Looptan once Free Memory : " + rt.freeMemory());
		
		Date d = null;
		// bu adýmda cilgýnca date objesi oluþturalým
		for(int i = 0; i < 100000; i++) {
			d = new Date(i);
			d = null;
		}
		
		// deli gibi Date objesi olusturduk simdi freeMemory methodunu tekrar cagýralým
		System.out.println("After loop Free Memory : " + rt.freeMemory());
		
		// rt referans degiskeni ile jvm'e garbage collector'u calistirma isteginde bulunalým
		rt.gc(); // ya da System.gc();
		System.out.println("After GC Free Memory : " + rt.freeMemory());
		
		// Bende ki örnek cýktý su sekilde, siz calýþtýrdýgýnýzda sizde farklý olacaktýr
		// GC tum olusturulan objeleri silmeyi garanti etmediði için 
		//After Gc Free Memoryf arklýlýklar gosterir
		
		//Total Memory :132120576
		//Free Memory : 130566592
		//After loop Free Memory : 128469464
		//After GC Free Memory : 7787384
		
	}

}
