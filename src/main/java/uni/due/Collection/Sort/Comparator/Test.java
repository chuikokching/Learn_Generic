package uni.due.Collection.Sort.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* Alternative:
*
* Collection.sort(list, (a,b) -> a.compareTo(b));
*
* */

public class Test {
    public static void main(String[] args) {
        //名字升序排序
        Cat c1 = new Cat("TTT",3,"long");
        Cat c2 = new Cat("ZZZ",2,"short");
        Cat c3 = new Cat("BBB",4,"int");

        List<Cat> list = new ArrayList<Cat>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        for(Cat c :list)
            System.out.print(c);

        System.out.println();

        Collections.sort(list,new NameComparator());

        for(Cat c :list)
            System.out.print(c);

        System.out.println();

        Collections.sort(list,new AgeComparator());

        for(Cat c :list)
            System.out.print(c);

    }
}
