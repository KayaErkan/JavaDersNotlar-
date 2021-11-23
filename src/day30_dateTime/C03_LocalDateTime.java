package day30_dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println( "actual tarih ve zaman : " + ldt);//2021-08-02T22:04:30.111768600
		
		LocalDate d = LocalDate.of(2016, 10, 3);
		LocalTime t = LocalTime.of(11, 10);
		
		LocalDateTime ldt1  = LocalDateTime.of(d,t);
		System.out.println(d);
		System.out.println(t); // 11:10
		System.out.println(ldt1); // 2016-10-03T11:10
		
		System.out.println(ldt.getHour()); // 22 
		
	}

}
