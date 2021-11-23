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
              javaya exceptions'� handle etmek i�in bir ��z�m �retmezsek java exception
              ile kar�ilastiginda cal��may� durdurur (stops execut�on)
              throws exception (exception f�rlat�r)(problemin kaynag�n� bize g�sterir)
            
              tum aplication durmus olur
              musterinin kulland�g� bir uygulama i�in bu kabul edilemez
              bunun i�in kod yazan ki�i muhtemel sorunlar� �ng�rmeli ve 
              Javaya bu sorunla handle edebilmesi i�in yol g�stermelidir.
             */
            	System.out.println("islem no : " + count);
            
            try {
  
                System.out.println("bolum : "+sayi1/sayi2);
                
            } catch (ArithmeticException e) {//try body'sinden muhtemel hata 
            	                             //ArithmeticException olarak catch body'a 
            	                             //sart olarak yazildi
            System.out.println("hatali giris yapt�n  bolen 0 olamaz");//manuel handle
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
