package Lesson12.ComparableComparator;
import java.util.Comparator;
public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int age1 = o1.getAge();
        int age2 = o2.getAge();
        return Integer.compare(age1,age2);
    }
//    {
//        if(o1.getAge() > o2.getAge()){
//            return 1;
//        }else if(o1.getAge() == o2.getAge()){
//            return 0;
//        }else{
//            return -1;
//        }
//    }
}
