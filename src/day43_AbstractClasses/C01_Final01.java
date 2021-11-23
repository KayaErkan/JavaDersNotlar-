package day43_AbstractClasses;

public class C01_Final01 {

	final static int SAYÝ = 10;
	
	// Ýnstance bir variable'ý final ve static yaparsanýz java onu bold yapar
	// bizde ismi buyuk harfle yazarýz.
	
	String isim;
	//instance variable'lara ilk deger atamak zorunda degiliz
	// deger atamadýgýmýzda java data turune gore default bir deger atar
	
	//final String soyÝsim;
	//final VAriable''nýn degeri sonradan deðiþtirilemeyecegi için 
	//ilk atama yapýlmadan olusturulmasýna java izin vermez.
	
	public static void main(String[] args) {
		System.out.println(SAYÝ);
		
		
	}
	public void deneme() {
		System.out.println("deneme yapiyoruz");
		
	}
	
	
	public final void deneme2() {
		System.out.println("final deneme yapiyoruz");
		
	}
	
	
	
	
	
	
	
	
	
	

}
