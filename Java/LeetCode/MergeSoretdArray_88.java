class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1EndI = m-1;
        int num2EndI = n-1;
        int arrEndI = m+n-1;

        while (num2EndI >= 0) {
            if (num1EndI >= 0 && nums1[num1EndI] > nums2[num2EndI]){
                nums1[arrEndI] = nums1[num1EndI];
                num1EndI--;
            }else{
                nums1[arrEndI] = nums2[num2EndI];
                num2EndI--;
            }
            arrEndI --;
        }
        
    }
}