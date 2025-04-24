public class Construct {
    public static void main(String[] args) {
        Complexed num1 = new Complexed(2,5);
        Complexed num2 = new Complexed(7,9);
        num1.print();
        num2.print();
        System.out.println("adding two numbers");
        Complexed result = num1.add(num2);

        result.print();

    }
}

class Complexed {
    int a,b;

    public Complexed(int real, int imaginary){
        a=real;
        b=imaginary;

    }
    void print() {
        System.out.println(a+" + "+b+"i");
    }

    Complexed add(Complexed num2) {
        return new Complexed(a+num2.a, b+num2.b);
    }
}
