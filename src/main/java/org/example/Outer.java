package org.example;

public class Outer {

    void outerClassMethod(){
        System.out.println("in the outer class method");
        class MethodLocalClass{
            void localInnerMethod(){
                System.out.println("in the method local class method");
            }
        }
        MethodLocalClass mlc = new MethodLocalClass();
        mlc.localInnerMethod();
    }
    class InnerClassess {
        public void display() {
            System.out.println("This is a inner class method");

        }


    }
}

