package day43_AbstractClasses;

public class C02_Final02 extends C01_Final01{

	public static void main(String[] args) {
		System.out.println(C01_Final01.SAY�);
		
		//static bir variable okul ismi gibi herkes i�in ayn�d�r
		//C01_Final01.SAY� += 20; SAY� varible'� final olarak tan�mland�g� i�in DEG�ST�R�LEMEZ
		
		C02_Final02 obj1 = new C02_Final02();
		obj1.deneme();
	}

	
	public void deneme() {
		System.out.println("Child class daki overriding method");
	}
	/*
	public void deneme2() {
		//Cannot override the final method from C01_Final01
	}
	*/
	
	// final class yapt�g�m�zda inherit edilemez
	
}
