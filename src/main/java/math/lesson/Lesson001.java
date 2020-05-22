package math.lesson;

/**
 * 课后习题
 * 如果不使用 Java 语言自带的 BigInteger 类，我们还有什么方法来实现十进制到二进制的转换呢？（提示：可以使用二进制的移位和按位逻辑操作来实现。）
 * <p>
 * 思路：
 * 1. 位移法：decimal&1 判断最后一位是0还是1，然后>>1，依次对比最后reverse
 * 2. 取余法：decimal%2 取余数为最后一位，然后>>1，依次取余最后reverse
 *
 * @author pano
 */
public class Lesson001 {

    /**
     * 1. 位移法：decimal&1 判断最后一位是0还是1，然后>>1，依次对比最后reverse
     */
    public String decimalToBinary01(int decimal) {
        StringBuilder stringBuilder = new StringBuilder();
        while (decimal != 0) {
            stringBuilder.append(decimal & 1);
            decimal = decimal >> 1;
        }
        return stringBuilder.reverse().toString();
    }

    /**
     * 2. 取余法：decimal%2 取余数为最后一位，然后>>1，依次取余最后reverse
     */
    public String decimalToBinary02(int decimal) {
        StringBuilder stringBuilder = new StringBuilder();
        while (decimal != 0) {
            stringBuilder.append(decimal % 2);
            decimal = decimal >> 1;
        }
        return stringBuilder.reverse().toString();
    }

    //TODO 以上解法尚未考虑十进制数为负数情况
}
