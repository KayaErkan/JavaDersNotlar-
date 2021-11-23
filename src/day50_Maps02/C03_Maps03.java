package day50_Maps02;

import java.util.HashMap;
import java.util.Map;

public class C03_Maps03 {

	public static void main(String[] args) {
		Map<Integer, String>	map1 = new HashMap<>();
		
		map1.put(101, "Ali,Can,Java");
		map1.putIfAbsent(102, "Veli,Yan,java");
		map1.put(103,"Ali,Can,C#");
		
		
		System.out.println(map1.get(101));//Ali,Can,Java
		System.out.println(map1.get(105));//null

		System.out.println(map1.getOrDefault(105, "Aradýgýnýz map'te yok"));//Aradýgýnýz map'te yok
		
		System.out.println(map1.keySet());//[101, 102, 103]
		map1.replace(103, "Mesut,Aksu,Java");// put ile de bu iþlemi yapabiliriz
		System.out.println(map1);//{101=Ali,Can,Java, 102=Veli,Yan,java, 103=Mesut,Aksu,Java}
		
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("H", 1);	
		map2.put("e", 1);
		map2.put("l", 2);
		map2.put("o", 3);
		
		System.out.println(map2);//{e=1, H=1, l=2, o=3}
		
		map2.compute("H", (key,value) -> 10);
		
		System.out.println(map2);//{e=1, H=10, l=2, o=3}
		
		map2.computeIfAbsent("A", v -> 15);
		map2.computeIfAbsent("H", v -> 5);
		System.out.println(map2);
		map2.computeIfPresent("H",(key,value)-> 20);// "H"nin valuesini 20 yaptý
		map2.computeIfPresent("m",(key,value)-> 20);// "m" mapte olmadýgý için eklmedi
		System.out.println(map2);//{A=15, e=1, H=20, l=2, o=3}
	}

}
