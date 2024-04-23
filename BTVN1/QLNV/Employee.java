package OOP.BTVN1.QLNV;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private int code;
    private int salaryRate;

    public Employee(){}

    public Employee(int id, String name, int age, String department, int code, int salaryRate){
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salaryRate = salaryRate;
    }
    //get và set
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }

    public int getCode(){
        return code;
    }
    public void setCode(int code){
        this.code = code;
    }

    public double getSalaryRate(){
        return salaryRate;
    }
    public void setSalaryRate(int salaryRate){
        this.salaryRate = salaryRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", code='" + code + '\'' +
                ", salaryRate=" + salaryRate +
                '}';
    }
}
