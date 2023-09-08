package DataStructure.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class ClearDemo {
    public static void main(String[] args) {
        // 使用多态，创建一个ArrayList对象
        Collection<String> collection = new ArrayList<>();

        // 往集合中添加元素
        collection.add("一号元素");
        collection.add("二号元素");
        collection.add("三号元素");
        collection.add("四号元素");
        collection.add("五号元素");
        System.out.println("清空集合元素之前：" + collection);

        // 使用clear方法，清空集合中的所用元素
        collection.clear();
        System.out.println("清空集合元素之后：" + collection);
    }
}
