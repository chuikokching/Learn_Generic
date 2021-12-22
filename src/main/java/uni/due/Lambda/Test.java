package uni.due.Lambda;

public class Test {
    public static void main(String[] args) {
        //java函数式接口,接口Mathoperation有且只有一个抽象方法
        Mathoperation divide = (a,b)-> { return a/b+0f; };
        Mathoperation plus = (a,b)-> a+b+0f;
        Mathoperation minus = (a,b)-> a-b+0f;
        Mathoperation product = (a,b)-> a*b+0f;

        System.out.println(divide.opr(15,3));
        System.out.println(plus.opr(15,3));
        System.out.println(product.opr(15,3));
        System.out.println(minus.opr(15,3));
    }
}
