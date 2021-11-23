package day15_forLoops;

 class C02_ForLoop01 {
public static void main(String[] args) {
	
	// 10 dan 20 ye kadar olan say�lar� yazd�ran bir loop olu�tural�m
	
	
	for (int i = 10;i <= 20 ;i++) {
		System.out.print(i + " ");
	}
	
	// 100 ile 200 dahil aralar�ndaki 10 ile b�l�nebilen say�lar� yazd�rn
	System.out.println();
	for (int a = 100;a <= 200 ;a += 10) {
		System.out.print(a + " ");
	}
	
	// 50 den 20 ye kadar (s�n�rlar dahil) 3 er 3 er geri sayarak yazd�ral�m
	System.out.println();
	for (int i = 50;i >= 20 ;i-= 3) {
		System.out.print(i + " ");
	}
	System.out.println();
	// 50 ile 100 aras�nda 3 ile b�l�nebilen say�lar� yazd�r�n
	
	for (int i = 50;i <= 100 ;i++) {
		if(i % 3 == 0) {
			System.out.print(i + " ");
		}
	}
	
	System.out.println();
	// eger degi�kenimiz verilen artis veya azal�sla biti� kosuluna ula�am�yorsa
	// sonsuz loop olu�ur ve sistem cokene kadar loop �al��maya devam eder
	/*for (int i = 10;i < 20 ;i--) {
		System.out.print(i + " ");
	} */
	
	System.out.println();
	
	// eger ba�lang�c degeri ko�ulu sa�lam�yorsa loop body hi� �al��madan
	// loop un sonuna gider yani loop i�levsiz olur
	for (int i = 10;i < 0 ;i++) {
		System.out.print(i + " ");
	}
	
	System.out.println("son for loop sonras�");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
