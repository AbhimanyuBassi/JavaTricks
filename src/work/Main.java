package work;

import java.util.function.Predicate;

public class Main {

public static void main(String args[]){
    System.out.println("Hello World !");

    //Method 1
    MyInterfaceImpl myInterfaceImpl = new MyInterfaceImpl();
    myInterfaceImpl.SayHello();


    //Method 2
    MyInterface myInterface_1 = new MyInterface() {
        @Override
        public void SayHello() {
            System.out.println("this is from Method 1, first one..");
        }
    };


    MyInterface myInterface_2 = new MyInterface() {
        @Override
        public void SayHello() {
            System.out.println("this is from Method 1, second one...");
        }
    };

    myInterface_1.SayHello();
    myInterface_2.SayHello();

    //Method 3
    MyInterface i = ()-> System.out.printf("This is from Lambda..");
    i.SayHello();

    Runnable r = ()->System.out.println(" lo ji ho gaya lambda");
    r.run();
 }
}
