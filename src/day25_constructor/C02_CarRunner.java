package day25_constructor;

public class C02_CarRunner {

	public static void main(String[] args) {

		C01 car1 = new C01();

		/*
		 * bir e�itlikte e�itli�in sol taraf� declarat�on dur declarat�on da data t�r�
		 * ve variable name olmal� String str = "mehmet"; Data turu class ismi
		 * olabilir!!!! primitive data turler�n� java olusturmustur, biz primitive data
		 * turu olu�turamay�z non-primitive data turler�n� jjava da olu�turabilir, bizde
		 * olu�turabiliriz
		 * 
		 * C01 car1 yazd�g�m�zda C01 hem class ismi , hemde car1 objesinin non-primitive
		 * data turudur
		 * 
		 * new C01(); esitliginin sag� deger olu�turma new: keyword dur ve yeni bir obje
		 * olu�turacag�m�z� beyan eder C01() iise constructor dur.
		 */

		car1.fiyat = 10000;
		car1.ilanNo = 1001;
		car1.marka = "Toyota";
		car1.model = "Corolla";
		car1.yil = 2020;
		// variable ler sadece deger atamas� yapar
		System.out.println(car1.fiyat+ ", " + car1.ilanNo + ", " + car1.marka+", "+
		                    car1.model+ ", " + car1.yil);
		
		
		car1.maxHiz(200);
		car1.yakit("dizel");
		// meethodlar�n ne yapacag�n� method belirler
		
		C01 car2 = new C01();
		System.out.println(car2.fiyat+ ", " + car2.ilanNo + ", " + car2.marka+", "+
                car2.model+ ", " + car2.yil); //0, 0, null, null, 0
		
		car2.fiyat = 15000;
		car2.ilanNo = 1002;
		car2.marka = "Opel";
		car2.model = "Astra";
		car2.yil = 2010;
		
		System.out.println(car2.fiyat+ ", " + car2.ilanNo + ", " + car2.marka+", "+
                car2.model+ ", " + car2.yil); // 15000, 1002, Opel, Astra, 2010
		
		
		
	}

}
