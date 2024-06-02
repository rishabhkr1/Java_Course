class Student1{
    String name;
    int age;
    public void printInfo(){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+" "+ age);
    }
}

public class Polymorphism {
    public static void main(String args[]){
        Student1 s2 = new Student1();
        s2.name="rishi";
        s2.age=22;
        s2.printInfo(s2.age);
    }
}
