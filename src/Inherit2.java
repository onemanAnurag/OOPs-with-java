public class Inherit2 {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.speak();
        d.eat();
    }
}

class Animal1{

    public void speak(){
        System.out.println("Animal are speaking..");

    }
    public void eat(){
        System.out.println("Animals are eating");

    }
}

class Dog1 extends Animal1{

    void bark(){
        System.out.println("Dogs are barking..");
    }
}
