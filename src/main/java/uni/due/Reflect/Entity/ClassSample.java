package uni.due.Reflect.Entity;

public class ClassSample {

    public static void main(String[] args) {
        try {
            //Class.forName()方法将指定的类加载到jvm,并返回对应Class对象
            Class employeeClazz = Class.forName("uni.due.Reflect.Entity.Employee");
            System.out.println("class已经加载到jvm");

            Employee emp = (Employee)employeeClazz.newInstance(); //newInstance()返回Object
            System.out.println(emp);
        } catch (ClassNotFoundException e) { //类不存在
            e.printStackTrace();
        } catch (IllegalAccessException e) { //访问作用域
            e.printStackTrace();
        } catch (InstantiationException e) { //实例化异常,比如abstract class
            e.printStackTrace();
        }
    }
}
