package day33_encapsulat�on;

import day18_doWhileLoopScope.C04_Scope01;
import day18_doWhileLoopScope.C05_Scope02;


public class C01_Encapsulation01 {

	public static void main(String[] args) {
		// oop consept
		// objecct oriented programing
		/*bir proje kapsam�ndaki classlarda olu�turulan variable ve methodlar�n 
		 * baska classlarda tekrar tekrar yaz�lmamas� var oldugu classtan  obje
		 * uret�lerek vu variable ve variable lar�n istendi�i kadar kullan�lmas�d�r.
		 * (reusability)
		 * bir kere yaz her yerden kullan (write once Reuse Anywhere)
		 */
		
		// ben day 18 package'ta ki C04 scope01 class�ndak� variable ve methodlara ula�mak istiyorum 
		
		// bunun i�in C04_scope01 class�ndan obje uretelim
		
		C04_Scope01 obj1 = new C04_Scope01();
		// esitligin sol taraf� declarat�on
		// declarat�on 2 parcad�r ilk parca data turu 2.k�s�nm isim
		// non-pri ler i�in data turu ayn� zamanda class ismi olabilir
		// wsitligin sag�nda ise deger 2 parcadan olu�ur
		// new keywordu 2.si de constructor
		// hangi classdan obje uretmek istersek o class�n constructor'�n� kullan�r�z
		
		obj1.sayi1 = 10;
		System.out.println(obj1.sayi1);//10
		obj1.method1();
		
		// deneme methodunu main method i�inden cag�rabilirmiyim?
		// deneme(); methodu static olmad��g� i�in main methoddan direk �a��r�lamaz 
		// bunun yerine i�inde oldugumuz class'dan bir obje uretip onun �zerinden
		// static olmayan methodlar�da cag�rabiliriz
		
		C01_Encapsulation01 obj3 = new C01_Encapsulation01();
		obj3.deneme();
	}

	public void deneme () {
		// projemiz kapsam�nda bukunan t�m classlardan public variable ve methodlara 
		// istedi�im yerden obje olusturarak ula�abilirim.
		// eger ula�mak istedigim class uyeleri (class members)
		// public degilse baska packagelerden ula�mak i�in extra i�lem yapmam�z gerekir
		
		C05_Scope02 obj2 = new C05_Scope02(); 
		obj2.sayiClass = 20;
		obj2.sayi = 15;
		obj2.method1();
		
		// ben istedi�im class tan obje uretip oradaki public class uyelerine ula�abilirim....
		
	}
	
	
	
}
