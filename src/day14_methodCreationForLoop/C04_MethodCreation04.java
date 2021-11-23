package day14_methodCreationForLoop;

import java.util.Scanner;

public class C04_MethodCreation04 {

	public static void main(String[] args) {
		/*
		 * Soru 4) Kullanicidan ismini, soyismini ve
		 *  bosluk birakmadan 16 hane olarak kredi karti numarasini alin. 
		 *  Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde, 
		 *  KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak 
		 *  sekilde duzelten 2 method yazin, 
		 *  ve programda kullanabilmek icin duzenlenmis hallerini geri dondurun.
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen İsminizi Giriniz :");
		String musteriİsmi = scan.nextLine();
		musteriİsmi = ismiDuzelt(musteriİsmi);
		
		System.out.println("Lütfen Soyisminizi Giriniz :");
		
		String musteriSoyİsmi = scan.nextLine();
		
		musteriSoyİsmi = ismiDuzelt(musteriSoyİsmi);
		
		// pratik kullanım acısından baba adı anne adı anne kızlık soyadı vb
		// tüm bilgileri aynı methodu kullanarak istediğimiz formata cevirebiliriz
		
		System.out.println("Lütfen kredi kart numaranızı\narada boşluk olmadan yazınız....");
		String kkNo = scan.nextLine();
		
		kkNo = kkNoDuzelt(kkNo);
		String yenıKkNo = kkNoDuzelt(kkNo);
		System.out.println(musteriİsmi + " " + musteriSoyİsmi + " " + "\n" +
				yenıKkNo);

	}

	public static String kkNoDuzelt(String kkNo) {
		kkNo = kkNo.replace(" ", "");
		kkNo = kkNo.substring(0,4) + " " + kkNo.substring(4,8) + " " +
			   kkNo.substring(8,12) + " " + kkNo.substring(12); 
		return kkNo;
	}

	public static String ismiDuzelt(String musteriİsmi) {
		
		//bu methoddun amacı müşteri ismini nasıl yazarsa yazsın 
		// ilk harf büyük diğerleri kucuk harf olacak sekilde düzenlemek
		// basta sonda bosluk bırakmıssa onları da yok edelim
		
		musteriİsmi = musteriİsmi.trim(); // atama yapmassak degisiklik kalıcı olmaz
		
		musteriİsmi = musteriİsmi.substring(0,1).toUpperCase() + 
				musteriİsmi.substring(1).toLowerCase();
		// musteriiİsmi 'nde yaptıgım değişiklikleri main methoda gönderebilmek içiçn
		// return type 'ı void yerine variablenin data türüne uygun bir şekle döndürmeliyiz
		return musteriİsmi;
		
	}

}
