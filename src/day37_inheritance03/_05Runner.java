package day37_inheritance03;

public class _05Runner {

	public static void main(String[] args) {
		
		_04Cat c1 = new _04Cat();//p'siz cons ile obj Data type Cat classýndan
        /*
         * ayný isimli veriable'ler obj. call edilirken once obj 
         * kendi classýndaki veriable call edilir. 
         * sonra parentindeki veriable call edilir.
         */
		
		System.out.println(c1.a);
		System.out.println(c1.c);
		System.out.println(c1.m);
		System.out.println(c1.z);
		
		c1.mM();
		c1.mC();
		c1.mA();
		
		/* Method call edilirken ayný isimli methodlarýn hangisinin alýnacagýna const karar verir
		 * child'an parente dogru hiyerarþi yapýlýr.babadan dedeye önce kimde bulursa onu alýr
		 * Data type ve constructor farklý classlar --> parent obj = new child();
		 * parent class tan baslanýr child class tan degil
		 * 
		 */
		
		
		
		_03Mamal c2 = new _04Cat("X");
		System.out.println(c2.a);// 5 Animal class --> call
		System.out.println(c2.c);// 7 mammal class --> call
		System.out.println(c2.m);// 4 mammal class --> call
		
		c2.mA();
		c2.mC();
		c2.mM();
		
		_03Mamal  m1 = new _03Mamal ();
		_02Animal c3 = new _04Cat();
		
		//m1 ve c3 obj uzerinden veriable ve method call???
    
		
	}
}
