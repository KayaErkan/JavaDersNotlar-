package day33_encapsulatýon;

import day18_doWhileLoopScope.C04_Scope01;
import day18_doWhileLoopScope.C05_Scope02;


public class C01_Encapsulation01 {

	public static void main(String[] args) {
		// oop consept
		// objecct oriented programing
		/*bir proje kapsamýndaki classlarda oluþturulan variable ve methodlarýn 
		 * baska classlarda tekrar tekrar yazýlmamasý var oldugu classtan  obje
		 * uretýlerek vu variable ve variable larýn istendiði kadar kullanýlmasýdýr.
		 * (reusability)
		 * bir kere yaz her yerden kullan (write once Reuse Anywhere)
		 */
		
		// ben day 18 package'ta ki C04 scope01 classýndaký variable ve methodlara ulaþmak istiyorum 
		
		// bunun için C04_scope01 classýndan obje uretelim
		
		C04_Scope01 obj1 = new C04_Scope01();
		// esitligin sol tarafý declaratýon
		// declaratýon 2 parcadýr ilk parca data turu 2.kýsýnm isim
		// non-pri ler için data turu ayný zamanda class ismi olabilir
		// wsitligin sagýnda ise deger 2 parcadan oluþur
		// new keywordu 2.si de constructor
		// hangi classdan obje uretmek istersek o classýn constructor'ýný kullanýrýz
		
		obj1.sayi1 = 10;
		System.out.println(obj1.sayi1);//10
		obj1.method1();
		
		// deneme methodunu main method içinden cagýrabilirmiyim?
		// deneme(); methodu static olmadýýgý için main methoddan direk çaðýrýlamaz 
		// bunun yerine içinde oldugumuz class'dan bir obje uretip onun üzerinden
		// static olmayan methodlarýda cagýrabiliriz
		
		C01_Encapsulation01 obj3 = new C01_Encapsulation01();
		obj3.deneme();
	}

	public void deneme () {
		// projemiz kapsamýnda bukunan tüm classlardan public variable ve methodlara 
		// istediðim yerden obje olusturarak ulaþabilirim.
		// eger ulaþmak istedigim class uyeleri (class members)
		// public degilse baska packagelerden ulaþmak için extra iþlem yapmamýz gerekir
		
		C05_Scope02 obj2 = new C05_Scope02(); 
		obj2.sayiClass = 20;
		obj2.sayi = 15;
		obj2.method1();
		
		// ben istediðim class tan obje uretip oradaki public class uyelerine ulaþabilirim....
		
	}
	
	
	
}
