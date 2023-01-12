package classProblemByAmolMateSir.Day16And17DataStructureAndAlgorithmPracticeProble;

import java.util.*;

public class Que3InsertionSort  {
    private static List<Student> getList() {  // list of the student and there name
        return Arrays.asList(
                new Student(1, "manyur"),
                new Student(2, "rahil"),
                new Student(3, "rekha"),
                new Student(4, "anmaol")

        );
    }

    public static void main(String[] args) {

        List<Student> myStudent = getList();  //method called by using static
      //  Collections.sort(myStudent);
        Collections.sort(myStudent,new ComapreByRoleNUme());
        Iterator<Student> iterator = myStudent.iterator();     //iterator  using interface
        while (iterator.hasNext()) {
            Student next = iterator.next();
            System.out.println(next);
        }

       /* ArrayList<String> myList = new ArrayList<>();
        myList.add("manisha");
        myList.add("sai");
        myList.add("amol");
        myList.add("hambiraj");
        Collections.sort(myList); //sortMethod is use to sort name in the given String ArrayList
        System.out.println(myList);*/


    }
}

class ComapreByRoleNUme implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getRollNum() - o2.getRollNum();
    }
}
class Student implements Comparable <Student> {  //using comarable interface
    int rollNum;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                '}';
    }

    public int getRollNum() {
        return rollNum;
    }

    public String getName() {
        return name;
    }

    public Student(int rollNum, String name) {
        this.rollNum = rollNum;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}