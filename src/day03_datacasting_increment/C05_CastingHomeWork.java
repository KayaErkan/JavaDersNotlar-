package day03_datacasting_increment;

public class C05_CastingHomeWork {

	public static void main(String[] args) {
		
		// 2- int veri t�r�nde bir de�i�ken olu�turun ve ad�m ad�m narrowing yap�n ve yazd�r�n
		
		int num1 = 20;
		
		short num2 = (short) num1;
		
		System.out.println("Short de�i�keninde = " + num2);
		
		byte num3 = (byte) num2;
		
		System.out.println("Byte de�i�keninde = " + num3);
		
		// 3- float data t�r�nde bir variable olu�turun ve yazd�r�n
		
		float num4 = 321.456f;
		System.out.println("Float de�i�keni = " + num4);
		
		// 4- double 255.36 say�s�n� int'a ve sonra da olu�turdu�unuz int say�y� byte �evirin
		
		double num5 = 255.36;
		System.out.println("double de�i�keni = " + num5);
		int num6 = (int) num5;
		System.out.println("int de�i�keni = " + num6);
		
		byte num7 = (byte) num6;
		System.out.println("byte de�i�keni = " + num7);
		
		
		
		
		
		
		

	}

}
