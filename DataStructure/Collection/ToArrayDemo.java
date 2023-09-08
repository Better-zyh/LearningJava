package DataStructure.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class ToArrayDemo {
    public static void main(String[] args) {
        // 使用多态，创建一个ArrayList对象
        Collection<String> collection = new ArrayList<>();

        // 往集合中添加元素
        collection.add("一号元素");
        collection.add("二号元素");
        collection.add("三号元素");
        collection.add("四号元素");
        collection.add("五号元素");

        // 使用toArray方法，把集合中的元素，存储到数组中。
        Object[] collectionToArray = collection.toArray();

        // 遍历输出
        for (Object o : collectionToArray) {
            System.out.println(o);
        }
    }
}
