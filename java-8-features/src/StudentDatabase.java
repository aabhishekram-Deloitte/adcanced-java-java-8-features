import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class StudentDatabase {
    public static List<Student> getAllStudents() {
//        Student student =
        List<Student> students = Arrays.asList(
                new Student(1, "A", "a@gmail.com", LocalDate.parse("2001-02-12"), "CSE", Arrays.asList(10, 20, 30, 40, 50), 27),
                new Student(2, "B", "b@yahoo.com", LocalDate.parse("2001-01-12"),"ISE", Arrays.asList(10, 20, 30, 40, 50), 28),
                new Student(3, "C", "c@gmail.com", LocalDate.parse("2001-06-12"),"CSE", Arrays.asList(10, 20, 30, 40, 50), 20),
                new Student(4, "D", "d@yahoo.com", LocalDate.parse("2001-05-12"),"ECE", Arrays.asList(10, 20, 30, 40, 50), 22),
                new Student(5, "P", "P@gmail.com", LocalDate.parse("2001-02-11"),"CSE", Arrays.asList(10, 20, 30, 40, 50), 23)
        );
        return students;
    }
}
