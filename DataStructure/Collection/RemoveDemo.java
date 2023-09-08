package DataStructure.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class RemoveDemo {
    public static void main(String[] args) {
        // 使用多态，创建一个ArrayList对象
        Collection<String> collection = new ArrayList<>();
        System.out.println("往集合中添加元素前的集合是：" + collection);

        // 往集合中添加元素
        collection.add("一号");
        collection.add("二号");
        collection.add("三号");
        collection.add("四号");
        System.out.println("往集合中添加元素后的集合是：" + collection);

        // 使用remove方法，把给定的对象在当前集合中册除
        // 如果要删除的元素存在该集合，那么就返回true
        // 否则返回false
        boolean removeReturn1 = collection.remove("一号");
        System.out.println("删除元素\"一号\"的返回值：" + removeReturn1);
        System.out.println("删除元素\"一号\"后的集合是：" + collection);

        boolean removeReturn2 = collection.remove("十号");
        System.out.println("删除元素\"十号\"的返回值：" + removeReturn2);
        System.out.println("删除元素\"十号\"后的集合是：" + collection);
    }
}
