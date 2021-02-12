package ru.geekbrains.lessons;

public class Employee {
    public String name;
    public static int age;
    public String email;
    public String telephoneNumber;
    public String salary;
    public String post;
    public static Employee[] employeeArray = new Employee[5];

    public Employee(String name, Integer age, String email, String telephoneNumber, String salary, String post) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
        this.post = post;
    }

    public static void main(String[] args) {
        personMassive();
    }

    private static void personMassive() {
        employeeArray[0] = new Employee("Antonio ", 18, " Antonio@gmail.com " ,
                "8(800) 535-35-35 ", "2000$ ", "waiter");
        employeeArray[1] = new Employee("Garry ", 20," Garry@mail.ru ",
                "8(800) 535-35-35 ", "2000$ ", "waiter");
        employeeArray[2] = new Employee("Arthur ", 22, " Thomas@gmail.com ",
                "8(800) 535-35-35 ", "2000$ ", "Clown");
        employeeArray[3] = new Employee("Billy ", 45, " Billy@gmail.com",
                "8(800) 535-35-35 ", "2000$ ", "Butcher");
        employeeArray[4] = new Employee("Thomas ", 48, " Thomas@gmail.com ",
                "8(800) 535-35-35 ", "2000$ ", "deputy director");

        for (int i = 0; i < 5; i++) {
            if (age > 40) {
                System.out.println(employeeArray[i].name + employeeArray[i].email + employeeArray[i].telephoneNumber
                        + employeeArray[i].salary + employeeArray[i].post);
            }
        }
    }
}
