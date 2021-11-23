package day33_encapsulat�on;

public class C03_Encapsulation03 {

	public static void main(String[] args) {
		// Encapsulation02 class�ndaki class member a ula�maya �al��al�m
		
		C02_Encapsulation02 obj1 = new C02_Encapsulation02();
		C02_Encapsulation02 obj2 = new C02_Encapsulation02();
		// Biz eri�im yetkisini 2 ye ay�r�yoruz 
		// 1-okuyabilme
		// 2-de�i�tirip kullanabilme
		
		System.out.println(obj1.sayi);//100 public oldugundan hem okudum
		obj1.sayi = 25;// hemde deger  atayabildim
		System.out.println(obj1.sayi); //25 hemde deger  atayabildim
		System.out.println(obj2.sayi);//100
		
		System.err.println(obj1.getOkulkIsmi()); // Yildiz Koleji
		// get methodu oldugu i�in sadece bilgi verir
		// obj1.getOkulkIsmi()="Mehmet Koleleji" => get memthodu sadece okur degistiremez 
		
		obj1.setTcNo("12345678910");
		// System.out.println(obj1.setTcNo(12345678910)); set () methodu okumaya izin vermez
		obj1.setHesapNo(546798);
		
		
	/* Bir Class i�inde class member olustururken bunu diger class'lar ile ne oranda
	 * paylasacagimiza karar veririz.
	 * 
	 * 1- Herkes okuyabilsin ve obje uzerinden deger atay�p kullanabilsin => public
	 * 2- Herkes okuyabilsin ama kimse obje uzerinden de olsa degistiremesin Private => get()
	 * 3- �lk atad�g�m degeri kimse g�remesin => Public set()
	 */
		
		
		
		

	}

}
