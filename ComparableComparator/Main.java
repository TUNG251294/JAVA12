package Lesson12.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student("Tung", 28, "TPHCM");
        Student s2 = new Student("Trang", 26, "TPHCM");
        Student s3 = new Student("Truc", 16,"DN");
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        Collections.sort(studentList);
        for (Student s: studentList){
            System.out.println(s);
        }

        AgeComparator ageCom = new AgeComparator();
        Collections.sort(studentList,ageCom);
        for (Student s: studentList){
            System.out.println(s);
        }
    }
}

