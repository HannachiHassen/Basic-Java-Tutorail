package practice_Java_2;

public final class UperLower {

	public static void main(String[] args) {
		String s = "Wlcome To AutomatioN";
		String Lower="";
		String Upper="";
		int lower = 0;
		int upper = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 65 && ch <= 90) {
				upper++;
				Upper=Upper+ch;
			} else {
				Lower=Lower+ch;
				lower++;
			}
		}
		System.out.println("Lower case: "+lower);
		System.out.println(Lower);
		System.out.println("Upper case: "+upper);
		System.out.println(Upper);
	}
}
