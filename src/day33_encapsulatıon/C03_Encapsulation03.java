package day33_encapsulatıon;

public class C03_Encapsulation03 {

	public static void main(String[] args) {
		// Encapsulation02 classındaki class member a ulaşmaya çalışalım
		
		C02_Encapsulation02 obj1 = new C02_Encapsulation02();
		C02_Encapsulation02 obj2 = new C02_Encapsulation02();
		// Biz erişim yetkisini 2 ye ayırıyoruz 
		// 1-okuyabilme
		// 2-değiştirip kullanabilme
		
		System.out.println(obj1.sayi);//100 public oldugundan hem okudum
		obj1.sayi = 25;// hemde deger  atayabildim
		System.out.println(obj1.sayi); //25 hemde deger  atayabildim
		System.out.println(obj2.sayi);//100
		
		System.err.println(obj1.getOkulkIsmi()); // Yildiz Koleji
		// get methodu oldugu için sadece bilgi verir
		// obj1.getOkulkIsmi()="Mehmet Koleleji" => get memthodu sadece okur degistiremez 
		
		obj1.setTcNo("12345678910");
		// System.out.println(obj1.setTcNo(12345678910)); set () methodu okumaya izin vermez
		obj1.setHesapNo(546798);
		
		
	/* Bir Class içinde class member olustururken bunu diger class'lar ile ne oranda
	 * paylasacagimiza karar veririz.
	 * 
	 * 1- Herkes okuyabilsin ve obje uzerinden deger atayıp kullanabilsin => public
	 * 2- Herkes okuyabilsin ama kimse obje uzerinden de olsa degistiremesin Private => get()
	 * 3- İlk atadıgım degeri kimse göremesin => Public set()
	 */
		
		
		
		

	}

}
