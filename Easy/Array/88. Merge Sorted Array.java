class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int res[]= new int[m+n];
        while(i < m && j < n){
            // int v1= nums1[i], v2= nums2[j];
            if(nums1[i] <= nums2[j]){
                res[k] = nums1[i];
                // nums1[k] = nums1[i];
                i++;
                k++;
            }else{
                res[k] = nums2[j];
                // nums1[k] = nums2[j];
                j++;
                k++;
            }
        }
       while(i < m){
           res[k]= nums1[i];
           i++;
           k++;
       }
       while(j < n){
           res[k]= nums2[j];
           j++;
           k++;
       }
        for(i = 0;i < nums1.length; i++){
            nums1[i] = res[i];
        }
    }
}