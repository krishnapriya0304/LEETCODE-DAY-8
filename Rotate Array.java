class Solution {
    public void rotate(int[] nums, int k) {
       /*int numsLength=nums.length;
       k=k%numsLength;
       for(int i=0;i<k;i++){
        int lastDigit=nums[numsLength-1];
        for(int j=numsLength-1;j>0;j--){
            nums[j]=nums[j-1];
        }
        nums[0]=lastDigit;
       } */

        int numsLength=nums.length;
        k=k%numsLength;
        reverse(nums,0,numsLength-1);
        reverse(nums,0,k-1);
        reverse(nums,k,numsLength-1);
    }
    public void reverse(int[] nums, int left, int right) {
        while (left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
