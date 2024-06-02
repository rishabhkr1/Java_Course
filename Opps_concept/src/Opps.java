class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing Something");
    }
    public void printColor(){
        System.out.println(this.color);
       // System.out.println(this.type);

    }
    public void printType(){
        System.out.println(this.type);
    }

}
//class Pencil{
//
//    String color;
//    String type;
//    public void write(){
//        System.out.println("Write Something...");
//
//    }
//}
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
//    Student(){//non-paramametrized constructor
//        System.out.println("Constructor is called.");
//    }
    Student(String name, int age){//Parametrized constructor
        this.name =name;
        this.age = age;
    }

}

public class Opps {
    public static void main(String[] args) {

//        Pen pen1 = new Pen();
//        pen1.color="blue";
//        pen1.type="gel";
//       // pen1.write();
//
//        Pen pen2=new Pen();
//        pen2.color="black";
//        pen2.type="ballpoint";
//
//
//        pen1.printColor();
//        pen2.printColor();
//
//        pen1.printType();
////        Pencil pencil = new Pencil();
////        pencil.color="black";
////        pencil.write();
        Student s1 =new Student("Rishi", 22);
//        s1.name="Rishi";
//        s1.age=21;
        s1.printInfo();





    }
}