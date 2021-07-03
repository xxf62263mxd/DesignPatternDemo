package iterator;

import java.util.Iterator;

/**
 *
 * 迭代器模式
 *
 * 用于遍历集合，定义迭代器接口可以实现多种遍历方式的迭代器
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        list.add("H");
        list.add("e");
        list.add("l");
        list.add("l");
        list.add("o");


        for(String elem :list){
            System.out.println(elem);
        }
    }
}
