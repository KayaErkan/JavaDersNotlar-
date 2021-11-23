package day13_methodCreation;

public class C01_MethodCreation01 {

	public static void main(String[] args) {
		//bir methodu oluþturmak o methodu çalýþtýrmak için yeterli deðildir
		// Eger bir methodu çalýþtýrmak isterseniz
		// Method Call (o methodu cagýrmalýsýnýz) ile çaðýrmalýsýnýz
		
		// method call yapmak için methodun adý ve varsa parametreleri yazýlmalýdýr.
		toplama(20,40);
		
		// sadece method call yaptýðýmýzda method çalýþýr 
        // eger methoodun içinde bir þey yazdýrýyorsak konsolda o yazýyý görürüz
		
		// ancak methodumuz return type'a sahipse bize bir sonuç return edecektir 
		// bu sonucu ya direk yazdýrýrýz.... 
		
		System.out.println(toplama(15,20));
		
		
		//yada dönen sonucu bir variable'a atayabiliriz
		
		int sonuc = toplama(10,15);
		System.out.println(sonuc);
	}

	public static int toplama (int sayi1 , int sayi2) {
		
		System.out.println("Method çalýþtý");
		
		return sayi1+sayi2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
