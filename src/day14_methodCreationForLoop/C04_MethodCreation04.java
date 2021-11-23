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
		System.out.println("L�tfen �sminizi Giriniz :");
		String musteri�smi = scan.nextLine();
		musteri�smi = ismiDuzelt(musteri�smi);
		
		System.out.println("L�tfen Soyisminizi Giriniz :");
		
		String musteriSoy�smi = scan.nextLine();
		
		musteriSoy�smi = ismiDuzelt(musteriSoy�smi);
		
		// pratik kullan�m ac�s�ndan baba ad� anne ad� anne k�zl�k soyad� vb
		// t�m bilgileri ayn� methodu kullanarak istedi�imiz formata cevirebiliriz
		
		System.out.println("L�tfen kredi kart numaran�z�\narada bo�luk olmadan yaz�n�z....");
		String kkNo = scan.nextLine();
		
		kkNo = kkNoDuzelt(kkNo);
		String yen�KkNo = kkNoDuzelt(kkNo);
		System.out.println(musteri�smi + " " + musteriSoy�smi + " " + "\n" +
				yen�KkNo);

	}

	public static String kkNoDuzelt(String kkNo) {
		kkNo = kkNo.replace(" ", "");
		kkNo = kkNo.substring(0,4) + " " + kkNo.substring(4,8) + " " +
			   kkNo.substring(8,12) + " " + kkNo.substring(12); 
		return kkNo;
	}

	public static String ismiDuzelt(String musteri�smi) {
		
		//bu methoddun amac� m��teri ismini nas�l yazarsa yazs�n 
		// ilk harf b�y�k di�erleri kucuk harf olacak sekilde d�zenlemek
		// basta sonda bosluk b�rakm�ssa onlar� da yok edelim
		
		musteri�smi = musteri�smi.trim(); // atama yapmassak degisiklik kal�c� olmaz
		
		musteri�smi = musteri�smi.substring(0,1).toUpperCase() + 
				musteri�smi.substring(1).toLowerCase();
		// musterii�smi 'nde yapt�g�m de�i�iklikleri main methoda g�nderebilmek i�i�n
		// return type '� void yerine variablenin data t�r�ne uygun bir �ekle d�nd�rmeliyiz
		return musteri�smi;
		
	}

}
