package day37_inheritance03;

public class _03Mamal extends _02Animal {
	public void mA() {
		System.out.println("Mamaldaki mA methodu çalýþtý");// parenti ile ayný
	}
	public void mC() {
		System.out.println("Mamaldaki mC methodu çalýþtý");
	}
	
	public int c = 7;
    public int m = 4;// parenti ile ayný
	
    public _03Mamal() {
		this('A');
		System.out.println("p'siz mamal cons.");
	}
	
	public _03Mamal(char d) {
		super(34);// parentten p'li cons. call ettim
		System.out.println("char p'li mamal cons. ");
		
		
		
	}
    
	
}
