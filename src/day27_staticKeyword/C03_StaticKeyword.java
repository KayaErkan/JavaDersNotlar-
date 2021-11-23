package day27_staticKeyword;

public class C03_StaticKeyword {

	static int sayi = 15;
	String str = "Java";
	
	public static void main(String[] args) {
		/*
		 	Bir method veya variableyi static yapman�n avantaj�:
		 
		 Static variable ve methodlara ula�mak istedi�imizde class�smi.method�smi
		 yazmam�z yeterli olur.
		 
		 �rnegin arraylerde kulland�g�m�z Arrays class � alt�ndak� toString() methodu
		 static olarakjava developerlari taraf�ndan haz�rlanm�s oldugu i�in 
		 Ararys.toString() yazarak methodu rahatl�kla  kullanabiliyoruz
		 
		 Ancak variable lari static yapmak biraz riskli
		 mesela bir okul uygulamas�nda okul ismini static variable olarak olusturursak
		 avantaj olarak heryerden rahatl�kla okul ismine ula�abiliriz
		 
		 ama �grenci objelerinden veya �gretmen objeler�nden biri uzerinden okul ad� 
		 de�i�tirilirse tum �grenciler ve tum �gretmenler i�in okul ad� kal�c� olarak 
		 de�i�mi� olur ve bu da bir uygulama i�in istenmeyen bir durumdur
		 */

		sayi = 20;
		// str = "static olan mamin method dan instance variablea direk ula�amazs�n"
		staticMethod ();
		// staticOlmayanMethod(); main method static olldugu i�in static olmayan� cag�ramaz
		
		
	}
	
	public static void staticMethod () {
		System.out.println("Static variable lar g�kteki ay gibidir");
		sayi = 30;
		// str = "buradan ula��lamaz"
		
	}
	
	public void staticOlmayanMethod() {
		System.out.println("Static olmayan method �al��t�");
		staticMethod (); // static methodlar her yerden cag�r�labilir
		sayi = 25; // static variable lara heryerden ulas�l�p deger atanabilir
		str= "static olmayan method dan static olamayan variable ye ula�abilirim";
		
		
	}
	
	
	
}
