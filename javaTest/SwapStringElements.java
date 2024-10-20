package javaTest;

public class SwapStringElements {

	public static void main(String[] args) {

	String str = "Java Programming";
	
			System.out.println("Input String is : " + str);
	
			String[] slitedStr = str.split(" ");
			
			System.out.println("Output String is : " + slitedStr[1] + " " + slitedStr[0]);
		}
}
