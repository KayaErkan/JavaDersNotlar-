package day33_encapsulat�on;

public class Ademoglu {
	String name;
	String surName;
	private int age;// encap i�in veriyi private yapt�k
	
	public static void main(String[] args) {
		
	}

	public void yasAta(int age) {// obj isterse yasi set eder
		if(age < 0) {
			this.age = -age;
		}else {
			this.age = age;
		}
	}
	
	public int yasGoster(int age) {// bu method obje isterse yasini g�sterir
		return this.age;
	}
}
