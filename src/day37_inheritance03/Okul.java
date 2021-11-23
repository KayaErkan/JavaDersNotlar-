package day37_inheritance03;

public class Okul {

	protected int num1 =10;
	public String name = "Ali";
	private int num2 = 11;
	
	public Okul() {
		System.out.println("Parent class cons");
	}

	public synchronized int getNum2() {
		return num2;
	}

	public synchronized void setNum2(int num2) {
		this.num2 = num2;
	} 
	
	
	
	
}
