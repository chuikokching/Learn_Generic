package uni.due.collection.Sort.Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Cat>
{
    public int compare(Cat o1, Cat o2) {
        //名字升序排序
        String n1 = o1.getName();
        String n2 = o2.getName();
        int nb =n1.compareTo(n2); //n1<n2 返回负数 升序
        int nt =n2.compareTo(n1); //n2>n1 返回正数 降序
        return nt;
    }
}
