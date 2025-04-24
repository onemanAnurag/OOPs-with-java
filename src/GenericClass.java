import java.util.*;
class MyCollection<T>{
    T x;
}

public class GenericClass {
    public static void main(String[] args) {
        MyCollection m1 = new MyCollection();
        MyCollection<String> m2 = new MyCollection();
        MyCollection<Integer> m3 = new MyCollection();
        m1.x=25;
        m2.x="hello";
        m3.x=100;
        System.out.println(m2.x);
    }
}
