package day43_AbstractClasses;

public class IdariPersonel extends Personel {
	// extends personel yazarak Abstract personele concreate bir chil olusturdum
	// ve java cte verdi
	//çözüm olarak urettiði 2 ihtimal var
	// 1-Unimplement(uyarlanmamýs) methodlari uyarla
	// 2-Ya da personel class'ýndan abstract kelimesini kaldir.
	// Bu classýn calýsabilmesii için 2 iþlemden birini yapmak zorundayýz
	public static void main(String[] args) {
		

	}
	// concreate bir class ta abstract bir method olabilir mi?
	// abstract bir method sadece abstract bir class'da olusturulabilir 
	// public abstract void surekliCalisma();
	//The abstract method surekliCalisma in type IdariPersonel 
	//can only be defined by an abstract class
	// 

	@Override
	public void maasHesapla() {
		System.out.println("Idari personel maaþý 4000 tl");
		
	}

	@Override
	public void maasBilgisi() {
		
		
	}

}
