package data_structures_and_algorithms.leetCode.easy;

public class FirstBadVersion {

    public int firstBadVersion(int n) {
	int low = 0;
	int high = n;
	while (low < high) {
	    int mid = low + (high - low) / 2;
	    if (isBadVersion(mid))
		high = mid;
	    else
		low = mid + 1;

	}
	return low;
    }
    /**
     * API Given
     * @param m
     * @return
     */
    public boolean isBadVersion(int m){
	return true;
    }

}
