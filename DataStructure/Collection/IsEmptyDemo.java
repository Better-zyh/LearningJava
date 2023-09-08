package DataStructure.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class IsEmptyDemo {
    public static void main(String[] args) {
        // 使用多态，创建一个ArrayList对象
        Collection<String> collection = new ArrayList<>();

        // 判断集合是否为空
        boolean isEmptyReturn1 = collection.isEmpty();
        System.out.println("集合是否为空：" + isEmptyReturn1);

        // 向集合里面添加元素
        collection.add("一号元素");
        // 判断集合是否为空
        boolean isEmptyReturn2 = collection.isEmpty();
        System.out.println("集合是否为空：" + isEmptyReturn2);
    }
}
