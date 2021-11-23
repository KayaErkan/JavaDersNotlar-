package day04_increment_matematiksel_iþlemler;

public class C04_Modulos {

	public static void main(String[] args) {
		// 5496 sayýsýnýn rakamlar toplamýný bulalým
		
		
		int sayi = 5496;
		int rakamlarToplamý = 0;
		
		// bir sayýnýn rakamlar toplamýný bulmak için her basamak deðerinde 3 iþlem yaparýz
		// bu satýrda sayi = 5496, rakamlarToplamý = 0
 		
		// 1- sayý % 10 ile son basamaðý elde ederiz.
		
		int rakam = sayi %10;
		
		// 2- bu rakamý rakamlar toplamýna ekleriz.
		
		rakamlarToplamý += rakam;
		
		// 3- deðerini aldýðýmýz son basamaktan kurtulmak için sayýyý 10' a böleriz
		
		sayi /= 10;
		
		// bu satýra geldiðimde sayý 549, rakamlar toplami = 6
		
		
		rakam = sayi % 10;
		
		rakamlarToplamý += rakam;
		
		sayi /= 10;
		
		
		
		
		// bu satýra geldiðimde sayý 54, rakamlar toplami = 15
		
		rakam = sayi % 10;
		
		rakamlarToplamý += rakam;
		
		sayi /= 10;
		
		
		
		// bu satýra geldiðimde sayý 5, rakamlar toplami = 19
		
		rakam = sayi % 10;
		
		rakamlarToplamý += rakam;
		
		sayi /= 10;
		
		
		// kodumuzun sonunda rakamlar toplamý 24, sayý ise 0 oldu
		
		
		System.out.println("Rakamlar Toplamý : " + rakamlarToplamý);
		System.out.println("Sayýnýn son deðeri : " + sayi);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
