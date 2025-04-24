interface A2 {
    void f1();

    default void f2() {
        System.out.println("Default inteface");
    }
    static void f3(){
        System.out.println("Static1");
    }
    static void f4(){
        System.out.println("Static 2");
    }
}
class B1 implements A2
{
    public void f1(){
        System.out.println("B");
    }
}



public class DefaultInterface {
    public static void main(String[] args) {
    A2 a = new B1();
      a.f1();
      a.f2();
      A2.f3();
      A2.f4();
    }
}
