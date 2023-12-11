package org.example;

public class InnerClassesDemo {
    public static void main(String[]args){
        Outer.InnerClassess in = new Outer().new InnerClassess();
        in.display();

        Outer outer = new Outer();
        outer.outerClassMethod();

    }
}
