package day49_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C02_Maps02 {

	public static void main(String[] args) {
		
		/*Asagýda verilen map'te yazilim dili java olan kiþi isimlerini 
		 bir liste olarak donduren bir method yazýnýz
		 */
		
		Map<Integer, String> map1 = new HashMap<>();
		
		map1.put(101 , " Ali , Can , Java");
		map1.put(102 , " Veli , Yan , Java");
		map1.put(103 , " Ali , Yan , C#");
		
		String istnenDil="Java";
		List<String> isimList = javaBilenler(map1,istnenDil);
		System.out.println(isimList);// [ Ali ,  Veli ]
		
	}

	private static List<String> javaBilenler(Map<Integer, String> map1, String istnenDil) {
	
		
		List<String> isimListesi = new ArrayList<>();
		for (String each :map1.values()) {
			String arr [] = each.split(", ");
			if(arr[2].equalsIgnoreCase(istnenDil)) {
				isimListesi.add(arr[0]);
			}
			
		}
		
		return isimListesi;
	}

	

}
