package day43_AbstractClasses;

public class C02_Final02 extends C01_Final01{

	public static void main(String[] args) {
		System.out.println(C01_Final01.SAYÝ);
		
		//static bir variable okul ismi gibi herkes için aynýdýr
		//C01_Final01.SAYÝ += 20; SAYÝ varible'ý final olarak tanýmlandýgý için DEGÝSTÝRÝLEMEZ
		
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
	
	// final class yaptýgýmýzda inherit edilemez
	
}
