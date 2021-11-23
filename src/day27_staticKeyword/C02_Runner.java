package day27_staticKeyword;

public class C02_Runner {

	@SuppressWarnings("static-access") // bu main methodda static access ile ilgili
	                                   // iþleyiþi bozmayan küçük bir hata var ve ben
	                                   // bunu onaylýyorum demek
	public static void main(String[] args) {
		
		
		// C01 deki variable lara ulaþmak istesem
		// ilk önce c01 deki variablelerin instance mi yoksa static mi olduguna bakmalýyým
		// örnegin sayi ve str instance variable lardir, 
		// dolayýsýyla onlara obje uzerinden ulaþabilirim
		
		C01 obj1 = new C01();
		System.out.println(obj1.str);//yasasin eclipse

		obj1.str = "Yasasin Faruk";
		System.out.println(obj1.str); //Yasasin Faruk
		
		C01 obj2 = new C01();
		System.out.println(obj2.str);//yasasin eclipse
		
		// sayi2 variable i static oldugu için objeye ihtiyac duyulmaz
		System.out.println(C01.sayi2); // 0
		
		C01 obj3 = new C01();
		obj3.sayi2 = 27; // Sayi2 static olduugu için CTE vermez
		                 // ancak altýný sarý çizer ve satýr numarasýna ünlem koyar
		// çünkü java daha kýsa ve emin bir yol varken niçin obje üzerinden ulastýgýmý sorgular
		// bu kodun çalýþmasýna engel deðildir onun için cte vermez fakat gereksiz bir iþlem
		// oldugu için bizi uyarýr java
		
		System.out.println(obj3.sayi2); // 27
		
		C01.sayi2 = 34; // Static variable lara class ismi.variable ismi yazýlarak ulaþilabilir
		                // buna static way denir
		
		System.out.println(C01.sayi2); // 34 static variable lar ulaþabilen her obje
		                               // ve her class için ortaktýr
		                               // okul adý gibi
		
		System.out.println(obj2.sayi2); // 34
		System.out.println(obj1.sayi2); // 34
		
		
		
		
		
		
		
		
		
	}

}
