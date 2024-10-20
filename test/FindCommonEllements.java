package programming.test;

public class FindCommonEllements {

	public static void main(String[] args) {

		int[] inputArr1 = { 124, 352, 387 };

		int[] inputArr2 = { 124, 264, 3, 4, 387 };

		int[] inputArr3 = { 124, 2, 3, 387, 5, 6 };

		int resultArraySize = Math.min(inputArr1.length, inputArr2.length);

		if (inputArr3.length < resultArraySize)
			resultArraySize = inputArr3.length;

		int[] ResultArray = new int[resultArraySize];

		int resultArrIndex = 0;

		for (int i = 0; i < inputArr1.length; i++) {

			for (int j = 0; j < inputArr2.length; j++) {

				if (inputArr1[i] == inputArr2[j]) {

					for (int k = 0; k < inputArr2.length; k++) {

						if (inputArr1[i] == inputArr2[k]) {

							ResultArray[resultArrIndex] = inputArr1[i];
							resultArrIndex++;
						}
					}
				}
			}

		}

		System.out.print("The Common Elements Are : ");
		for (int i = 0; i < ResultArray.length; i++) {
			if (ResultArray[i] != 0)
				System.out.print(ResultArray[i] + " ");

		}

	}

}
