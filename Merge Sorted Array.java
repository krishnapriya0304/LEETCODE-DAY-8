class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,index=0;
        int[] nums3=new int[m+n];
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                nums3[index]=nums2[j];
                index++;
                j++;
            }
            else{
                nums3[index]=nums1[i];
                index++;
                i++;
            }
        }
        while(i<m){
            nums3[index]=nums1[i];
            index++;
            i++;
        }
        while(j<n){
            nums3[index]=nums2[j];
            index++;
            j++;
        }
        for(int k = 0; k < m + n; k++){
            nums1[k] = nums3[k];
        }
    }
}
