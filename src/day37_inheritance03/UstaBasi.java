package day37_inheritance03;

public class UstaBasi extends Isci {
	
	public String bolum = "Tak�mhane";
	public int sorOLdIsciSay = 20;
	
	
	public static void main(String[] args) {
		
		UstaBasi ub1 = new UstaBasi();
		
		// objeyi torun class�nda olu�turunca 3 classa da ula�abiliriz 
		
		
		System.out.println(ub1.bolum);
		System.out.println(ub1.sorOLdIsciSay);
		System.out.println(ub1.saatUcret�);
		System.out.println(ub1.isim);
		
		Isci ub2 = new UstaBasi();
		// Extends ile birbirine bagl� olann classlarda is-a relat�on olan 
		// data turler� istege bagl� olarak kullan�labilir
		// Daha geni� data turu yazman�n avantaj� :
		// Kapsam�n daha geni� hale gelecek olmas�
		// Daha geni� data turu yazman�n avantaj� :
		// Data turu olarak sectigimiz class ve parentlar�na ula�abiliriz
		
		System.out.println(ub2.depertman);// isci
		System.out.println(ub2.izindeMi);// Personel
		
		Personel ub3 = new UstaBasi();
		System.out.println(ub3.id); // sadece personele ula�abilirim
		
		// Data turu olarak hangi classa gittiysek o classa ait datalara
		// ula�abiliriz.Data turu dedi�imiz sey e�itli�in solundaki class!
		
		
	}
}
