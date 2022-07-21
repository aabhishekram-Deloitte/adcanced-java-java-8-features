import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

    // 1. Create a class Student with following fields: id , name ,email, DOB,, branch , marks as array include 5 subjets.
public class Student {
    int id;
    String name;
    String email;
    LocalDate dob;
    String branch;
    List<Integer> marks;
    int age;

    public Student(int id, String name, String email,
                   LocalDate dob,
                   String branch, List<Integer> marks, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.branch = branch;
        this.marks = marks;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", branch='" + branch + '\'' +
                ", marks=" + marks +
                ", age=" + age +
                "}\n";
    }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public LocalDate getDob() {
            return dob;
        }

        public String getBranch() {
            return branch;
        }

        public List<Integer> getMarks() {
            return marks;
        }

        public int getAge() {
            return age;
        }
    }

