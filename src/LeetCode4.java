import java.util.Arrays;

public class LeetCode4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            nums3[i] = nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            nums3[nums1.length+i] = nums2[i];
        }
        Arrays.sort(nums3);

        int mid = nums3.length / 2;
        if(nums3.length%2==0){
            int left = mid -1;
            return (double) (nums3[mid] + nums3[left]) / 2;
        }
        return nums3[mid];
    }

    public static void main(String[] args) {
        int a[] = new int[]{1,2};
        int b[] = new int[]{3,4};
        System.out.println(findMedianSortedArrays(a,b));
    }
}
