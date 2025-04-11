class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;        // Pointer at end of nums1's actual elements
        int j = n - 1;        // Pointer at end of nums2
        int k = m + n - 1;    // Pointer at end of nums1's total capacity

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If nums2 still has remaining elements
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

    }
}
