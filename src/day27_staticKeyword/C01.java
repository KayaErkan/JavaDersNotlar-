package day27_staticKeyword;

public class C01 {
	int sayi = 10;
	String str ="yasasin eclipse";
	static int sayi2;
	public static void main(String[] args) {
		
		//System.out.println(sayi); 
		// sayi instance bir variable oldugu i�in direk main method da kullanamay�z
		// instance variable lara obje uzerinden ulasabilirim
		
		// obje olusturmak i�in constructor kullanmal�y�m
		// bu class da constructor var mi ? VAR default constructor var.
		
		C01 obj1 = new C01 ();
		// soldaki C01: class ismi ve ayn� zamanda data turudur
		// sagdaki C01 yani ikinci C01 class ismiyle ayn�d�r ama o C01 CONSTRUCTOR d�r.
		//��nk� onun yan�nda bir parca daha var {parantez var }
		
		// obj1.sayi; CTE verir ��nk� ya atama yapmal�y�z veya yazd�rmal�y�z
		
		System.out.println(obj1.sayi); // 10
		 
		obj1.sayi = 44;
		//System.out.println(sayi);
		// obje urett�k diye instance a direk ula�amay�z mutlaka obje kullanmal�y�m
		
		System.out.println(obj1.sayi); //  44
		
		C01 obj2 = new C01();
		System.out.println(obj2.sayi);
		
		
		System.out.println(sayi2);
		// java run time programd�r
		
		
	}

}
