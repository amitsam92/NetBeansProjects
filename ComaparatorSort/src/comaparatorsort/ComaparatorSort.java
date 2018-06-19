/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comaparatorsort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author samdarshi
 */
class Student{
    int age;
    String Name;

    public Student(int age, String Name) {
        this.age = age;
        this.Name = Name;
    }

    public int getAge() {
        return age;
    }
    
    
}

class AgeComparator implements Comparator{
    public int compare(Object o1, Object o2){
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        return s1.age-s2.age;
    }
}
public class ComaparatorSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Student> ls = new ArrayList<>();
        ls.add(new Student(45, "parun"));
        ls.add(new Student(40, "qarun"));
        ls.add(new Student(50, "rarun"));
        ls.add(new Student(55, "sarun"));
        ls.add(new Student(35, "tarun"));
        
        ls.sort(new AgeComparator());
        for(Student s: ls){
            System.out.println(s.Name);
        }
    }
    
}
