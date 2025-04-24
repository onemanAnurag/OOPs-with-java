public class GettertSetter {
    public static void main(String[] args) {
     Cyclinder mycyclinder = new Cyclinder();
     mycyclinder.setRadius(12);
        System.out.println(mycyclinder.getRadius());

        mycyclinder.setHeight(10);
        System.out.println(mycyclinder.getHeight());
        System.out.println(mycyclinder.surfacearea());

    }
}

class Cyclinder {
    int radius;
    int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfacearea(){
        return 2*3.142*radius*radius + 2*3.142*radius*height;
    }

}