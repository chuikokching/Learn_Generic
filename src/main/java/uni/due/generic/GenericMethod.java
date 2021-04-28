package uni.due.generic;

public class GenericMethod {

    public <T> T printout(T t)
    {
        //System.out.println(t);
        return t;
    }
    public <T extends Number> void printout1(T t)
    {
        System.out.println(t);
    }


    public static void main(String[] args) {
        GenericMethod b = new GenericMethod();
        System.out.println(b.printout(new Integer(100)));
        new GenericMethod().printout1(new Float(100.23));
        //new GenericMethod().printout(new String("hello world"));

    }
}
