package com.Comparable;

public class Student implements Comparable<Student>{
    private String username;
    private int age;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public int compareTo(Student o) {
        return this.getAge()-o.getAge();
    }

}
