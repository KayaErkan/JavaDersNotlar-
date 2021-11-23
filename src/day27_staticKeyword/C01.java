package day27_staticKeyword;

public class C01 {
	int sayi = 10;
	String str ="yasasin eclipse";
	static int sayi2;
	public static void main(String[] args) {
		
		//System.out.println(sayi); 
		// sayi instance bir variable oldugu için direk main method da kullanamayýz
		// instance variable lara obje uzerinden ulasabilirim
		
		// obje olusturmak için constructor kullanmalýyým
		// bu class da constructor var mi ? VAR default constructor var.
		
		C01 obj1 = new C01 ();
		// soldaki C01: class ismi ve ayný zamanda data turudur
		// sagdaki C01 yani ikinci C01 class ismiyle aynýdýr ama o C01 CONSTRUCTOR dýr.
		//çünkü onun yanýnda bir parca daha var {parantez var }
		
		// obj1.sayi; CTE verir çünkü ya atama yapmalýyýz veya yazdýrmalýyýz
		
		System.out.println(obj1.sayi); // 10
		 
		obj1.sayi = 44;
		//System.out.println(sayi);
		// obje urettýk diye instance a direk ulaþamayýz mutlaka obje kullanmalýyým
		
		System.out.println(obj1.sayi); //  44
		
		C01 obj2 = new C01();
		System.out.println(obj2.sayi);
		
		
		System.out.println(sayi2);
		// java run time programdýr
		
		
	}

}
