package string;
/*
 *字符串常量池是JVM在堆内存中专门为了字符串提供的一段空间，用于缓存所有字面量形式
 * 创建字符串对象，当再次使用相同字面量穿件字符串时会直接重用常量池中的对象而不会再次创建新对象
 * 减少内存开心
 */

public class StringDemo {
    public static void main(String[]args) {
        String s1 = "123abc";
        System.out.println("s1:" + s1);
        String s2 = "123abc";
        System.out.println("s2:" + s2);
        System.out.println(s1 == s2);//s==s2为true，说明地址一样，使用同一个对象


    }
}

