package day27_staticKeyword;

public class C02_Runner {

	@SuppressWarnings("static-access") // bu main methodda static access ile ilgili
	                                   // i�leyi�i bozmayan k���k bir hata var ve ben
	                                   // bunu onayl�yorum demek
	public static void main(String[] args) {
		
		
		// C01 deki variable lara ula�mak istesem
		// ilk �nce c01 deki variablelerin instance mi yoksa static mi olduguna bakmal�y�m
		// �rnegin sayi ve str instance variable lardir, 
		// dolay�s�yla onlara obje uzerinden ula�abilirim
		
		C01 obj1 = new C01();
		System.out.println(obj1.str);//yasasin eclipse

		obj1.str = "Yasasin Faruk";
		System.out.println(obj1.str); //Yasasin Faruk
		
		C01 obj2 = new C01();
		System.out.println(obj2.str);//yasasin eclipse
		
		// sayi2 variable i static oldugu i�in objeye ihtiyac duyulmaz
		System.out.println(C01.sayi2); // 0
		
		C01 obj3 = new C01();
		obj3.sayi2 = 27; // Sayi2 static olduugu i�in CTE vermez
		                 // ancak alt�n� sar� �izer ve sat�r numaras�na �nlem koyar
		// ��nk� java daha k�sa ve emin bir yol varken ni�in obje �zerinden ulast�g�m� sorgular
		// bu kodun �al��mas�na engel de�ildir onun i�in cte vermez fakat gereksiz bir i�lem
		// oldugu i�in bizi uyar�r java
		
		System.out.println(obj3.sayi2); // 27
		
		C01.sayi2 = 34; // Static variable lara class ismi.variable ismi yaz�larak ula�ilabilir
		                // buna static way denir
		
		System.out.println(C01.sayi2); // 34 static variable lar ula�abilen her obje
		                               // ve her class i�in ortakt�r
		                               // okul ad� gibi
		
		System.out.println(obj2.sayi2); // 34
		System.out.println(obj1.sayi2); // 34
		
		
		
		
		
		
		
		
		
	}

}
