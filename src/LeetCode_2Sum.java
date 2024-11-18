public class LeetCode_2Sum {
    /*
    Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
     */

    /*
    for this we need an input array with numbers.
    An array to store the result or the 2 indexes of the input array.
    For loop to iterate
     */
    public static void main(String[] args) {

        int[] nums = {2,4,7};
        int target = 11;
        twoSum(nums, target);
    }
        public static int[] twoSum ( int[] nums, int target){
            //int sumArr[] = new int[2];

            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (i != j && nums[i] + nums[j] == target) {
                        int a[] = { i, j };

                        System.out.println("the two sums are : "+a[0]+ "," +a[1]);
                        return a;
                    }
                }
            }
            return null;


        }
    }
