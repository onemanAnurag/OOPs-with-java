public class Abstractiion {
    public static void main(String[] args) {
   // parent p = new parent();
    child c = new child();
    c.greet();
   // child2 c2 = new child2();

    }
}
abstract class parent{
    public parent(){
        System.out.println("I am constructor of parent");
    }
    public void sayhello(){
        System.out.println("Hello");
    }
    abstract public void greet();

}
class child extends parent{
    public void greet(){
        System.out.println("Good morning");
    }
}

abstract class child2 extends parent{
    public void th(){
        System.out.println("I am good");
    }
}

