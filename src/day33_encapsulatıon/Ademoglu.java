package day33_encapsulatýon;

public class Ademoglu {
	String name;
	String surName;
	private int age;// encap için veriyi private yaptýk
	
	public static void main(String[] args) {
		
	}

	public void yasAta(int age) {// obj isterse yasi set eder
		if(age < 0) {
			this.age = -age;
		}else {
			this.age = age;
		}
	}
	
	public int yasGoster(int age) {// bu method obje isterse yasini gösterir
		return this.age;
	}
}
