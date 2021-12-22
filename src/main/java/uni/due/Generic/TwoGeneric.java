package uni.due.Generic;

public class TwoGeneric<T,X> {

    private T num1;
    private X num2;

    public void getNum(T t1,X x2)
    {
        this.num1=t1;
        this.num2=x2;
    }

    public T getNum1() {
        return num1;
    }

    public X getNum2() {
        return num2;
    }

    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public void setNum2(X num2) {
        this.num2 = num2;
    }

    public static void main(String[] args) {
        TwoGeneric<Integer,Float> test = new TwoGeneric<Integer,Float>();
        test.getNum(20,23.f);

        System.out.println(test.getNum1()+" "+test.getNum2());
    }
}
