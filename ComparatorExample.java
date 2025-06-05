import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int age;
    String name;
    int rollno;

    public Student(int age, String name, int rollno) {
        this.age = age;
        this.name = name;
        this.rollno = rollno;
    }

    public String toString() {
        return age + "      " + name + "       " + rollno;
    }

    public int compareTo(Student other) {
        return Integer.compare(this.rollno, other.rollno);
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(34, "siddhant", 101));
        list.add(new Student(13, "mohit", 102));
        list.add(new Student(53, "aryan", 103));
        list.add(new Student(16, "daksh", 104));
        list.add(new Student(15, "anshikha", 105));
        list.add(new Student(25, "shahdab", 106));

        Collections.sort(list);

        for (Student s : list) {
            System.out.println(s);
        }
    }
}
