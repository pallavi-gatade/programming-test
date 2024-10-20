package programming.test;

public class AddTwoString {

	public static void main(String[] args) {
	String str1 = "This is home";

	String str2 = " JAVA ";
	StringBuilder strArray = new StringBuilder();
	
	for (char ch : str1.toCharArray()) {
			strArray.append(ch);
	}
	
	strArray = strArray.replace(7, 8, str2);

		System.out.println("Merged String is : " + strArray);
	}
	
}
