package day06_relationalOperators_ifStatement;

public class C01_RelationalOperators {

	public static void main(String[] args) {
		
		System.out.println(15*3==40); // false
		
		System.out.println(15-3==12);// true
		
		boolean eþitMi = 24 / 2 == 12;
		
		System.out.println(eþitMi);
		
		
		
		
		System.out.println((5 + 2 > 8) || 9 < 6 ); // ikisi de yanlýþ olduðu için sonuç false
		System.out.println((5 + 2 < 8) || 9 < 6 ); // or operatorü olduðu için ve bir tane true barýndýrdýðý için true olur
		
			
		System.out.println((5 + 2 > 8) &&  9 < 6 );// And operatoru kullanýldýðý için bir tane false barýndýrmasý hepsini false yapar
		System.out.println((5 + 2 < 8) || 9 >= 6 );// or operatoru oldugu için bir tane true barýndýrdýgý için sonuç true olur
		
		// And Operatorü mükemmelliyetçidir her iki deðer true olursa sonuç true olur her iki deðerden biri false olursa false sonucunu verir
		// Or operatörü iyimserdir sadece her iki deðerin  false olmasý durumunda sonucu false verir diðer durumlarda hep true döner
		
		
		
		
		
		
		
		

	}

}
