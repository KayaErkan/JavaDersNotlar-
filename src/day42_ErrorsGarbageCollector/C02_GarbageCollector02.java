package day42_ErrorsGarbageCollector;

import java.util.ArrayList;
import java.util.List;

public class C02_GarbageCollector02 {

	public static void main(String[] args) {
		String str = "";
		for (int i = 0; i < 1000; i++) {
			str += i;
		}
		// bu kod cal��t�g�nda kac tane obje olusur?
		//1001
		//ilk basta bir tane olu�turduk 
		// sonra her dongude str a concet yap�lacak
		// ama String class'� immutable old.i�in her yeni de�eri kooymak i�in
		// yeni bir string objesi olusturulur ve eski obje'den pointer silinir
		// dolay�s�yla loop bittiginde str i�in 1 tane pointer'�n i�aret etti�i obje,
		// 1000 tane de hi� bir pointer'�n i�aret etmedi�i obje heap memory de bulunur
		
		List<Integer> list = new ArrayList<>();
		// bu sat�r java ya yeni bir obje olusturmas�n� soyluyor
		// java yeni obje i�in yer varm� diye memory'i kontrol eder
		// ve memory kritik seviyede ise Garbage collector'u devreye sokar
		//Garbage Collector de finalize() methodunu cali�tirir.
		//finalize methodu silinecek objeleri i�aretler ve sonra garbage collector
		//finalize olan objeleri siler. 
		//finalize olmayanlar� da s�k��t�rabildigi kadar s��k�st�r�p yer acar.
		
		
	}

}
