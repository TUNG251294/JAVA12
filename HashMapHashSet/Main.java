package Lesson12.HashMapHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Tung",28,"TPHCM");
        Student s2 = new Student("Trang",26,"TPHCM");
        Student s3 = new Student("Truc",16,"DN");
        Map<Integer, Student> hashMap = new HashMap<>();
        hashMap.put(1,s1);
        hashMap.put(2,s2);
        hashMap.put(3,s3);
        for(Map.Entry<Integer, Student> student : hashMap.entrySet()){
            System.out.println(student.getValue());
        }
//        sử dụng phương thức entrySet() để duyệt các phần tử của HashMap, phương thức này trả về một đối tượng Map.Entry
//        Iterator<Integer> ite = hashMap.keySet().iterator();
//        while (ite.hasNext()){
//            System.out.println(hashMap.get(ite.next()));
//        }

        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        for (Student student: hashSet){
            System.out.println(student);
        }
//HashSet không cho phép các phần tử trùng lặp, trong khi HashMap cho phép
//HashMap không thể chứa các key trùng lặp,cho phép các giá trị null và key null

        Student[] arr = new Student[3];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        for (Student student: arr){
            System.out.println(student);
        }
    }
}
