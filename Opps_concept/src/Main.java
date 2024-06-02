import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

//class Pen{
//    String color;
//    String type;
//    public void write(){
//        System.out.println("Writing Something");
//    }
//    public void printColor(){
//        System.out.println(this.color);
//       // System.out.println(this.type);
//
//    }
//    public void printType(){
//        System.out.println(this.type);
//    }
//
//}
class Pencil{

    String color;
    String type;
    public void write(){
        System.out.println("Write Something...");

    }
}

public class Main {
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
        Pencil pencil = new Pencil();
        pencil.color="black";
        pencil.write();





    }
}