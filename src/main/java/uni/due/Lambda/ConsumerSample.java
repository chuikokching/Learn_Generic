package uni.due.Lambda;

import java.util.function.Consumer;

/*
* Consumer接口使用
*
* 适用于接收一个参数且不需要返回值的场景
*
* */
public class ConsumerSample {

    public static void output(Consumer<String> consumer)
    {
        String text="Hello World!!!";
        consumer.accept(text); //accept()代表具体的处理逻辑,及传递的表达式
    }

    public static void main(String[] args) {

        output(s-> System.out.println(s));

    }
}
