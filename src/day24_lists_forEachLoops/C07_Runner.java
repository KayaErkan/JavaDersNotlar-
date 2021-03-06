package day24_lists_forEachLoops;

public class C07_Runner {

	public static void main(String[] args) {
		// Run edici yani C06 daoluşturdugumuz kalıbı kullanmak üzere çalıştıracagımız classtır

		C06 obj1 = new C06 ();
		
		// Scanner scan = new Scanner (System.in);
		// Scanner classından scan isminde bir obje üretiyoruz
		// scan objesinin özelliklerini System.in parametresi ile belirliyorum
		
		obj1.isim = "Mehmet Tekstil";
		obj1.telefon = "3125478798";
		
		System.out.println(obj1.isim + " " + obj1.telefon);
		// obj1 in istediğim özelliklerine (variable) deger atayabilirim
		// eger deger atamazsam 
		
		System.out.println(obj1.isciSayısı);
		
		// Bir isimle object oluşturma  sadece 1 defa olabilir
		// ama o objenin ozellikleri istendiği kadar değiştirilebilir
		
		C06 obj2 = new C06 ();
		obj2.isciSayısı = 50;
		System.out.println(obj2.isciSayısı);
		
		obj2.isciSayısı += 3;
		System.out.println(obj2.isciSayısı);
		
		obj2.isciSayısı -= 10;
		System.out.println(obj2.isciSayısı);
		System.out.println(obj1.isciSayısı);
		
	}

}
