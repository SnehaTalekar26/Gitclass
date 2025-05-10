package com.xworkz.Task.Internal;

public class Student {
    private String name;
    private int age;
    private String grade;

    public Student(String name, int age, String grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString(){
        return " Student name: " + this.name + " ,Age: " + this.age + " ,Grade: " + this.grade;
    }
    @Override
    public int hashCode(){
        return 4;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Student){
            Student student1=this;
            Student student2=(Student) obj;
            if(student1.name==student1.name && student2.age==student2.age){
                return true;
            }
        }
        return false;
    }
}
