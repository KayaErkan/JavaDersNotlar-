package day34_encapsulation02;

public class EncapsulationRunner {

	public static void main(String[] args) {
		Encapsulation obj1 = new Encapsulation();
		System.out.println(obj1.getOkulIsmi());
		System.out.println(obj1.getokulHesapNo());
		System.out.println(obj1.isokulAcikMi());

		obj1.setOkulIsmi("mehmet koleji");// obj1 için okul ismini degiþtirdik
		System.out.println(obj1.getOkulIsmi());// mehmet koleji
		
		Encapsulation obj2 = new Encapsulation();
		System.out.println(obj2.getOkulIsmi());// Yildiz Koleji
	}

}
