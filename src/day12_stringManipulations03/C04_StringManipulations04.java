package day12_stringManipulations03;

import java.util.Scanner;

public class C04_StringManipulations04 {

	public static void main(String[] args) {
		
		/* Soru 5) Kullanicidan 4 harfli bir kelime isteyin
		 4 harften uzun veya kisa ise "lutfen 4 harfli bir kelime girin Yazdirin"
		 ve uygun kelime girilirse girilen kelimeyi tersten yazdirin. */ 
		 
		
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen 4 harfli bir kelime giriniz");
        String kel�me=scan.nextLine();
		
		if(kel�me.length() != 4) {
			System.out.println("lutfen 4 harfli bir kelime Yazin");
		}else {
			System.out.println(kel�me.substring(3,4) + kel�me.substring(2,3)
			                    + kel�me.substring(1,2) + kel�me.substring(0,1));
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
