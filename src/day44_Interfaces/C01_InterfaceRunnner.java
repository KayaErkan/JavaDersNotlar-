package day44_Interfaces;

public class C01_InterfaceRunnner implements I02_Interface02 {

	public static void main(String[] args) {
		
		// static olarak tanımlanmış bir variable veya method 
		// basaka classtan classIsmi.methodIsmi şeklinde cagırılabilir  
		// implement etmeden de static methodu direk olarak çagırabilirim
		
		I02_Interface02.deneme2();
		
		// default keyword'u ile oluşturdugumuz method ise;
		// obje uzerinden cagrılabilir.
		
		
		C01_InterfaceRunnner obj =new C01_InterfaceRunnner();
		obj.deneme();
		
	}

}
