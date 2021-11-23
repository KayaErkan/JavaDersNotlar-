package day32_stringBuilder;

public class C03_StringBuilder03 {

	public static void main(String[] args) {
		
		// kodun çýktýsý ne olur?
		
		StringBuilder sb = new StringBuilder();
		sb.append("aaa").insert(1, "bb").insert(4, "ccc");
		System.out.println(sb);
	}

}
