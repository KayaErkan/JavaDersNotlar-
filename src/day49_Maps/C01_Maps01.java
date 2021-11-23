package day49_Maps;

import java.util.HashMap;
import java.util.Map;

public class C01_Maps01 {

	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new HashMap<>();
		HashMap<Integer, String> map2 = new HashMap<>();
		
		map1.put(101 , " Ali , Can , Java");
		map1.put(102 , " Veli , Yan , Java");
		map1.put(103 , " Ali , Yan , C#");
		
		System.out.println(map1);//{101= Ali , Can , Java, 102= Veli , Yan , Java, 103= Ali , Yan , C#}

		map2.put(101 , " Vehbi , Bas , Java");
		map2.put(102 , " Esra , Coban , SQL");
		System.out.println(map2);//{101= Vehbi , Bas , Java, 102= Esra , Coban , SQL}
		
		map1.putAll(map2);
		System.out.println(map1);//{101= Vehbi , Bas , Java, 102= Esra , Coban , SQL, 103= Ali , Yan , C#}
		/* Map'e yeni bir Entry eklemek istediðimizde java key'e bakar
		   ilk map'te eklenecek key varsa o zaman bu key'e ait value, 
		   eklenen value ile update edilir 
		 */
		map2.put(104 , " Omer , Ali , SQL");
		map1.putAll(map2);
		System.out.println(map1);//{101= Vehbi , Bas , Java, 102= Esra , Coban , SQL, 103= Ali , Yan , C#, 104= Omer , Ali , SQL}
		
		map1.putIfAbsent(102, "Ahmet , Demir, Java");
		System.out.println(map1);//{101= Vehbi , Bas , Java, 102= Esra , Coban , SQL, 103= Ali , Yan , C#, 104= Omer , Ali , SQL}
		
		map1.putIfAbsent(100, "Ahmet , Demir, Java");
		System.out.println(map1);//{100=Ahmet , Demir, Java, 101= Vehbi , Bas , Java, 102= Esra , Coban , SQL, 103= Ali , Yan , C#, 104= Omer , Ali , SQL}

		System.out.println(map1.containsKey(101));//true
		System.out.println(map1.containsValue("Java"));//false
		System.out.println(map1.containsValue("Ahmet , Demir, Java"));//true
		/* aranan degere tam olarak esit olan bir value varsa true dondurur
		   value içinde gecen kelime veya Stringleri bulmaz
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
