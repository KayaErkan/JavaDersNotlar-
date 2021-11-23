package day35_inheritance;

public class Personel {
	public static int sayac = 1000;
	
	public String isim;
	public String soyİsim;
	public int id;
	public boolean izindeMi;

	
	public int idAta() {
		this.id = sayac++;
		return id;
	}
	
	
	
	
}
