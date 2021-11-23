package day03_datacasting_increment;

public class C05_CastingHomeWork {

	public static void main(String[] args) {
		
		// 2- int veri türünde bir deðiþken oluþturun ve adým adým narrowing yapýn ve yazdýrýn
		
		int num1 = 20;
		
		short num2 = (short) num1;
		
		System.out.println("Short deðiþkeninde = " + num2);
		
		byte num3 = (byte) num2;
		
		System.out.println("Byte deðiþkeninde = " + num3);
		
		// 3- float data türünde bir variable oluþturun ve yazdýrýn
		
		float num4 = 321.456f;
		System.out.println("Float deðiþkeni = " + num4);
		
		// 4- double 255.36 sayýsýný int'a ve sonra da oluþturduðunuz int sayýyý byte çevirin
		
		double num5 = 255.36;
		System.out.println("double deðiþkeni = " + num5);
		int num6 = (int) num5;
		System.out.println("int deðiþkeni = " + num6);
		
		byte num7 = (byte) num6;
		System.out.println("byte deðiþkeni = " + num7);
		
		
		
		
		
		
		

	}

}
