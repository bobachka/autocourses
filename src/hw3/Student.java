package hw3;
import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("Harry", "Potter", "31-07-1980", 2);
        Student student2 = new Student("Hermiona", "Granger", "19-09-1979", 2);
        Student student3 = new Student("Draco", "Malfoy", "05-06-1980", 2);
        Student student4 = new Student("Ginny", "Weasley", "11-09-1981", 1);
        Student student5 = new Student("Fred", "Weasley", "05-06-1978", 4);
        Student student6 = new Student("George", "Weasley", "05-06-1978", 4);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        printStudents(students, 4);

    }

    private String name;
    private String surname;
    private String dateOfBirth;
    private int course;

    public Student(String name, String surname, String dateOfBirthday, int course) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirthday;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents(ArrayList<Student> students, int course) {
        for (Student s : students) {
            if (s.course == course) {
                System.out.println(s.name);
            }
        }
    }
}