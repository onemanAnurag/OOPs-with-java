
interface Bicycle{
    void applybreak(int decrement);
    void speedup(int increment);

}

class Avoncycle implements Bicycle{
    void blowHoorn() {
        System.out.println("pee poo");
    }

    public void applybreak(int decrement) {
        System.out.println("Apply Break");
    }

    public void speedup(int increment) {
        System.out.println("applying speedup");
    }
}

public class Interfaces {
    public static void main(String[] args) {
    Avoncycle c = new Avoncycle();
    c.applybreak(1);
    }
}
