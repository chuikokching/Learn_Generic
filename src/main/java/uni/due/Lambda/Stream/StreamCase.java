package uni.due.Lambda.Stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCase {
    //提取集合中所有偶数并求和
    @Test
    public void case1(){
        List<String> list =Arrays.asList("1","2","3","4","5");
        int sum = list.stream() //获取stream对象
                      .mapToInt(s->Integer.parseInt(s)) //String to Int
                      .filter(n->n%2==0)  //过滤
                      .sum();   //求和
        System.out.println(sum);

    }

    //所有名字首字母大写
    @Test
    public void case2(){
        List<String> list =Arrays.asList("ckc","string","boot","java","mvc");
        List newlist =  list.stream()
                .map(s->s.substring(0,1).toUpperCase()+s.substring(1)) //转换
                //.forEach(s-> System.out.println(s));
                .collect(Collectors.toList());//将流中数据包装成集合list, or set
        System.out.println(newlist);
    }

    //所有偶数从大到小排序，且不许重复出现 filter()条件过滤
    @Test
    public void case3(){
        List<Integer> list = Arrays.asList(1,60,33,25,88,60,4,5,88,22,44,33,88);
        List newlist = list.stream().distinct().filter(n-> n%2==0).sorted((a,b)-> b-a).collect(Collectors.toList());
        System.out.println(newlist);
    }

    //取余,去重,小到大 map()对数据进行操作修改
    @Test
    public void case4(){
        List<Integer> list = Arrays.asList(1,60,33,25,88,60,4,5,88,22,44,33,88);
        List newlist = list.stream().distinct().map(n->n%10).sorted((a,b)->a-b).collect(Collectors.toList());
        System.out.println(newlist);
    }

}
