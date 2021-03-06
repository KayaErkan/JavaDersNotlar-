package day50_Maps02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C04_Maps04VeriTabanư {

	public static void main(String[] args) {
		
		String dosyaYolu = "C:\\Users\\ERKAN\\Desktop\\veriTabanư.csv";
		
		Map<String, String> veriMap = veriTabanưAl(dosyaYolu);
		System.out.println(veriMap);
	}

	public static Map<String, String> veriTabanưAl(String dosyaYolu) {
		
		Map<String, String> eklenecekMap = new HashMap<>();
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(dosyaYolu));
			String satir = br.readLine();
			
			while(satir != null) {
				String keyValueArr[] = satir.split(";");
				
				eklenecekMap.put(keyValueArr[0], keyValueArr[1]);
				
				satir=br.readLine();
				
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();// detaylư hata raporu verir
		}
	
		return eklenecekMap;
	}

}
