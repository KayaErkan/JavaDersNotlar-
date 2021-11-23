package day32_stringBuilder;

import java.util.Arrays;

public class C01_StringBuilder01 {

	public static void main(String[] args) {
		 StringBuilder sb1 = new StringBuilder(); // bos bir sb1 creat ettik
		 // SB a eleman ekleme ---> obj.appent(obj);
		 sb1.append("faruk");
		 System.out.println("sb1 ilk hali : " + sb1);//faruk
		 sb1.append(" efehan");
		 System.out.println("sb1 efehan ekli hali : " + sb1);// faruk efehan
		 System.out.println("sb1 uzunluk : " + sb1.length()); // 12
		 System.out.println("sb1 kapasitesi : " + sb1.capacity());// 16
		 System.out.println("sb1 in son hali : " + sb1.append(" guzel insan"));
		 System.out.println("sb1 in kapasitesinin son hali : " + sb1.capacity());
		 
		 
		 // Fazladan ayr�lan kapasiteyi silme --> obj.trimToSize();
		 sb1.trimToSize();
		 System.out.println(sb1.capacity());
		 // �stenen characterin indexini alma --> obj.indexOf();
		 sb1.indexOf("e");
		 System.out.println(sb1.indexOf("e")); // e = 6
		 System.out.println(sb1.lastIndexOf("e")); // e = 16
		 
		 // �stenen bir karakteri indexineg�re alma --> obj.charAt();
		 System.out.println("sb nin 7. karakteri : " + sb1.charAt(7)); // f
		 
		 // belirli bir aral�ktaki characterleri alma --> obj.subSequence();
		 System.out.println(sb1.subSequence(7, 12)); // fehan
		 System.out.println(sb1.toString().substring(5)); // efehan guzel insan
		 System.out.println(sb1.subSequence(5, sb1.length())); // efehan guzel insan
		 
		 
		 // belli bir index teki karakteri silme -->obj.delete(a,b); a dahil b hari� aras� siler
		 								   // -->sb1.deleteCharAt(a); sadece a karakterini siler					
		 sb1.delete(3, 7);
		 System.out.println("3-7 aras� karakter silinmi� hali : " + sb1); // farfehan guzel insan
		 sb1.deleteCharAt(2); // obj.delete(2,3); --> 2. karakteri siler
		 System.out.println("2. karakter silinmi� hali : " + sb1);//fafehan guzel insan
		 
		 // istenen indexe istenen karakteri ve karakterleri eklemek --> obj.insert()index,char);
		// insert methodu parametre olarak sadece char almaz obj alabilir
		 
		 sb1.insert(2, "r");
		 System.out.println("2.indexe r eklenmi� hali : " + sb1); // farfehan guzel insan
		 sb1.insert(7, 3.14); // sb1 obj 7.indexinee  3.14 valuesi eklendi
		 System.out.println(sb1);// farfeha3.14n guzel insan
		 
		 int arr [] = {17,21,63};
		 sb1.insert(9, Arrays.toString(arr)); // sb1'in 9 karakterinden itibaren arr verileri eklendi
		 System.out.println("sb ye arr eklenmi� hali : " + sb1);
		 
		 // istenen index'te ki characterin yerine birden fazla character eklemek
		 // --> obj.replace(a,b,"karakterler"); 
		 
		 StringBuilder sb2 = new StringBuilder("Bug�n hava cook iscakk");
		 System.out.println(sb2);
		 sb2.replace(3, 8, "xxxxxxx");// 3 dahil 8 haric indexler aras�n� silip yerine xxxxx koyduk
		 System.out.println("sb2 nin son hali : " + sb2);//Bugxxxxxxxva cook iscakk
		 // 3 dahil 8 hari� index aras�na verilen xxxxxxx stringi atar
		 // ama atanacak string k�sa, atanacak index uzun olursa
		 // kalan indexteki karakkterleri siler
		 sb2.replace(3, 8, "x");
		 System.out.println("uzun olan indexin silinmi� hali : " + sb2);//Bugxxxva cook iscakk
		 
		 System.out.println("ozel durum : " + sb2.insert(5, "baSArili", 2, 4));//BugxxSAxva cook iscakk
		 /* 5 => sb2 ye baSArili ekleme baslang�c indexi 
		  * basarili =>eklenecek string
		  * 2 => eklenecek Stringin baslang�c indexi (2 dahil)
		  * 4 => eklenecek Stringin biti� indexi(4 hari�)
		  */
		 
		 // reverse methodu --> obj.reverse(); sb elemanlar�n� indexe g�re ters cevirir.
		 StringBuilder sb3 = new StringBuilder("Bug�n hava cook iscakk");
		 sb3.reverse();
		 System.out.println("sb1 ters cevrilmi� hali : " + sb3);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
