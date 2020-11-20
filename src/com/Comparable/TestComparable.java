package com.Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;

public class TestComparable {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(18);
        Student s2 = new Student();
        s2.setAge(17);
        Student s3 = new Student();
        s3.setAge(16);
        Student s4 = new Student();
        s4.setAge(90);
        Student s5 = new Student();
        s5.setAge(78);

        List<Student> list = new ArrayList<>();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        list.sort(Student::compareTo);

        System.out.println(list);

    }
}
