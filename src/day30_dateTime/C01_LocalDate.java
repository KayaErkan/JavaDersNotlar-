package day30_dateTime;

import java.time.LocalDate;

public class C01_LocalDate {

	public static void main(String[] args) {
		LocalDate tarih = LocalDate.now(); // tarih isminde obje creat ettik.
			System.out.println("bug�n�n tarihi : " + tarih);	

		System.out.println("Bug�nden 21 g�n sonras� : " + tarih.plusDays(21));//2021-08-23
		
		System.out.println("Bug�nden 3 y�l sonras� : " + tarih.plusYears(3));//2024-08-02
		
		System.out.println("Bug�nden 3 g�n 5 ay 2 y�l sonras� : " + 
				           tarih.plusDays(3).plusMonths(5).plusYears(2));//2024-01-05	
		
		System.out.println("Bug�nden 40 g�n �ncesi : " + tarih.minusDays(40));//2021-06-23
		System.out.println("Bug�n��n 5 y�l �ncesi 2 ay sonras� 3 hafta ertesi : " + 
							tarih.minusYears(5).plusMonths(2).plusWeeks(3));//2016-10-23
		
		/* LocalDate class�ndan �retilen obj method chain kural�na uyar.
		 * Ve methodlalr atn� (homojen) olmak zorunda de�ildir Ex: 2016-10-23
		 * 	
		 */
		
		System.out.println(tarih.getDayOfMonth());// 2
		System.out.println(tarih.getDayOfWeek());//MONDAY
		System.out.println(tarih.getMonthValue()); // 8
		System.out.println(tarih.getMonth()); // AUGUST
		
		LocalDate dgmGnDate = LocalDate.of(1992, 6, 14);
		System.out.println("Dogum Tarihi : " + dgmGnDate);
		
		System.out.println("Do�um G�n� : " + dgmGnDate.getDayOfWeek());// SUNDAY
		
		System.out.println(tarih.isAfter(dgmGnDate));// true
		System.out.println(dgmGnDate.isBefore(tarih)); // true
		
		System.out.println("Bug�n art�k y�l m� : " + tarih.isLeapYear()); // false
		
	}

}
