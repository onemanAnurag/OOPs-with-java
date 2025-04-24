public class Employ {
    public static void main(String[] args) {
     Worker detail = new Worker();
     detail.setName("CodeWithHarry");
        System.out.println(detail.getName());

        Cellphone iphone = new Cellphone();
        iphone.callfriend();
        iphone.vibrating();
        iphone.ringing();



    }
}
class Cellphone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public void callfriend(){
        System.out.println("call bunty..");
    }

}

class Worker {
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;

    }

}
