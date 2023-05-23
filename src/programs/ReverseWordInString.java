package programs;

public class ReverseWordInString {
	public static void main(String[] args) {
		String str1 = "Tran Quang Huy";
		StringBuilder sb = new StringBuilder(str1);
		sb.reverse();
		String reversedStr = sb.toString();
		System.out.println("String after reverse: " +reversedStr);
		//narT gnauQ yuH
	}
}
