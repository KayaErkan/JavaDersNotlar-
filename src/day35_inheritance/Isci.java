package day35_inheritance;

public class Isci extends Muhasebe {

	public static void main(String[] args) {
		 Isci  i1 = new Isci();
		 
		 i1.isim = "Erkan";
		 i1.soyİsim = "Kaya";
		 i1.id = 1001;
		 i1.izindeMi = false;
		 i1.saatUcreti = 10;
		 i1.statu = "İsci";
		 i1.maas=i1.maasHesapla();
		 
		 System.out.println(i1.id + "\n" + i1.isim + "\n"+ i1.soyİsim + "\n"+
		                     i1.statu + "\n" + i1.maas +" tl" );
		 
		 // bu derse kadar hangi class dan bilgi elde etmek istiyorsak o classdan obj oluşturduk
		 // inheritance ile o mecburiyet ortadan kalktı
		 // child  classta oluşturdugumuz obj ile tum parent classlarda
		 // bulunan variable ve methodları inherit edebilirim
		 System.out.println("***************************************");
		 Isci  i2 = new Isci();
		 
		 i2.isim = "Rıfkı";
		 i2.soyİsim = "Şıfkı";
		 i2.id = 1002;
		 i2.izindeMi = true;
		 i2.saatUcreti = 15;
		 i2.statu = "İsci";
		 i2.maas=i1.maasHesapla();
		 
		 System.out.println(i2.id + "\n" + i2.isim + "\n"+ i2.soyİsim + "\n"+
		                     i2.statu + "\n" + i2.maas +" tl" );
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
}
