package org.ns.compare;

import java.util.*;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        //in CompareTO method implemented ID based sorting,
        // if want to sort any other type need to change implementation
        if (id == student.getId()) {
            return 0;
        } else if (id > student.getId()) {
            return 1;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        Student student1 = new Student(203,"Naresh");
        Student student2 = new Student(202,"Sreenath");
        Student student3 = new Student(201,"Akki");
        Student student4 = new Student(207,"Pooji");

        List<Student> studentList = Arrays.asList(student1,student2,student3,student4);

        System.out.println("before sorting ::"+studentList);
        Collections.sort(studentList);
        System.out.println("after sorting ::"+studentList);


        System.out.println("Comparator implementation");
        Collections.sort(studentList,new NameComparator());
        System.out.println("after sorting by name ::"+studentList);

    }
}
