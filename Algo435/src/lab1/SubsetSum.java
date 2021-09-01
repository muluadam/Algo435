package lab1;

public class SubsetSum {

	/*
	 * Brute-force recursive
	 * Resources
	 * https://iq.opengenus.org/subset-sum-problem-recursive-approach/
	 * https://en.wikipedia.org/wiki/Brute-force_search
	 * https://www.geeksforgeeks.org/subset-sum-problem-dp-25/
	 * check visualization in the link above
	 * each call to the solve method results in two calls
	 * one ignoring the current element and the other considering it in the sum
	 */
	boolean subsetExistsBruteForce(int[] arr, int k){
		return solve(arr, arr.length-1, k);
	}
	
	boolean solve(int[] arr, int i, int sum) {
		if(sum == 0) return true;
		if(i < 0) return false;
		boolean includeLast = solve(arr, i-1, sum - arr[i]);
		boolean excludeLast = solve(arr, i-1, sum);
		
		return includeLast || excludeLast;
	}
	
	public static void main(String[] args) {
		int arr[] = {3, 34, 4, 12, 5, 2};
		int sum = 7;
		
		SubsetSum subsetSum = new SubsetSum();
		
		System.out.println(subsetSum.subsetExistsBruteForce(arr, sum));
	}

}
