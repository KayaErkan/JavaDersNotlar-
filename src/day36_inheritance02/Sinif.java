package day36_inheritance02;

public class Sinif extends Okul {
	
	public Sinif(int age) {
		
		super();
		
		System.out.println("Child class parametreli constructor");
		
	}
	
	public Sinif() {
		
		this(11);
		
		System.out.println("Child class parametresiz constructor");
		
	}
	public static void main(String[] args) {
		Sinif sinif1 = new Sinif();

	}

}
