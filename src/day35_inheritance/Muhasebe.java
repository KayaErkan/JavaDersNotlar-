package day35_inheritance;

public class Muhasebe extends Personel {
	
	/*
	 Muhasebe class�n�n personel class�n�n child class� oldugunu
	 declare etmek i�in class ismine extends keyword ile 
	 parent class� yazar�z
	 */
	
	
	public int saatUcreti;
	public String statu;
	public int maas;
	
	public int maasHesapla() {
		maas = saatUcreti*8*30;
		return maas;
	}
}
