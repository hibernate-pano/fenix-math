package leetcode.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pano
 * 找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字。
 * 示例 1：
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 * 限制：
 * 2 <= n <= 100000
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode002 {

    /**
     * 基本操作，遍历然后存入数据判断个数
     * <p>
     * result：时间过久，失败
     */
    public int findRepeatNumber0(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.contains(num)) {
                return num;
            } else {
                list.add(num);
            }
        }
        return -1;
    }


    /**
     * 排序
     * <p>
     * result：成功
     */
    public int findRepeatNumber1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }

    /**
     * 0 ～ n-1 范围内的数，分别还原到对应的位置上，如：数字 2 交换到下标为 2 的位置。
     * 若交换过程中发现重复，则直接返回。
     */
    public int findRepeatNumber2(int[] nums) {
        int[] ints = new int[nums.length];
        for (int num : nums) {
            ints[num]++;
            if (ints[num] > 1) {
                return num;
            }
        }
        return -1;
    }
}
