package leetcode.lesson;

import java.util.Objects;

/**
 * 9. 回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 思路：
 * 1. 快慢指针
 *
 * @author pano
 */
public class LeetCode009 {

    public static void main(String[] args) {


    }

    boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String rev = new StringBuffer().append(s).reverse().toString();
        return Objects.equals(s, rev);
    }

    boolean isPalindrome1(int x) {
        if (x < 0) {
            return false;
        }
        String s = String.valueOf(x);
        String rev = new StringBuffer().append(s).reverse().toString();
        return Objects.equals(s, rev);
    }

    /**
     * 不用字符串
     */

    boolean isPalindrome2(int x) {
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) return false;
        int reverseNumber = 0;
        while (reverseNumber < x) {
            reverseNumber = reverseNumber * 10 + x % 10;
            x /= 10;
        }
        return x == reverseNumber || reverseNumber / 10 == x;
    }


}
