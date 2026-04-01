import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

enum STATUS{
    PRESENT, ABSENT;
}

class StudentAttendance{
    private int rollNo;
    private String name;
    private STATUS status;

    public StudentAttendance(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }


    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public STATUS getStatus() {
        return status;
    }
    public void setStatus(STATUS status) {
        this.status = status;
    }

}

class StudentDetails{
    Map<Integer, StudentAttendance> Students = new HashMap<>();

public void addStudents(StudentAttendance c){
    Students.put(c.getRollNo(), c);
}

public void showStudents(){
    for(StudentAttendance abc : Students.values()){
        System.out.println(abc.getRollNo() + " " + abc.getName() + " " + abc.getStatus());
    }
}

public void searStudentByRoll(int rollNo){
    StudentAttendance student = Students.get(rollNo);
    System.out.println("Student with specific RollNo: " + student.getRollNo() + " "+ student.getName() + " "+student.getStatus());
}

public void showPresentStudentBySortname(){
    List<StudentAttendance> presentList = new ArrayList<>();
    for(StudentAttendance s : Students.values()){
        if(s.getStatus() == STATUS.PRESENT){
            presentList.add(s);
        }
    }
    presentList.sort((a, b) -> a.getName().compareTo(b.getName()));
    System.out.println("Present Students with sorted by Name: ");
    for(StudentAttendance s : presentList){
        System.out.println(s.getRollNo() + " " + s.getName() + " " + s.getStatus());
    }
}

}


public class StudentAttends{
    public static void main(String[] args){
        StudentDetails stud = new StudentDetails();
        StudentAttendance s1 = new StudentAttendance(1, "Ashutosh Kr. Jha");
        s1.setStatus(STATUS.PRESENT);
        stud.addStudents(s1);

        StudentAttendance s2 = new StudentAttendance(2, "Bimal Sharma");
        s2.setStatus(STATUS.PRESENT);
        stud.addStudents(s2);

        StudentAttendance s3 = new StudentAttendance(3, "Baroon Jha");
        s3.setStatus(STATUS.ABSENT);
        stud.addStudents(s3);



        stud.showStudents();

        stud.searStudentByRoll(2);

        stud.showPresentStudentBySortname();
    
    }
}
