package basic.c08_oop;

public class Worker {
    String name;
    int salary;

    public Worker(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public void showSalary(){
        System.out.println("Worker's name is " + name + " and his salary is " + salary + " USD.");
    }
}
