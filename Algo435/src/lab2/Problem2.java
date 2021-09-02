package lab2;

/*
 * since the input arrays are already sorted
 * Time Complexity: O(n) where n = len1 + len2
 * as the basic operations are repeated n times total through the while loops
 */

public class Problem2 {
	int[] merge(int[] arr1, int[] arr2) {
		int len1 = arr1.length;
		int len2 = arr2.length;
		int[] res = new int[len1 + len2];

		int i = 0, j = 0, k = 0;
		while (i < len1 && j < len2) {
			if (arr1[i] <= arr2[j]) {
				res[k++] = arr1[i++];
			} else {
				res[k++] = arr2[j++];
			}
		}

		// if one reached the end before the other, we need to append the remaining to
		// the resulting array
		while (i < len1) {
			res[k++] = arr1[i++];
		}
		while (j < len2) {
			res[k++] = arr2[j++];
		}

		return res;
	}

	void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 5, 8, 17 };
		int[] arr2 = { 2, 4, 8, 11, 13, 21, 23, 25 };

		Problem2 prob = new Problem2();
		prob.display(prob.merge(arr1, arr2));
	}

}
