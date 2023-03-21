abstract class Student{
    String name;
    int age;
    double gpa;
    abstract void marks();
}

class CIA extends Student{
    CIA(){
        name = "";
        age = 0;
        gpa = 0.0;
    }
    CIA(String n, int a, double g){
        name = n;
        age = a;
        gpa = g;
    }
    void marks(){
        System.out.println("Name, age, GPA of CIA: " + name + " " + age + " " + gpa);
    }
}

class Semester extends Student{
    Semester(){
        name = "";
        age = 0;
        gpa = 0.0;
    }
    Semester(String n, int a, double g){
        name = n;
        age = a;
        gpa = g;
    }
    void marks(){
        System.out.println("Name, age, GPA of semester: " + name + " " + age + " " + gpa);
    }
}

public class abstractdemo {
    public static void main(String[] args) {
        Semester obj = new Semester("Arun", 19, 4.2);
        obj.marks();
        Semester obj1 = new Semester("Rahul", 21, 3.7);
        obj1.marks();
    }
}
