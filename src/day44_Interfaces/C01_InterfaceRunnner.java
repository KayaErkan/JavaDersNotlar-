package day44_Interfaces;

public class C01_InterfaceRunnner implements I02_Interface02 {

	public static void main(String[] args) {
		
		// static olarak tan�mlanm�� bir variable veya method 
		// basaka classtan classIsmi.methodIsmi �eklinde cag�r�labilir  
		// implement etmeden de static methodu direk olarak �ag�rabilirim
		
		I02_Interface02.deneme2();
		
		// default keyword'u ile olu�turdugumuz method ise;
		// obje uzerinden cagr�labilir.
		
		
		C01_InterfaceRunnner obj =new C01_InterfaceRunnner();
		obj.deneme();
		
	}

}
