public class Dispatch {
    public static void main(String[] args) {
        Phone obj = new Smartphone();
        obj.on();


    }
}

class Phone {
    void on(){
        System.out.println("Turning on phone..");
    }

}
class Smartphone extends Phone{
    void on(){
        System.out.println("Turning on smartphone..");
    }
    void call(){
        System.out.println("smartphone is ring..");
    }
}
