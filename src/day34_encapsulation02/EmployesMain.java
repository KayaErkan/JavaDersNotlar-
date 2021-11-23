package day34_encapsulation02;

import java.util.Scanner;


public class EmployesMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen adýnýzý giriniz");
		String isim = scan.nextLine();
		System.out.println("Lütfen dogum tarihinizi MM//dd//yyyy giriniz");
		String dob = scan.nextLine();
		System.out.println("Talep ettiginiz maaþ giriniz");
		int maas = scan.nextInt();
		
		Employes calisan = new Employes();
		calisan.setDob(dob);
		calisan.setName(isim);
		calisan.setSalary(maas);
		int calisanYas = calisan.yasHesapla(dob);

		if(calisanYas > 18) {
			System.out.println("Welcome to our company " + calisan.getName() +
					" your salary is : " + calisan.getSalary());
		}else if (calisanYas < 18) {
			System.out.println("come back when you are 18 years old");
		}else if(calisanYas == 18) {
			System.out.println("we can have inter with you after that you can have a" +
								calisan.getSalary()+ " salary");
		}
		
		
	}

}
