package org.example;

public class Student {
    String name;
    int age;
    String address;
    static String college = "XYZ";

    static int count = 0;

static{
    System.out.println("static block");
}
    public Student(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public void setAge(int age){
//        this.age = age;
//    }
//
//    public void setAddress(String address){
//        this.address=address;
//    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
public String getAddress(){
        return  address;
}

public String toString(){
        return("Student name is " + this.getName()+"age is"+this.getAge()+"Address is"+this.getAddress());

}

//static void studentCount(){
//        count = count+1;
//}
//
//int getCount(){
//        return count;
//}
public static void main(String[]args){
        Student john = new Student("abc",1,"Afsdf");
        System.out.println(john.toString());
   System.out.println(john.getAge());
    System.out.println(john.getAddress());
        System.out.println(john.toString());
}
}

