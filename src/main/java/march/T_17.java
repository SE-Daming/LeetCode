package march;

/**
 * Str是一个由数字组成的字符串
 */

/**
 *         Integer.valueOf(int)
 *         Integer.valueOf(String)
 *         Integer.valueOf(String,int) 将String看作int进制
 */

public class T_17 {
    public static void main(String[] args) {
        String str="123456";
        int a=Integer.valueOf(str.charAt(0));
        String str2="123456";
        int b=Integer.valueOf(str2.charAt(0)-'0');
        System.out.println("a:"+a);//49
        System.out.println("b:"+b);//1
        System.out.println(Integer.valueOf("1011", 2));//11
    }
}
