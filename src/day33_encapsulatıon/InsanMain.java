package day33_encapsulatıon;

public class InsanMain {
 public static void main(String[] args) {
	
	 Ademoglu insan1 = new Ademoglu();  //ademoglundan insan1 obj creat ettim
	 // insan1.age = -47; --> age private old için erişim engeli var
	 insan1.name = "onur";
	 insan1.surName = "enes";
	 insan1.yasAta(-47);
	 System.out.println(insan1.name); // onur
	 System.out.println(insan1.surName); // enes
	 System.out.println(insan1.yasGoster(0)); // 47
}
}
