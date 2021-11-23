package day42_ErrorsGarbageCollector;

import java.util.ArrayList;
import java.util.List;

public class C02_GarbageCollector02 {

	public static void main(String[] args) {
		String str = "";
		for (int i = 0; i < 1000; i++) {
			str += i;
		}
		// bu kod calýþtýgýnda kac tane obje olusur?
		//1001
		//ilk basta bir tane oluþturduk 
		// sonra her dongude str a concet yapýlacak
		// ama String class'ý immutable old.için her yeni deðeri kooymak için
		// yeni bir string objesi olusturulur ve eski obje'den pointer silinir
		// dolayýsýyla loop bittiginde str için 1 tane pointer'ýn iþaret ettiði obje,
		// 1000 tane de hiç bir pointer'ýn iþaret etmediði obje heap memory de bulunur
		
		List<Integer> list = new ArrayList<>();
		// bu satýr java ya yeni bir obje olusturmasýný soyluyor
		// java yeni obje için yer varmý diye memory'i kontrol eder
		// ve memory kritik seviyede ise Garbage collector'u devreye sokar
		//Garbage Collector de finalize() methodunu caliþtirir.
		//finalize methodu silinecek objeleri iþaretler ve sonra garbage collector
		//finalize olan objeleri siler. 
		//finalize olmayanlarý da sýkýþtýrabildigi kadar sýýkýstýrýp yer acar.
		
		
	}

}
