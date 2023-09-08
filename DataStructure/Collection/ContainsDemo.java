package DataStructure.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class ContainsDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        // 往集合中添加元素
        collection.add("对象1");
        collection.add("对象2");
        collection.add("对象3");
        collection.add("对象4");
        System.out.println("集合：" + collection);

        // 使用contains方法，判断当前集合中是否包合给定的对象
        // 如果包合给定的对象，那么就返回true
        // 否则返回false
        boolean containsReturn1 = collection.contains("对象100");
        System.out.println("是否包含\"对象100\"：" + containsReturn1);

        boolean containsReturn2 = collection.contains("对象1");
        System.out.println("是否包含\"对象1\"：" + containsReturn2);
    }
}
