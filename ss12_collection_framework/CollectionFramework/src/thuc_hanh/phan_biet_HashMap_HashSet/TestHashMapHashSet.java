package thuc_hanh.phan_biet_HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestHashMapHashSet {
    public static void main(String[] args) {
        System.out.println("Map........");
        Student student1 = new Student("Nam",20, "HN");
        Student student2 = new Student("Hung",21, "HN");
        Student student3 = new Student("Ha",22, "HN");

        Map<Integer,Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);

        for (Map.Entry<Integer, Student> studen : studentMap.entrySet()){
            System.out.println(studen.toString());
        }
        System.out.println("Set........");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        for (Student student :students
             ) {
            System.out.println(student.toString());
        }
        System.out.println("So sánh : ");
        System.out.println("HashMap cho hiển thị cả key và value, các value có thể trùng lặp");
        System.out.println("HashMap cho chỉ hiển thị value, các value trùng lặp bị đè lên ");
    }
}
