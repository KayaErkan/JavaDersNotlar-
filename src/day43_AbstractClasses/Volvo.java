package day43_AbstractClasses;

public abstract class Volvo { // abs class 
	
	public abstract void kapi(); // abs method
	
	public abstract void motor(); // abs method
	
	public static void main(String[] args) {
		Volvo volvo = new Volvo() {

			@Override
			public void kapi() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void motor() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}
	
	
	
	
	
	
	
	
	public void sunnroof() { // abst. degil override method
		System.out.println("sunroof ile geceleri mehtaba dalýp yoldan çýkma");
	}
}
