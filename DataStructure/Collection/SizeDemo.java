package DataStructure.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class SizeDemo {
    public static void main(String[] args) {
        // 使用多态，创建一个ArrayList对象
        Collection<String> collection = new ArrayList<>();

        // 使用size方法，查看集合中的元素个数
        int collectionSize1 = collection.size();
        System.out.println("collectionSize1 = " + collectionSize1);

        // 往集合中添加元素
        collection.add("一号元素");
        collection.add("二号元素");
        collection.add("三号元素");
        collection.add("四号元素");
        collection.add("五号元素");

        // 使用size方法，再次查看集合中的元素个数
        int collectionSize2 = collection.size();
        System.out.println("collectionSize2 = " + collectionSize2);
    }
}
