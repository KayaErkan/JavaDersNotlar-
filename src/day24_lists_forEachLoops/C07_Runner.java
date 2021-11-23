package day24_lists_forEachLoops;

public class C07_Runner {

	public static void main(String[] args) {
		// Run edici yani C06 daolu�turdugumuz kal�b� kullanmak �zere �al��t�racag�m�z classt�r

		C06 obj1 = new C06 ();
		
		// Scanner scan = new Scanner (System.in);
		// Scanner class�ndan scan isminde bir obje �retiyoruz
		// scan objesinin �zelliklerini System.in parametresi ile belirliyorum
		
		obj1.isim = "Mehmet Tekstil";
		obj1.telefon = "3125478798";
		
		System.out.println(obj1.isim + " " + obj1.telefon);
		// obj1 in istedi�im �zelliklerine (variable) deger atayabilirim
		// eger deger atamazsam 
		
		System.out.println(obj1.isciSay�s�);
		
		// Bir isimle object olu�turma  sadece 1 defa olabilir
		// ama o objenin ozellikleri istendi�i kadar de�i�tirilebilir
		
		C06 obj2 = new C06 ();
		obj2.isciSay�s� = 50;
		System.out.println(obj2.isciSay�s�);
		
		obj2.isciSay�s� += 3;
		System.out.println(obj2.isciSay�s�);
		
		obj2.isciSay�s� -= 10;
		System.out.println(obj2.isciSay�s�);
		System.out.println(obj1.isciSay�s�);
		
	}

}
