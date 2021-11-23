package day30_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C02_LocalTime {

	public static void main(String[] args) {
		
		LocalTime zaman = LocalTime.now();
		System.out.println("Actual zaman : " + zaman);// 21:34:53.070017
		LocalTime time1 = LocalTime.of(12, 35, 23);
		
		System.out.println(time1);
		System.out.println("Su zamanda 2 saat ileri 34 dk geri 45 sn ileri : " +
				zaman.plusHours(2).minusMinutes(34).plusSeconds(45));
		
		for (int i = 0; i < 1000; i++) {
			System.out.print(i);
			
		}
		LocalTime zaman2 = LocalTime.now();
		System.out.println();
		System.out.println(zaman2);
		
		// ulke saatleri hesaplama
		
		ZonedDateTime baskaUlke = ZonedDateTime.now(ZoneId.of("Europe/Amsterdam"));
		System.out.println(baskaUlke);
			
	}

}
