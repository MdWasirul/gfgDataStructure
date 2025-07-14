package com.sandip;

public class oops {

    public static void main(String[] args) {
//Creating object
        Student s1=new Student("Basheerul",21);
        //Calling method:
        s1.display();
    }

}

//Class definition:
class Student {
    //data members
    private String name;
    private int age;

    //constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public  void display(){
        System.out.println("Name:"+ name);
        System.out.println("Age:"+age);
    }
}
