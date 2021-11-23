package day31_Varargs;

public class C06_StringBuilder02 {

	public static void main(String[] args) {
		 StringBuilder sb1 = new StringBuilder(); // bos bir sb1 creat ettik
		 // SB a eleman ekleme ---> obj.appent(obj);
		 sb1.append("faruk");
		 System.out.println("sb1 ilk hali : " + sb1);//faruk
		 sb1.append(" efehan");
		 System.out.println("sb1 efehan ekli hali : " + sb1);// faruk efehan
		 System.out.println("sb1 uzunluk : " + sb1.length()); // 12
		 System.out.println("sb1 kapasitesi : " + sb1.capacity());// 16
		 System.out.println("sb1 in son hali : " + sb1.append(" guzel insan dýr dedim size! neden inanmýyorsunuz?"));
		 System.out.println("sb1 in kapasitesinin son hali : " + sb1.capacity());
		 System.out.println("sb1 uzunlugunu son hali : " + sb1.length());
	}

}
