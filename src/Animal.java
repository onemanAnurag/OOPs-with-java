public class Animal {
    public static void main(String[] args) {
//        Dog d1=new Dog();
//        d1.name = "Tommy";
//        d1.bark();
//
//
//        Dog d2 = new Dog();
//        d2.name= "Leo";
//        d2.walk();

        Complex num1 = new Complex();
        num1.a = 3;
        num1.b = 4;
        num1.print();

    }
}

class Dog {
    String name;
    int age;
    String color;

    void bark() {
        System.out.println(name+" is barking");
    }

    void walk(){
        System.out.println(name+" is walking");
    }
}

class Complex {
    int a,b;

    void print() {
        System.out.println(a+" + "+b+"i");
    }
}