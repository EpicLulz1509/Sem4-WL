class Person {
    String name;
    int age;
  
    Person(String name, int age) {
      this.name = name;
      this.age = age;
    }
  
    void displayInfo() {
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
    }
  }
  
class Student extends Person {
    int rollNo;
  
    public Student(String name, int age, int rollNo) {
      super(name, age);
      this.rollNo = rollNo;
    }
  
    public void displayInfo() {
      super.displayInfo();
      System.out.println("Roll No: " + rollNo);
    }
  }
  
public class inherits {
    public static void main(String[] args) {
      Student student = new Student("Arun", 19, 549);
      student.displayInfo();
    }
} 
