package day42_ErrorsGarbageCollector;

public class C01_Errors01 {

	public static void main(String[] args) {
		
		// System.out.println(20/0); // RTE deðil run time exception
		
		// String str = "adi; // CTE dur cunku cift týrnagý tamamlamadýkca kod calýsmaz.
		// bu tür yazýmdan kaynaklanan hatalar sonra dan duzeltilebilir
		
		// Java da Error denildiginde onune gecilemeyen kod ile cozulemeyen
		// sistemden kaynaklý buyuk hatalar kastedilir.
		
		// örnek:
		String str = "";
		for (int i = 0; i < 1000000; i++) {
			str += i;
		}
		// Bir error aldýgýmýzda onu exceptýonlardaki gibi handle ederek mudahale edemeyýz
		// error varsa memory hatasý vardýr ve bunu engellemek için biþey yapamayýz
		// error sistemi çökertir yapabilecegimiz tek þey buna sebep olan þeyi bulup 
		// yok etmek olacaktýr yukarýdaki for örneði buna örnek olabilir(veya sonsuz döngüler)
		// yani eger heap memory de bu iþleme yetecek kadar yer yoksa 
		// error gerçekleþir ve program cöker
		
		
		
		
	}

}
