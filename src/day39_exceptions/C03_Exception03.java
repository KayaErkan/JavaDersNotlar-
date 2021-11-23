package day39_exceptions;

import java.util.Scanner;

public class C03_Exception03 {

	public static void main(String[] args) {
		  //kullanicidan alacaginiz iki tam sayinin bolumunu yazdiriniz
        
        Scanner scanner = new Scanner(System.in);
       
        int count=1;
        
        while (count<=100) {
            System.out.print("bolunen sayiyi giriniz : ");
            int sayi1=scanner.nextInt();
            
            System.out.print("bolen sayiyi giriniz : ");
            int sayi2=scanner.nextInt();
            /*
              javaya exceptions'ý handle etmek için bir çözüm üretmezsek java exception
              ile karþilastiginda calýþmayý durdurur (stops executýon)
              throws exception (exception fýrlatýr)(problemin kaynagýný bize gösterir)
            
              tum aplication durmus olur
              musterinin kullandýgý bir uygulama için bu kabul edilemez
              bunun için kod yazan kiþi muhtemel sorunlarý öngörmeli ve 
              Javaya bu sorunla handle edebilmesi için yol göstermelidir.
             */
            	System.out.println("islem no : " + count);
            
            try {
  
                System.out.println("bolum : "+sayi1/sayi2);
                
            } catch (ArithmeticException e) {//try body'sinden muhtemel hata 
            	                             //ArithmeticException olarak catch body'a 
            	                             //sart olarak yazildi
            System.out.println("hatali giris yaptýn  bolen 0 olamaz");//manuel handle
            System.out.println(e.getMessage());// by zero -->handle edilecek veridir
            e.printStackTrace();//java.lang.ArithmeticException: / by zero
                                //bolunen sayiyi giriniz :  at _14_Exceptions.Exceptions02.main(Exceptions02.java:19)
                                //hatanin handle edilmesi icin tum verileri yazdirildi
            
    
}
            count++;
}
        System.out.println("dewamkeee yazisini okuduysan kod bu satira kadar sorunsuz run olmustur...");

	}

}
