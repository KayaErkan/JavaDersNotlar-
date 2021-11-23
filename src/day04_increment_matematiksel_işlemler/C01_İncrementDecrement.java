package day04_increment_matematiksel_iþlemler;

public class C01_ÝncrementDecrement {

	public static void main(String[] args) {
	
		int sayi1 = 10;
		int sayi2 = 20;
		
		sayi1 -= 5;
		sayi2 += 10;
		
		System.out.println(sayi2 / sayi1);
		
		sayi1 *= 2;
		sayi2++;
		
		System.out.println(sayi2 / sayi1);
		
		sayi1 /= 2;
	
		double sayi3 = sayi2/10; //sayi2 int olduðundan sayi2/10 iþleminin sonucunu java 3 olarak bulur
		// ama atama iþlemi yapýlýrken sayi3 double olduðu için 
		//bölme iþleminin sonucu olan 3 ü casting ile 3.0 a çevirir
		
		
		System.out.println(sayi3);
		
		System.out.println(sayi1 * sayi2); // 155
		
		System.out.println(sayi1*sayi3); // 15.0
		
		sayi3 =(double) sayi2/10; 
		
		System.out.println(sayi3);
		
		System.out.println(sayi2);// 31
		System.out.println((double)sayi2);// 31.0
		System.out.println(sayi2); // 31
		
		
		
		sayi2 += 0.2; // sayi2 int
		
		System.out.println(sayi2); //31
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
