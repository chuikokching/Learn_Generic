package uni.due.collection.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*集合排序*/
public class Intsortieren {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(22);
        list.add(3);
        list.add(1);
        list.add(88);

        for(int n :list)
            System.out.print(n+" ");

        System.out.println();

        //Sort() to sortieren
        Collections.sort(list);
        for(int n :list)
            System.out.print(n+" ");
    }
}
