package uni.due.Reflect.Entity;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodSample {

    public static void main(String[] args) {
        try {
            Class employeeClazz = Class.forName("uni.due.Reflect.Entity.Employee");

            Constructor constructor = employeeClazz.getConstructor(new Class[]{
                    Integer.class,String.class,Float.class,String.class
            });

            Employee emp = (Employee)constructor.newInstance(new Object[]{
                    100,"CKC",800f,"Spring"
            });

            Method med = employeeClazz.getMethod("updatesalary", new Class[]{
                    Float.class
            });

            Method med1 = employeeClazz.getMethod("getSalary");


            Employee emp1 =(Employee)med.invoke(emp, new Object[]{1000f});
            System.out.println(emp1);
            System.out.println(med1.invoke(emp));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
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
