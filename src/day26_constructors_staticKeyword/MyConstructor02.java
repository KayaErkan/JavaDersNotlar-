package day26_constructors_staticKeyword;

public class MyConstructor02 {
	
	int x = 3;
	int y = 5;
	
	 MyConstructor02() {
		x += 1;
		System.out.println("-x" + x);
	}

	 MyConstructor02 (int i){
		 this ();
		 
		 this.y = i;
		 x += y;
		 System.out.println("-x" + x);
	 }
	 MyConstructor02 (int i , int i2){
		 this (3);
		 
		 this.x -= i;
		 System.out.println("-x" + x);
	 }
	 
	 public static void main(String[] args) {
		MyConstructor02 mc1 = new MyConstructor02(4,3);
	}
	 
}
