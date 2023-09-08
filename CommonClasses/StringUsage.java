package CommonClasses;

import java.util.Arrays;

public class StringUsage{
    public static void main(String[] args) {
        String z = "HelloWorld!";
        //获取字符串长度
        System.out.println(z.length());
        //获取指定索引处的字符
        System.out.println(z.charAt(4));
        //返回指定位置的字符在此字符串出现的第一次索引
        System.out.println(z.indexOf('o'));
        //返回指定位置的字符在当前字符串出现的第一次索引
        System.out.println(z.indexOf("oWo"));
        //返回指定字符在指定位置后出现的第一次索引
        System.out.println(z.indexOf("o",2));
        //返回指定字符串在指定位置后出现的第一次索引, 如果index之后没有, 返回-1
        System.out.println(z.indexOf("or",2));
        //从指定位置截取当前位置字符串
        System.out.println(z.substring(5));
        //从指定位置开始截取到指定位置结束当前位置字符串 (左闭右开区间)
        System.out.println(z.substring(2,5));

        //连接字符串
        System.out.println("我的名字是 ".concat("Runoob"));
        //更常用的是使用'+'操作符来连接字符串，如：
        System.out.println("Hello," + " runoob" + "!");

        //分割字符串 trim() 方法用于删除字符串的头尾空白符。
        String Str = "    www.runoob.com    ";
        System.out.println(Str.trim());

        //split() 方法根据匹配给定的正则表达式来拆分字符串
        String str = "Welcome-to-Runoob";
        System.out.println(Arrays.toString(str.split("-")));  //用-将字符串分隔开
        System.out.println(Arrays.toString(str.split("-", 2)));  //用-将字符串分隔开，分割成两份，分别是Welcome和to-Runoob

        //String 转化 int和别的数据类型
        String s = "88";
        int b = Integer.parseInt(s);
        System.out.println("b:"+b);
    }
}