package day35_inheritance;

public class Memur extends Muhasebe {

	public static void main(String[] args) {
		
		Memur m1 = new Memur ();
		
		Memur m2 = new Memur ();
		
		m1.isim = "Cumali";
		m2.soy›sim = "Korkmaz";
		m1.saatUcreti =20;
		m1.statu = "chef";
		m1.id = m1.idAta();
		m1.maas = m1.maasHesapla();
		
	
		
		
	}
	
	
	
}
