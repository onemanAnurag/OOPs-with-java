public class Shape {
    public static void main(String[] args) {
     Square sq = new Square();
     sq.side=4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        Rectangle rec = new Rectangle();
        System.out.println(rec.area(2,5));
        System.out.println(rec.perimeter(4,6));
    }

}

class Square {
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Rectangle {


    int area(int length,int width){
        return length*width;
    }
    int perimeter(int length,int width){
        return 2*(length+width);
    }

}