package day43_AbstractClasses;

public class C01_Final01 {

	final static int SAY� = 10;
	
	// �nstance bir variable'� final ve static yaparsan�z java onu bold yapar
	// bizde ismi buyuk harfle yazar�z.
	
	String isim;
	//instance variable'lara ilk deger atamak zorunda degiliz
	// deger atamad�g�m�zda java data turune gore default bir deger atar
	
	//final String soy�sim;
	//final VAriable''n�n degeri sonradan de�i�tirilemeyecegi i�in 
	//ilk atama yap�lmadan olusturulmas�na java izin vermez.
	
	public static void main(String[] args) {
		System.out.println(SAY�);
		
		
	}
	public void deneme() {
		System.out.println("deneme yapiyoruz");
		
	}
	
	
	public final void deneme2() {
		System.out.println("final deneme yapiyoruz");
		
	}
	
	
	
	
	
	
	
	
	
	

}
