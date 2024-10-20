package javaTest;

public class SwapTwoString {

	public static void main(String[] args) {

//  program 2 swap two strings

		String str1 = "Java is a";

		String str2 = "Programming Language";

		System.out.println("Input String is : " + str1 + " " + str2);

		str1 = str1.concat(str2);

//		str2 = str1.concat(str2);
//		str1 = str1.substring(9, 29);
//		str2 = str2.substring(0, 9);

		str2 = str1.substring(0, str1.length() - str2.length());

		str1 = str1.substring(str2.length());

		System.out.println("Output String is : " + str1 + " " + str2);


}
}
