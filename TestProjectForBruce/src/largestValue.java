import java.io.IOException;
import java.util.Scanner;

public class largestValue {

	 public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        int output = 0;
	        int ip1_size = 0;
	        ip1_size = Integer.parseInt(in.nextLine().trim());
	        int[] ip1 = new int[ip1_size];
	        int ip1_item;
	        for(int ip1_i = 0; ip1_i < ip1_size; ip1_i++) {
	            ip1_item = Integer.parseInt(in.nextLine().trim());
	            ip1[ip1_i] = ip1_item;
	        }
	        int ip2 = Integer.parseInt(in.nextLine().trim());
	        output = KLargestValue(ip1,ip2);
	        System.out.println(String.valueOf(output));
	    }
	 
	 public static int KLargestValue(int[] input1,int input2)
	    {
		    if (input2 < 1 || input1 == null) {
			return 0;
		}
	 
		return getKth(input1.length - input2 +1, input1, 0, input1.length - 1);
		    
	    }
	public static int getKth(int k, int[] nums, int start, int end) {
	 
		int pivot = nums[end];
	 
		int left = start;
		int right = end;
	 
		while (true) {
	 
			while (nums[left] < pivot && left < right) {
				left++;
			}
	 
			while (nums[right] >= pivot && right > left) {
				right--;
			}
	 
			if (left == right) {
				break;
			}
	 
			swap(nums, left, right);
		}
	 
		swap(nums, left, end);
	 
		if (k == left + 1) {
			return pivot;
		} else if (k < left + 1) {
			return getKth(k, nums, start, left - 1);
		} else {
			return getKth(k, nums, left + 1, end);
		}
	}
	 
	public static void swap(int[] nums, int n1, int n2) {
		int tmp = nums[n1];
		nums[n1] = nums[n2];
		nums[n2] = tmp;
	}
}
