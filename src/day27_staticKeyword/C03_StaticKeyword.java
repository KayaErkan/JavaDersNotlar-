package day27_staticKeyword;

public class C03_StaticKeyword {

	static int sayi = 15;
	String str = "Java";
	
	public static void main(String[] args) {
		/*
		 	Bir method veya variableyi static yapmanýn avantajý:
		 
		 Static variable ve methodlara ulaþmak istediðimizde classÝsmi.methodÝsmi
		 yazmamýz yeterli olur.
		 
		 örnegin arraylerde kullandýgýmýz Arrays class ý altýndaký toString() methodu
		 static olarakjava developerlari tarafýndan hazýrlanmýs oldugu için 
		 Ararys.toString() yazarak methodu rahatlýkla  kullanabiliyoruz
		 
		 Ancak variable lari static yapmak biraz riskli
		 mesela bir okul uygulamasýnda okul ismini static variable olarak olusturursak
		 avantaj olarak heryerden rahatlýkla okul ismine ulaþabiliriz
		 
		 ama ögrenci objelerinden veya ögretmen objelerýnden biri uzerinden okul adý 
		 deðiþtirilirse tum ögrenciler ve tum ögretmenler için okul adý kalýcý olarak 
		 deðiþmiþ olur ve bu da bir uygulama için istenmeyen bir durumdur
		 */

		sayi = 20;
		// str = "static olan mamin method dan instance variablea direk ulaþamazsýn"
		staticMethod ();
		// staticOlmayanMethod(); main method static olldugu için static olmayaný cagýramaz
		
		
	}
	
	public static void staticMethod () {
		System.out.println("Static variable lar gökteki ay gibidir");
		sayi = 30;
		// str = "buradan ulaþýlamaz"
		
	}
	
	public void staticOlmayanMethod() {
		System.out.println("Static olmayan method çalýþtý");
		staticMethod (); // static methodlar her yerden cagýrýlabilir
		sayi = 25; // static variable lara heryerden ulasýlýp deger atanabilir
		str= "static olmayan method dan static olamayan variable ye ulaþabilirim";
		
		
	}
	
	
	
}
