package school.managment.system;
import java.util.List;
public class School {
    
    private List <Teacher> teachers;
    private List <Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpend;

    public School(List <Teacher> teachers, List<Student> students){
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned =0;
        totalMoneySpend  =0;
    }
    
    public List<Teacher> getTeachers(){
        return teachers;
    }
    public void addTeachers(Teacher teacher){
        teachers.add(teacher);
    }
    public List<Student> getStudent(){
        return students;
    }
    public void addStudent(Student students){
        students.add(students);
    }
    public int getTotalMoneyEarned(){
        return totalMoneyEarned;
    }
    public static void updateTotalMoneyEarned(int MoneyEarned){
        totalMoneyEarned += MoneyEarned;
    }
    public int getTotalMoneySpent(){
        return totalMoneySpend;
    }
    public static void updateTotalMoneySpent(int moneySpent){
        totalMoneyEarned -= moneySpent;
    }
}
