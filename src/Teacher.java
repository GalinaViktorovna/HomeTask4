/**
 * Created by Галка on 07.02.2016.
 */
public class Teacher extends Person {
    private double salary;
    private String subject;


    public double getSalary() {
        if (subject == "Computer Science") return salary = 10000.00;
        if (subject == "Chemistry") return salary = 9000.00;
        if (subject == "English") return salary = 8000.00;
        else return salary = 5000.00;
    }

    public Teacher(String name,int age,String gender, String subject) {
super(name,age,gender);
        this.subject = subject;


    }

    @Override
    public String toString() {
        return super.toString() + ", subject: " + subject+ ",salary: " + getSalary() ;
    }
}
