package uni.due.Collection.Sort.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Goods g1=new Goods(1,"Spring",3000.0);
        Goods g2=new Goods(2,"Boot",5000.0);
        Goods g3=new Goods(3,"Alice",2000.0);

        List<Goods> goodslist = new ArrayList<Goods>();
        goodslist.add(g1);
        goodslist.add(g2);
        goodslist.add(g3);

        for(Goods c :goodslist)
            System.out.print(c);

        System.out.println();

        //相比Comparator不需要传入比较器对象,只需要实现compareTo(T o)方法
        Collections.sort(goodslist);

        for(Goods c :goodslist)
            System.out.print(c);

        System.out.println();

    }
}
