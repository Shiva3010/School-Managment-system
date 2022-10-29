
package school.managment.system;
/**
 * This class is resposible for keep the track of students
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    //Constructor : New student obj
    public Student(int id, String name, int grade){
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id=id;
        this.name=name;
        this.grade=grade;

    }

    //Not going to alter students name,id
    /**
     * 
     * @param grade new grade of the student
     */
    public void setGrade(int grade){
        this.grade = grade;
    }

    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    public int getFeesPaid() {
        return feesPaid;
    }
    public int getFeesTotal() {
        return feesTotal;
    }
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    public void add(Student students) {
    }
    @Override
    public String toString(){
        return "Student's : "+name+" total fees paid "+feesPaid;
    }
}
