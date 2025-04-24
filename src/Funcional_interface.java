interface A1{
    void f1();
}
public class Funcional_interface {
    public static void main(String[] args) {
    new A1(){
        public void f1(){
            System.out.println("ABC");
        }
    }.f1();
    }
}
