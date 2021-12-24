package uni.due.Reflect.Entity;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorSample {

    public static void main(String[] args) {

        try {
            Class employeeClazz = Class.forName("uni.due.Reflect.Entity.Employee");

            Constructor constructor = employeeClazz.getConstructor(new Class[]{
                    Integer.class,String.class,Float.class,String.class
            });

            Employee emp = (Employee)constructor.newInstance(new Object[]{
                    100,"CKC",800f,"Spring"
            });
            System.out.println(emp);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) { //参数个数和已有的Constructor对不上
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
