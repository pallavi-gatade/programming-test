package programming.test;

public class PrintEvenOddInteger {

	public static void main(String[] args) {
	int[] inputArray = {1, 2, 3 , 4, 5, 6, 7, 8, 9, 10};

	int input = inputArray.length;
	int[] evenArray = new int[input];
	int[] oddArray = new int[input];

	int even = 0;
	int odd = 0;
	for (int i = 0; i < inputArray.length; i++)

	{
		if (inputArray[i] % 2 == 0) {
			evenArray[even++] = inputArray[i];
         }
			else {
				oddArray[odd++] = inputArray[i];
			}
	}
	
	System.out.print("Even Numbers :");
	for (int i = 0; i < even; i++) {
		System.out.print(evenArray[i] + " ");
	}
	System.out.println(" ");
	System.out.print("Odd Numbers :");
	for (int i = 0; i < odd; i++) {
		System.out.print(oddArray[i] + " ");
	}

}
}
