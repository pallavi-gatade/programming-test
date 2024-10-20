package javaTest;

public class UncommonElements {

	public static void main(String[] args) {

		int arr1[] = { 10, 20, 30, 55 };

		int arr2[] = { 20, 25, 30, 40, 50 };

		int num1 = arr1.length;
		int num2 = arr2.length;

		int i = 0, j = 0, k = 0;

		System.out.print("The Uncommon Elements are : ");
		while (i < num1 && j < num2) {

			if (arr1[i] < arr2[j]) {

				System.out.print(arr1[i] + " ");
				i++;
				k++;

			} else if (arr2[j] < arr1[i]) {

				System.out.print(arr2[j] + " ");
				k++;
				j++;
			}

			else {
				i++;
				j++;
			}
		}

		while (i < num1) {
			System.out.print(arr1[i] + " ");
			i++;
			k++;
		}
		while (j < num2) {
			System.out.print(arr2[j] + " ");
			j++;
			k++;
		}
	}
}

