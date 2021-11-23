package day44_Interfaces;

public class C01_InterfaceRunnner implements I02_Interface02 {

	public static void main(String[] args) {
		
		// static olarak tanýmlanmýþ bir variable veya method 
		// basaka classtan classIsmi.methodIsmi þeklinde cagýrýlabilir  
		// implement etmeden de static methodu direk olarak çagýrabilirim
		
		I02_Interface02.deneme2();
		
		// default keyword'u ile oluþturdugumuz method ise;
		// obje uzerinden cagrýlabilir.
		
		
		C01_InterfaceRunnner obj =new C01_InterfaceRunnner();
		obj.deneme();
		
	}

}
