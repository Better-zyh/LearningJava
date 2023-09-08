package CommonClasses;

import java.util.Arrays;

public class ArrayUsage {
    public static void main(String[] args) {
        int[] n1 ={1,6,2,8,5,4,7,3};
        int[] n2 ={1,6,2,8,5,4,7,3};
// 1.       .equals 比较两个数组是否全等
        boolean equals = Arrays.equals(n1, n2);
        System.out.println(equals);
// 2.       对n1升序排列
        Arrays.sort(n1);
//        iter+回车键 快速输出n1
        for (int i : n1) {
            System.out.print(i);
        }
//3.        将数组n1转换为字符串
        String s = Arrays.toString(n1);
        System.out.println("\n" +s);
//4.        将数组n2中的所有元素全部转变成10
        Arrays.fill(n2,10);
        for (int i : n2) {
            System.out.print(i+",");
        }
        System.out.println();
//5.        将数组复制成一个长度为6的新数组,类型与原数组保持一致.
        int[] n11 = Arrays.copyOf(n1, 6);
        for (int i : n11) {
            System.out.print(+i);
        }
//6.        查询元素key在数组中的下标,(原数组需升序排列)
        System.out.println();
        int i = Arrays.binarySearch(n1, 6);
        System.out.println("数字6在n1数组中的下标为"+i);
    }
}
