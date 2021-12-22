package uni.due.Lambda.Stream;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
* Stream流对象5种创建方式
*
* */
public class StreamGenerator {

    //1.基于数组
    @Test
    public void generator1(){
        String arr[] = {"ckc","spring","boot","java"};
        Stream<String> stream = Stream.of(arr);
        stream.forEach(s -> System.out.println(s));
    }

    //2.基于list
    @Test
    public void generator2(){
        List<String> list = Arrays.asList("ckc","spring","boot","java","BBBB");
        Stream<String> stream= list.stream(); //list提供的stream()
        stream.forEach(s -> System.out.println(s));
    }

    //3.基于Stream.generate()创建无限长度数据流
    @Test
    public void generator3(){
        Stream<Integer> stream = Stream.generate(()->new Random().nextInt(100000));
        stream.limit(10).forEach(i-> System.out.println(i));
    }

    //4.基于迭代器
    @Test
    public void generator4(){
        Stream<Integer> stream = Stream.iterate(1,n->n+1);
        stream.limit(100).forEach(i-> System.out.println(i));
    }

    //5.基于字符序列 用于对字符进行加密,或者搭建应用底层框架,对每一个字符进行处理
    @Test
    public void generator5(){
        String str = "abcdefg";
        IntStream stream = str.chars();
        stream.forEach(c-> System.out.println((char)c));

    }

}
