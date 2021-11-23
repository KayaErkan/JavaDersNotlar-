package day33_encapsulatýon;

public class ArabaMAin {

	public static void main(String[] args) { // 4.step class
		 
		        //5. step 8-9-10. satirlar
		        Araba volvo=new Araba("xc90", "beyaz", -2400, -2020);
		        Araba audi=new Araba("Q7", "bej", -3000, -2021);
		        Araba honda=new Araba();//defalut parametresiz cons var iken
		    
		    honda.model="civic";
		    honda.renk="gri";
		    honda.setYil(1999);
		    honda.setMotor(1400);
		    System.out.println("honda yil :" +honda.getYil());
		    System.out.println("honda motor : "+honda.getMotor());
		    System.out.println("volvo motor : "+volvo.getMotor()); //2400
		    System.out.println("audi yil : "+audi.getYil());//2021
		    
		    }

		
		
	}


