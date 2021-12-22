package uni.due.Collection.Sort.Comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Cat> {

    public int compare(Cat o1, Cat o2) {
        int age1=o1.getMonth();
        int age2=o2.getMonth();
        return age2-age1; //降序
    }
}
