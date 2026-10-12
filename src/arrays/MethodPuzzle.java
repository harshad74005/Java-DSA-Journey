package arrays;
class A { }
class B extends A { }

public class MethodPuzzle {
    
    public static void display(A a) {
        System.out.println("Method A called");
    }
    
    public static void display(B b) {
        System.out.println("Method B called");
    }

    public static void main(String[] args) {
        display(null);
    }
}