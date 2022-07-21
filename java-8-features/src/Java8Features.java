import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Features {
    public static void main(String[] args) {

        // 2. Find all student which belongs to same branch.
        List<Student> sameBranch = StudentDatabase.getAllStudents()
                .stream()
                .filter(student -> student.branch == "CSE")
                .collect(Collectors.toList());
        System.out.println("\nStudents in the CSE branch\n" + sameBranch);

        // 3. Fing all student whose age is less the 25.
        List<Student> ageLessThan25 = StudentDatabase.getAllStudents()
                .stream()
                .filter(student -> student.age < 25)
                .collect(Collectors.toList());
        System.out.println("\nStudents under 25\n" + ageLessThan25);

        // 4. Sort all student according to branch.
        List<Student> sortedByBranch = StudentDatabase.getAllStudents();
        Collections.sort(sortedByBranch, Comparator.comparing(Student::getBranch));
        System.out.println("\nStudents sorted by branch\n" + sortedByBranch);

        // 5. Fetch all student whose age is grater then 25 and belongs to CSE branch.
        List<Student> cseLessThan25 = StudentDatabase.getAllStudents()
                .stream()
                .filter(student -> student.branch == "CSE")
                .filter(student -> student.age < 25)
                .collect(Collectors.toList());
        System.out.println("\nStudents in the CSE branch less than 25 years old\n" + cseLessThan25);

        // 6. Find the average marks of all students.
        List<Student> averageMarks = StudentDatabase.getAllStudents();

        Integer totalMarks = 0;
        Integer average = 0;
        for(Student student : averageMarks){
            for(Integer marks : student.getMarks()){
                totalMarks += marks;
            }
        }
        average = (totalMarks/5)/averageMarks.size();

        System.out.println("\nAverage marks of students\n" + average);

        // 7. Find student whose name starts with ‘p’.
        List<Student> nameStartsWithP = StudentDatabase.getAllStudents()
                .stream()
                .filter(student -> student.name.startsWith("P"))
                .collect(Collectors.toList());
        System.out.println("\nStudents name starts with P\n" + nameStartsWithP);

        // 8. Use ForEach loop to print all student whose email is having @gmail.com.
        List<Student> emailContainsGmail = StudentDatabase.getAllStudents()
                .stream()
                .filter(student -> student.email.contains("@gmail.com"))
                .collect(Collectors.toList());
        System.out.println("\nStudents name starts with P\n" + emailContainsGmail);

        // 10. Print age of each student from DOB using java date time api.
        List<Integer> dateOfBirth = StudentDatabase.getAllStudents()
                .stream()
                .map(x -> x.getDob().until(LocalDate.now()).getYears()).collect(Collectors.toList());
        System.out.println("\nAge of Students calculated from date of birth\n" + dateOfBirth);

        // 11. WAP to check if given number is even or not using predicate
        Predicate<Integer> isEven = i -> i%2 == 0;
        System.out.println("\nIs 2 even?\n" + isEven.test(2));

        // 12. WAP to check if given List is empty of not using predicate
        Predicate<List> isEmpty = List::isEmpty;
        List<Integer> emptyList = new ArrayList<>();
        System.out.println("\nIs list empty?\n" + isEmpty.test(emptyList));

        // 13. WAP to check if number is greater than 10 and less than 20 using predicate chaining
        Predicate<Integer> greaterThan10 = i -> i > 10;
        Predicate<Integer> lesserThan20 = i -> i < 20;
        int x = 15;
        System.out.println("\nIs " + x + " greater than 10 and lesser than 20?\n" + greaterThan10.and(lesserThan20).test(x));

        // 14. Given list of strings WAP to print all the strings which starts with ‘G’ using predicate
        Predicate<String> beginsWithG = i -> i.startsWith("g");
        List<String> names = new ArrayList<>();
        names.add("hello");
        names.add("glorious");
        names.add("georgia");
        System.out.println("\nStrings beginning with G are\n" + names.stream().filter(beginsWithG).collect(Collectors.toList()));

        // 15. WAP to find the square of number using Functions of JAVA 8
        Consumer<Integer> square = (s) -> System.out.println("Square of " + s + " is " + s*s);
        square.accept(30);

        // 16. WAP to return length of string using Function Interface
        Consumer<String> stringConsumer = (s) -> System.out.println("Length of " + s + " is " + s.length());
        stringConsumer.accept("Hello world!");

        // 17. WAP to divide a number by 2 and then multiply the result with 3 using Function chaining
        List<Double> num = new ArrayList<>();
        num.add(20.0);
        num.add(30.0);
        num.add(14.0);
        Function<Double, Double> divideBy2 = i -> i/2;
        Function<Double, Double> multiplyBy3 = i -> i*3;
        Function<Double, Double> divideAndMultiply =  divideBy2.andThen(multiplyBy3);
        System.out.println("\nNumbers divided by 2 and multiplied by 3 are "+ num.stream().map(divideAndMultiply).collect(Collectors.toList()));








    }
}

