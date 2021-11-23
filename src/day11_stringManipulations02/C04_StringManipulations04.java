package day11_stringManipulations02;

public class C04_StringManipulations04 {

	public static void main(String[] args) {
		
		String kkNo = "Java 123 @#";
		
		System.out.println(kkNo.replace(" " , "")); // yazdýrýrken yapýlan iþlem yazdýrýldýðý satýrda geçerlidir
		
		System.out.println(kkNo); // ilk yazdýrdýðýmýz þekilde konsolda görünür
		
		// replaceAll()
		
		System.out.println(kkNo.replaceAll("\\s", "")); // s sadece space
		System.out.println(kkNo.replaceAll("\\S", "*"));// S space olmayan hersey
		System.out.println(kkNo.replaceAll("\\w", "_")); // w harf veya rakamlarýn hepsi
		System.out.println(kkNo.replaceAll("\\W", "#")); // W harf veya rakamlarýn dýþýndaki hersey
		System.out.println(kkNo.replaceAll("\\d", "0")); // rakamlarýn hepsi
		System.out.println(kkNo.replaceAll("\\D", "a")); // rakkamlarýn dýsýndaki hersey
		
		// syso içinde yapýlan manipulationlar asýl sitringi deðiþtirmez
		// yukarýdaki bütün iþlemler sadece bulunduklarý satýrda geçerlidir 
		// kkNo ancak tekrardan atama yapýlýrsa deðiþir 
		
		
		
		
		
	}

}
