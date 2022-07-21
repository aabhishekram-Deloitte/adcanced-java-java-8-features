# adcanced-java-java-8-features MCQ Answers

MCQ:

1. Which of the following is not introduced with Java 8?
**Ans: b) Serialization
**
2. What is the purpose of BooleanSupplier function interface? 
Ans: a) represents supplier of Boolean-valued results

3. What is the return type of lambda expression?
**Ans: d) Function
**
4. Which is the new method introduced in java 8 to iterate over a collection? 
**Ans: c) StringList.forEach()
**
5. What are the two types of Streams offered by java 8?
**Ans: a) sequential and parallel
**
6. Which feature of java 8 enables us to create a work stealing thread pool using all available processors at its target? 
**Ans: b) newWorkStealingPool
**
7. What does Files.lines(Path path) do? 
**Ans: b) It reads all the lines from a file as a Stream
**
8. What is Optional object used for?
**Ans: c) Optional is used to represent null with absent value
**
9. What is the substitute of Rhino javascript engine in Java 8? 
**Ans: a) Nashorn
**
10. What does SAM stand for in the context of Functional Interface?
**Ans: b) Single Abstract Method
**
11. Which of the following are valid lambda expressions?
**Ans: c. (int i) -> i;
**
12. Given below code snippet

interface A {

int aMethod(String s);

}

13. Which of the following are valid statements?
**Ans: d. A b = (String s) -> 1;
**
14. A lambda expression can be used...
**Ans: c. In a return statement
**
15. Which of the following are functional interfaces? (Select ALL that apply)
**Ans: 
b. java.util.function.Consumer
c. java.util.function.Supplier
d. java.util.function.Predicate
e. java.util.function.Function**

16. Choose the correct option based on this program:

import java.util.function.BiFunction;

public class StringCompare {

public static void main(String args[]) {

BiFunction < String, String, Boolean > compareString = (x, y) - >

x.equals(y);

System.out.println(compareString.apply("Java8", "Java8"));

}

}

**Ans: c. This program prints: false
**

17. Which one of the following abstract methods does not take any argument but returns a value?
**Ans: b. The get() method in java.util.function.Supplier interface
**

18. Which of the following interfaces of the Java API can be considered functional?
**Ans: a. java.util.concurrent.Callable
**

19. Which of the following are intermediate operations?

**Ans: 
a. limit
b. peek
d. skip**

20. Which of the following are terminal operations?
**Ans: c. max
**
21. Which of the following are short-circuit operations?
**Ans: d. findFirst
**

22. Which of the following are valid ways to create a LocalDate object?
**Ans: d. LocalDate.now().plusDays(5);
**

23. Which of the following are valid ChronoUnit values for LocalTime?
**Ans:
b. NANOS
d. HALF_DAYS**

24. Which one of the following classes is best suited for storing timestamp values of application events in a file?
**Ans: c. java.time.Instant class
**
