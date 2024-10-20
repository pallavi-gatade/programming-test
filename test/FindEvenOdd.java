package programming.test;

public class FindEvenOdd {

	// array 1-10. print odd and even arrays from the given array

	public static void main(String[] args) {

		int[] inputArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int[] evenArr = new int[inputArr.length];

		int[] oddArr = new int[inputArr.length];

		int evenArrIndex = 0;

		int oddArrIndex = 0;

		for (int i = 0; i < inputArr.length; i++) {

			if (inputArr[i] % 2 == 0) {

				evenArr[evenArrIndex] = inputArr[i];
				evenArrIndex++;
			} else {
				oddArr[oddArrIndex] = inputArr[i];
				oddArrIndex++;
			}
		}
		System.out.println("Even Array - ");
		for (int i = 0; i < evenArrIndex; i++) {

			System.out.print(evenArr[i]);
			if (i < evenArrIndex - 1)
				System.out.print(",");
		}
		System.out.println();
		System.out.println("Odd Array - ");
		for (int i = 0; i < oddArrIndex; i++) {

			System.out.print(oddArr[i]);
			if (i < oddArrIndex - 1)
				System.out.print(",");
		}
	}
}
