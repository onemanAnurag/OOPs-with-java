public class Overiding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.math2();
        b.math2();
    }
}

class A{
    void math2(){
        System.out.println("I am method 2 of class A");

    }

}
class B extends A{
    public void math2(){
        System.out.println("I am method 2 of class B");
    }

    void math3(){
        System.out.println("I am method 3 of class B");
    }
}
