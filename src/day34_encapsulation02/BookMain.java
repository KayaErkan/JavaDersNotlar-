package day34_encapsulation02;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		
		Book kitap = new Book();
		Scanner scan = new Scanner (System.in);
		System.out.println("Son okudugunuz kitabý giriniz");
		String kitap2 = scan.nextLine();
		kitap.setBookName("calýkusu");
		kitap.setAuthorName(kitap2);
		System.out.println("1. kitabým : " + kitap.getBookName() +
				" ikinci kitabým : " + kitap.getAuthorName());
		
		

	}

}
