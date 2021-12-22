package uni.due.Collection.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stringsortieren {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Z");
        list.add("F");
        list.add("A");
        list.add("B");
        list.add("T");

        for(String n :list)
            System.out.print(n+" ");

        System.out.println();

        //Sort() to sortieren
        Collections.sort(list);
        for(String n :list)
            System.out.print(n+" ");

    }
}
