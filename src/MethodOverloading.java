public class MethodOverloading {
    public static void main(String[] args) {
        Greet obj = new Greet();
      obj.greetings();
      //  obj.greetings("Anuj");
     obj.greetings("anuj", 5);
    }
}


class Greet {


    void greetings() {
        System.out.println("Hello, good morning");
    }

    void greetings(String name){
        System.out.println("Hello "+name+",good morning");
    }

    void greetings(String name, int count){
        for(int i=0; i<count; i++){
            System.out.println("hello "+name+", Good Morning");
        }



    }
}
