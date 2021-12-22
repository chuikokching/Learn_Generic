package uni.due.Collection.List;

import java.util.ArrayList;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Notice n1 = new Notice(1,"Spring","admin", new Date());
        Notice n2 = new Notice(2,"Boot","teacher", new Date());
        Notice n3 = new Notice(3,"Java","student", new Date());

        ArrayList<Notice> list =new  ArrayList<Notice>();
        list.add(n1);
        list.add(n2);
        list.add(n3);

        for(Notice n : list)
        {
            System.out.println(n.getId()+" "+n.getCreatetime());
        }
    }
}
