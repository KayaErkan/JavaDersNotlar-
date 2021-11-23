package day37_inheritance03;

public class UstaBasi extends Isci {
	
	public String bolum = "Takýmhane";
	public int sorOLdIsciSay = 20;
	
	
	public static void main(String[] args) {
		
		UstaBasi ub1 = new UstaBasi();
		
		// objeyi torun classýnda oluþturunca 3 classa da ulaþabiliriz 
		
		
		System.out.println(ub1.bolum);
		System.out.println(ub1.sorOLdIsciSay);
		System.out.println(ub1.saatUcretý);
		System.out.println(ub1.isim);
		
		Isci ub2 = new UstaBasi();
		// Extends ile birbirine baglý olann classlarda is-a relatýon olan 
		// data turlerý istege baglý olarak kullanýlabilir
		// Daha geniþ data turu yazmanýn avantajý :
		// Kapsamýn daha geniþ hale gelecek olmasý
		// Daha geniþ data turu yazmanýn avantajý :
		// Data turu olarak sectigimiz class ve parentlarýna ulaþabiliriz
		
		System.out.println(ub2.depertman);// isci
		System.out.println(ub2.izindeMi);// Personel
		
		Personel ub3 = new UstaBasi();
		System.out.println(ub3.id); // sadece personele ulaþabilirim
		
		// Data turu olarak hangi classa gittiysek o classa ait datalara
		// ulaþabiliriz.Data turu dediðimiz sey eþitliðin solundaki class!
		
		
	}
}
