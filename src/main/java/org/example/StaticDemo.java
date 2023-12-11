package org.example;

public class StaticDemo {
    public static void main(String[] args) {
        Student john = new Student("John", 25, "25East");
        Student john1 = new Student("John", 25, "25East");

        Student john2 = new Student("John", 25, "25East");

        Student john3 = new Student("John", 25, "25East");

        System.out.println(john.getName());
        System.out.println(john.getAge());
        System.out.println(john.getAddress());
        System.out.println(Student.college);
    }
}
