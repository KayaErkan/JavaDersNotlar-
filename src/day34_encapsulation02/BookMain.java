package day34_encapsulation02;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		
		Book kitap = new Book();
		Scanner scan = new Scanner (System.in);
		System.out.println("Son okudugunuz kitab� giriniz");
		String kitap2 = scan.nextLine();
		kitap.setBookName("cal�kusu");
		kitap.setAuthorName(kitap2);
		System.out.println("1. kitab�m : " + kitap.getBookName() +
				" ikinci kitab�m : " + kitap.getAuthorName());
		
		

	}

}
