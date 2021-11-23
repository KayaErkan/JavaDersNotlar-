package day15_forLoops;

 class C02_ForLoop01 {
public static void main(String[] args) {
	
	// 10 dan 20 ye kadar olan sayýlarý yazdýran bir loop oluþturalým
	
	
	for (int i = 10;i <= 20 ;i++) {
		System.out.print(i + " ");
	}
	
	// 100 ile 200 dahil aralarýndaki 10 ile bölünebilen sayýlarý yazdýrn
	System.out.println();
	for (int a = 100;a <= 200 ;a += 10) {
		System.out.print(a + " ");
	}
	
	// 50 den 20 ye kadar (sýnýrlar dahil) 3 er 3 er geri sayarak yazdýralým
	System.out.println();
	for (int i = 50;i >= 20 ;i-= 3) {
		System.out.print(i + " ");
	}
	System.out.println();
	// 50 ile 100 arasýnda 3 ile bölünebilen sayýlarý yazdýrýn
	
	for (int i = 50;i <= 100 ;i++) {
		if(i % 3 == 0) {
			System.out.print(i + " ");
		}
	}
	
	System.out.println();
	// eger degiþkenimiz verilen artis veya azalýsla bitiþ kosuluna ulaþamýyorsa
	// sonsuz loop oluþur ve sistem cokene kadar loop çalýþmaya devam eder
	/*for (int i = 10;i < 20 ;i--) {
		System.out.print(i + " ");
	} */
	
	System.out.println();
	
	// eger baþlangýc degeri koþulu saðlamýyorsa loop body hiç çalýþmadan
	// loop un sonuna gider yani loop iþlevsiz olur
	for (int i = 10;i < 0 ;i++) {
		System.out.print(i + " ");
	}
	
	System.out.println("son for loop sonrasý");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
