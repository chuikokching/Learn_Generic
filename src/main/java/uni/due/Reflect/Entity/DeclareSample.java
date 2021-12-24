package uni.due.Reflect.Entity;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DeclareSample {

    //解决private作用域的问题

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

            /*
            *
            * 能获取对象中的所有成员变量的值,且按照private 和 public来区分
            *
            * */

            //获取当前类所有的成员变量
            Field[] fe = employeeClazz.getDeclaredFields();

            for(Field f: fe)
            {
                if(f.getModifiers() ==1 ) //public修饰
                {
                    Object val = f.get(emp); //获取public字段的值
                    System.out.println(f.getName() + " : "+val +" public");
                }
                else if(f.getModifiers() ==2) //private修饰
                {
                    String method = "get"+f.getName().substring(0,1).toUpperCase()+f.getName().substring(1);
                    Method med = employeeClazz.getMethod(method);
                    System.out.println(f.getName() + " : "+med.invoke(emp)+ " private");
                }
                //System.out.println(f.getName());
            }

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
