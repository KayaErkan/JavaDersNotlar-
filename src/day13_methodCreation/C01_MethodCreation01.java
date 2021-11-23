package day13_methodCreation;

public class C01_MethodCreation01 {

	public static void main(String[] args) {
		//bir methodu olu�turmak o methodu �al��t�rmak i�in yeterli de�ildir
		// Eger bir methodu �al��t�rmak isterseniz
		// Method Call (o methodu cag�rmal�s�n�z) ile �a��rmal�s�n�z
		
		// method call yapmak i�in methodun ad� ve varsa parametreleri yaz�lmal�d�r.
		toplama(20,40);
		
		// sadece method call yapt���m�zda method �al���r 
        // eger methoodun i�inde bir �ey yazd�r�yorsak konsolda o yaz�y� g�r�r�z
		
		// ancak methodumuz return type'a sahipse bize bir sonu� return edecektir 
		// bu sonucu ya direk yazd�r�r�z.... 
		
		System.out.println(toplama(15,20));
		
		
		//yada d�nen sonucu bir variable'a atayabiliriz
		
		int sonuc = toplama(10,15);
		System.out.println(sonuc);
	}

	public static int toplama (int sayi1 , int sayi2) {
		
		System.out.println("Method �al��t�");
		
		return sayi1+sayi2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
