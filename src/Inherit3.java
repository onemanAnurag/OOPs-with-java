public class Inherit3 {
    public static void main(String[] args) {
     ChildofDerived d = new ChildofDerived(4,5,7);
    }
}

class Base1{
    Base1(){
        System.out.println("I am a constructor");

    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x as: "+x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am a Derived class constuctor of value of y  is: "+y);

    }
}
class ChildofDerived extends Derived1{
    ChildofDerived(){
        System.out.println("I am a child of derived constructor:");
    }
    ChildofDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am a child derived constructor with value of z: "+z);
    }
}

