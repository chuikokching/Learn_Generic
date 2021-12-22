package uni.due.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


/*函数式编程理念是将代码作为可重用数据代入到程序运行中*/

/*
* Predict接口使用
*
* 用于条件判断,固定返回boolean
*
* */
public class PredictSample {

    public static void filter(List<Integer> list,Predicate<Integer> predicate)
    {
        for(Integer c : list)
        {
            if(predicate.test(c))
                System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void filter_string(List<String> list,Predicate<String> predicate)
    {
        for(String c : list)
        {
            if(predicate.test(c))
                System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Ctrl+左击可查看Predicate源码,当中有test()方法的实现源码
        //判断输入是否符合条件
        Predicate<Integer> predicate = n->n>5;
        System.out.println(predicate.test(10));

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //表达式作为参数传递
        filter(list, n->n%2==0);
        filter(list, n->n%2==1);
        filter(list, n->n%2==0&&n>5);


        List<String> list_string = Arrays.asList("java","spring","boot","php");
        filter_string(list_string, n->n.contains("a"));

    }
}
