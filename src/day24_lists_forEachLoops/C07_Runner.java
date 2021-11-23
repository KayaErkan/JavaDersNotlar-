package day24_lists_forEachLoops;

public class C07_Runner {

	public static void main(String[] args) {
		// Run edici yani C06 daoluþturdugumuz kalýbý kullanmak üzere çalýþtýracagýmýz classtýr

		C06 obj1 = new C06 ();
		
		// Scanner scan = new Scanner (System.in);
		// Scanner classýndan scan isminde bir obje üretiyoruz
		// scan objesinin özelliklerini System.in parametresi ile belirliyorum
		
		obj1.isim = "Mehmet Tekstil";
		obj1.telefon = "3125478798";
		
		System.out.println(obj1.isim + " " + obj1.telefon);
		// obj1 in istediðim özelliklerine (variable) deger atayabilirim
		// eger deger atamazsam 
		
		System.out.println(obj1.isciSayýsý);
		
		// Bir isimle object oluþturma  sadece 1 defa olabilir
		// ama o objenin ozellikleri istendiði kadar deðiþtirilebilir
		
		C06 obj2 = new C06 ();
		obj2.isciSayýsý = 50;
		System.out.println(obj2.isciSayýsý);
		
		obj2.isciSayýsý += 3;
		System.out.println(obj2.isciSayýsý);
		
		obj2.isciSayýsý -= 10;
		System.out.println(obj2.isciSayýsý);
		System.out.println(obj1.isciSayýsý);
		
	}

}
