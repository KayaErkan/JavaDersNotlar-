package day35_inheritance;

public class Muhasebe extends Personel {
	
	/*
	 Muhasebe classýnýn personel classýnýn child classý oldugunu
	 declare etmek için class ismine extends keyword ile 
	 parent classý yazarýz
	 */
	
	
	public int saatUcreti;
	public String statu;
	public int maas;
	
	public int maasHesapla() {
		maas = saatUcreti*8*30;
		return maas;
	}
}
