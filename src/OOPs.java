class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Write something");

    }

    public void printcolor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    Student(){

    }

}



public class OOPs {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ball";

        Student s1 = new Student();
        s1.name = "Anuj";
        s1.age = 22;

        Student s2 = new Student(s1);
        s2.printInfo();


        pen1.write();
        pen2.printcolor();
      //  s1.printInfo();


    }
}
