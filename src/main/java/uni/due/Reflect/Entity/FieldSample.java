package uni.due.Reflect.Entity;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class FieldSample {
    public static void main(String[] args) {
        Class employeeClazz = null;
        try {
            employeeClazz = Class.forName("uni.due.Reflect.Entity.Employee");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Constructor constructor = employeeClazz.getConstructor(new Class[]{
                    Integer.class,String.class,Float.class,String.class
            });


            Employee emp = (Employee)constructor.newInstance(new Object[]{
                    100,"Chuikokching",800f,"Spring"
            });


            Field fe = employeeClazz.getField("ename"); //只能获取public的成员变量的值

            System.out.println((String)fe.get(emp));
            fe.set(emp,"CKC");
            System.out.println((String)fe.get(emp));

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) { //只能获取public的成员变量的值 获取private要使用declare
            e.printStackTrace();
        }
    }
}
