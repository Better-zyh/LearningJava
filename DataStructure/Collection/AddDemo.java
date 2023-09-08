package DataStructure.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class AddDemo {
    public static void main(String[] args) {
        // 使用多态，创建一个ArrayList对象
        Collection<String> collection = new ArrayList<>();

        // 输出该集合的内容是为空的（其中它重写了toString方法）
        System.out.println("没有进行任何操作的ArrayList集合对象：" + collection);

        // 往ArrayList集合中添加元素，返回值只一个boolean值，一般不用接收这个返回值
        boolean addReturn = collection.add("LeeHua");
        System.out.println("往集合中添加一个元素后的返回值：" + addReturn);
        System.out.println("使用add方法往集合里面添加了元素后：" + collection);
    }
}
