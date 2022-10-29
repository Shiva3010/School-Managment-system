package school.managment.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Ravi = new Teacher(1, "Ravi", 500);
        Teacher Shiva = new Teacher(2, "Shiva", 600);
        Teacher Bharat = new Teacher(3, "Bharat", 700);
        Teacher Vishnu = new Teacher(4, "Vishnu", 800);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Ravi);
        teacherList.add(Shiva);
        teacherList.add(Bharat);
        teacherList.add(Vishnu);
        
        Student Aman = new Student(1, "Aman", 12);
        Student Shivkumar = new Student(2, "Shivkumar", 10);
        Student Akash = new Student(3, "Akash", 11);
        Student lily = new Student(4, "lily", 9);
        List <Student> studnetList = new ArrayList<>();
        studnetList.add(Aman);
        studnetList.add(Shivkumar);
        studnetList.add(Akash);
        studnetList.add(lily);

        School ghs = new School(teacherList,studnetList);
        Teacher Vikram = new Teacher(10, "Bharat", 15000);

        Aman.payFees(5000);
        Shivkumar.payFees(10000);
        System.out.println("GHS has earned "+ghs.getTotalMoneyEarned());

        System.out.println("----Making GHS pay salary----");
        Shiva.receiveSalary(Shiva.getSalary());
        System.out.println("GHS has spend for salary to "+Shiva.getName()+" and now has "+ghs.getTotalMoneyEarned());
        System.out.println(Shivkumar);
        Ravi.receiveSalary(Ravi.getSalary());
        System.out.println(Ravi);
    }
}
