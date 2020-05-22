package math.lesson;

/**
 * ����Ա����ѧ��001.������
 * �����ʹ�� Java �����Դ��� BigInteger �࣬���ǻ���ʲô������ʵ��ʮ���Ƶ������Ƶ�ת���أ�����ʾ������ʹ�ö����Ƶ���λ�Ͱ�λ�߼�������ʵ�֡���
 * <p>
 * ˼·��
 * 1. λ�Ʒ���decimal&1 �ж����һλ��0����1��Ȼ��>>1�����ζԱ����reverse
 * 2. ȡ�෨��decimal%2 ȡ����Ϊ���һλ��Ȼ��>>1������ȡ�����reverse
 *
 * @author pano
 */
public class Lesson001 {

    /**
     * 1. λ�Ʒ���decimal&1 �ж����һλ��0����1��Ȼ��>>1�����ζԱ����reverse
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
     * 2. ȡ�෨��decimal%2 ȡ����Ϊ���һλ��Ȼ��>>1������ȡ�����reverse
     */
    public String decimalToBinary02(int decimal) {
        StringBuilder stringBuilder = new StringBuilder();
        while (decimal != 0) {
            stringBuilder.append(decimal % 2);
            decimal = decimal >> 1;
        }
        return stringBuilder.reverse().toString();
    }
}
