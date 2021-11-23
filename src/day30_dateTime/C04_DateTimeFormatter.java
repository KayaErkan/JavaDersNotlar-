package day30_dateTime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {

	public static void main(String[] args) {
		LocalDate bugun = LocalDate.now();
		LocalDate date = LocalDate.of(2020, 5, 15);
		
		/*
         * yy: YILIN SON iKi RAKAMI
         * yyyy : y�l�n tamam�n�
         * y : y�l�n tamam�n�
         * M : ay s�ras�n� verir TEMMUZ i�in : 7
         * MM:  ay s�ras�n� veriri TEMMUZ i�in : 07
         * MMM . ay isminin ilkuc harfini verir. JUL
         * MMMM : ay isminin tamam�n� verir
         */
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/M/yy");//02/8/21
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yy");//15/05/20
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");//02/A�u/2021
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd$M$yyyy");//15$5$2020
		
		System.out.println(dtf.format(date));
		System.out.println(dtf1.format(date));
		System.out.println(dtf2.format(bugun));
		System.out.println(dtf3.format(date));
		
		// Ka� Yas�nday�z
		
		LocalDate dt = LocalDate.of(1992, 06, 14);
		System.out.println("Bug�n�n  Tarihi : " + bugun);
		System.out.println("Faruk dt : " + dt);
		
		Period yasim = Period.between(dt, bugun);
		System.out.println("Erkan�n yas� : " + yasim);
		System.out.println(yasim.getYears());
		
		
		
		
		
		
		
		
		
		
		
	}

}
