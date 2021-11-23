package day42_ErrorsGarbageCollector;

public class C01_Errors01 {

	public static void main(String[] args) {
		
		// System.out.println(20/0); // RTE de�il run time exception
		
		// String str = "adi; // CTE dur cunku cift t�rnag� tamamlamad�kca kod cal�smaz.
		// bu t�r yaz�mdan kaynaklanan hatalar sonra dan duzeltilebilir
		
		// Java da Error denildiginde onune gecilemeyen kod ile cozulemeyen
		// sistemden kaynakl� buyuk hatalar kastedilir.
		
		// �rnek:
		String str = "";
		for (int i = 0; i < 1000000; i++) {
			str += i;
		}
		// Bir error ald�g�m�zda onu except�onlardaki gibi handle ederek mudahale edemey�z
		// error varsa memory hatas� vard�r ve bunu engellemek i�in bi�ey yapamay�z
		// error sistemi ��kertir yapabilecegimiz tek �ey buna sebep olan �eyi bulup 
		// yok etmek olacakt�r yukar�daki for �rne�i buna �rnek olabilir(veya sonsuz d�ng�ler)
		// yani eger heap memory de bu i�leme yetecek kadar yer yoksa 
		// error ger�ekle�ir ve program c�ker
		
		
		
		
	}

}
