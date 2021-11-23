package day35_inheritance;

public class Isci extends Muhasebe {

	public static void main(String[] args) {
		 Isci  i1 = new Isci();
		 
		 i1.isim = "Erkan";
		 i1.soy�sim = "Kaya";
		 i1.id = 1001;
		 i1.izindeMi = false;
		 i1.saatUcreti = 10;
		 i1.statu = "�sci";
		 i1.maas=i1.maasHesapla();
		 
		 System.out.println(i1.id + "\n" + i1.isim + "\n"+ i1.soy�sim + "\n"+
		                     i1.statu + "\n" + i1.maas +" tl" );
		 
		 // bu derse kadar hangi class dan bilgi elde etmek istiyorsak o classdan obj olu�turduk
		 // inheritance ile o mecburiyet ortadan kalkt�
		 // child  classta olu�turdugumuz obj ile tum parent classlarda
		 // bulunan variable ve methodlar� inherit edebilirim
		 System.out.println("***************************************");
		 Isci  i2 = new Isci();
		 
		 i2.isim = "R�fk�";
		 i2.soy�sim = "��fk�";
		 i2.id = 1002;
		 i2.izindeMi = true;
		 i2.saatUcreti = 15;
		 i2.statu = "�sci";
		 i2.maas=i1.maasHesapla();
		 
		 System.out.println(i2.id + "\n" + i2.isim + "\n"+ i2.soy�sim + "\n"+
		                     i2.statu + "\n" + i2.maas +" tl" );
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
}
