package com.qxcto.chapter8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/11/11/4:12
 * @Description: 通配符
 */
public class WildCard {
    public void test(List<?> list){//需要一个list参数，但不确定数据类型
        Iterator<?> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

    public static void main(String[] args){
        WildCard d = new WildCard();
        List<String> l1 = new ArrayList<String>();
        l1.add("rtury");
        l1.add("45terw");
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(45);
        l2.add(564);
        l2.add(3456);
        d.test(l1);
        d.test(l2);
    }

}
