package data_structures_and_algorithms.leetCode.easy;

public class SubArraySumEqualsK {

    public SubArraySumEqualsK() {
	// TODO Auto-generated constructor stub
    }

    /*
     * Returns true if the there is a subarray of arr[] with sum equal to 'sum'
     * otherwise returns false. Also, prints the result
     */
    int subArraySum(int arr[], int n, int sum) {
	/*
	 * Initialize curr_sum as value of first element and starting point as 0
	 */
	int curr_sum = arr[0], start = 0, i;

	/*
	 * Add elements one by one to curr_sum and if the curr_sum exceeds the
	 * sum, then remove starting element
	 */
	for (i = 1; i <= n; i++) {
	    // If curr_sum exceeds the sum, then remove the starting elements
	    while (curr_sum > sum && start < i - 1) {
		curr_sum = curr_sum - arr[start];
		start++;
	    }

	    // If curr_sum becomes equal to sum, then return true
	    if (curr_sum == sum) {
		System.out.println("Sum found between indexes " + start
			+ " and " + (i - 1));
		return 1;
	    }

	    // Add this element to curr_sum
	    if (i < n)
		curr_sum = curr_sum + arr[i];
	}

	// If we reach here, then no subarray
	System.out.println("No subarray found");
	return 0;
    }
}
