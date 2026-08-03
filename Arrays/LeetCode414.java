import java.util.Arrays;
class LeetCode414{
		public static void main(String[] args){
			int [] nums = {2,1};
			int indx = thirdMax(nums);
			System.out.println(indx);
		}

	  public  static int thirdMax(int[] nums) {
        Arrays.sort(nums);
	System.out.println(Arrays.toString(nums));
        int j = 0;
        for(int i = 0 ; i<nums.length ; i++){
        if(nums[i]<=2)  j = nums[i];
        else j= nums[0];
         
        }
        return j;
    }
}

