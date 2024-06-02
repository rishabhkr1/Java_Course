import java.util.Scanner;

public class Main {
//    public static void printJava(){
//        System.out.println("Hello Java");
//    }
//    public static void sum(int a,int b){
//        int sum = a+b;
//        System.out.println(sum);
//    }
//    public static void printName(String name){
//        System.out.println(name);
//    }
//    public static void main(String[] args) {
//        printJava();
//        printName("Rishabh");
//        sum(4,6);
//    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int)(Math.random()*100);
        int userNumber=0;

        do{
            System.out.println("Enter your number: ");
            userNumber= sc.nextInt();
            if(userNumber==randomNumber){
                System.out.println("WOOHOO.. You guessed it right ");
                break;
            }
            else if(userNumber>randomNumber){
                System.out.println("Your number is large..");
            }else {
                System.out.println("your number is small..");
            }
        }while(userNumber>=0);
        System.out.println("Your number was: "+ userNumber);
    }
}