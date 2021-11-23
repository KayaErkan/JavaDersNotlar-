package day30_dateTime;

import java.time.LocalDate;

public class C01_LocalDate {

	public static void main(String[] args) {
		LocalDate tarih = LocalDate.now(); // tarih isminde obje creat ettik.
			System.out.println("bugünün tarihi : " + tarih);	

		System.out.println("Bugünden 21 gün sonrasý : " + tarih.plusDays(21));//2021-08-23
		
		System.out.println("Bugünden 3 yýl sonrasý : " + tarih.plusYears(3));//2024-08-02
		
		System.out.println("Bugünden 3 gün 5 ay 2 yýl sonrasý : " + 
				           tarih.plusDays(3).plusMonths(5).plusYears(2));//2024-01-05	
		
		System.out.println("Bugünden 40 gün öncesi : " + tarih.minusDays(40));//2021-06-23
		System.out.println("Bugünüün 5 yýl öncesi 2 ay sonrasý 3 hafta ertesi : " + 
							tarih.minusYears(5).plusMonths(2).plusWeeks(3));//2016-10-23
		
		/* LocalDate classýndan üretilen obj method chain kuralýna uyar.
		 * Ve methodlalr atný (homojen) olmak zorunda deðildir Ex: 2016-10-23
		 * 	
		 */
		
		System.out.println(tarih.getDayOfMonth());// 2
		System.out.println(tarih.getDayOfWeek());//MONDAY
		System.out.println(tarih.getMonthValue()); // 8
		System.out.println(tarih.getMonth()); // AUGUST
		
		LocalDate dgmGnDate = LocalDate.of(1992, 6, 14);
		System.out.println("Dogum Tarihi : " + dgmGnDate);
		
		System.out.println("Doðum Günü : " + dgmGnDate.getDayOfWeek());// SUNDAY
		
		System.out.println(tarih.isAfter(dgmGnDate));// true
		System.out.println(dgmGnDate.isBefore(tarih)); // true
		
		System.out.println("Bugün artýk yýl mý : " + tarih.isLeapYear()); // false
		
	}

}
