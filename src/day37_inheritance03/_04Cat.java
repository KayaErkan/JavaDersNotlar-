package day37_inheritance03;

public class _04Cat extends _03Mamal{

	public void mC() {
		System.out.println("cat'deki mC methodu cal��t�" );
	}
	public int c = 9;// parenti ile ayn�
    public int z = 23;
	
   public  _04Cat () {
    	System.out.println("P'siz Cat cons cal��t�");
    }
    
   public _04Cat (String str) {
	   this();
	   System.out.println(super.c);
    	System.out.println("string p'li Cat cons ");
    }
    
    
}
