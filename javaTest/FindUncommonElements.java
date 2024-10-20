package javaTest;

public class FindUncommonElements {

	public static void main(String[] args) {
		int[] inputArr1 = { 20, 40, 30, 10, 50 };
		int[] inputArr2 = { 10, 60, 30, 40, 70 };

		int resultArraySize = Math.max(inputArr1.length, inputArr2.length);

		int[] ResultArray = new int[resultArraySize];

		int resultArrIndex = 0;

		for (int i = 0; i < inputArr1.length; i++) {

			for (int j = 0; j < inputArr2.length; j++) {

				if (inputArr1[i] != inputArr2[j]) {

							ResultArray[resultArrIndex] = inputArr1[i];
							resultArrIndex++;

				}
			}

		}

		System.out.print("The Uncommon Elements Are : ");
		for (int i = 0; i < ResultArray.length; i++) {
			if (ResultArray[i] != 0)
				System.out.print(ResultArray[i] + " ");

		}

	}

}
