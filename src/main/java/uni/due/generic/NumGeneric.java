package uni.due.generic;

public class NumGeneric <T> {
    private T num;

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }

    //返回一个范性类的对象
    public static NumGeneric<Books> out()
    {
        return new NumGeneric<Books>();
    }

    public static void main(String[] args) {
        NumGeneric <Integer> test = new NumGeneric<Integer>();
        test.setNum(10);
        System.out.println(test.getNum());

        NumGeneric <Float> test1 = new NumGeneric<Float>();
        test1.setNum(11.f);
        System.out.println(test1.getNum());
        System.out.println(out());
    }
}
