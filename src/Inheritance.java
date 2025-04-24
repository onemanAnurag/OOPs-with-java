class Base{
     int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base setting X");
        this.x = x;
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX());

        Derived d = new Derived();
        d.setX(4);
        System.out.println(d.getX());

    }
}
