package uni.due.Reflect.Entity;

public class Employee {
    //静态化来完成类的初始化
    static {
        System.out.println("Static: employee已经被加载到jvm!");
    }


    private Integer eno;
    public String ename;
    private Float salary;
    private String dname;

    public Employee(Integer eno, String ename, Float salary, String dname) {
        this.eno = eno;
        this.ename = ename;
        this.salary = salary;
        this.dname = dname;
    }

    public Employee(){
        System.out.println("Employee Constructor is running!!!");
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Employee updatesalary(Float m)
    {
        this.salary=this.salary+m;
        System.out.println(this.salary+" euros!");
        return this;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                ", dname='" + dname + '\'' +
                '}';
    }
}
