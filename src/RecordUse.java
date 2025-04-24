record Employee(String name,int salary){
    static String company = "Gateway";
    void printTax(){
        System.out.println(salary*.2);
    }
};

public class RecordUse {
    public static void main(String[] args) {
        Employee e = new Employee("Anuj",150000);
        String s1 = e.name();
        int s2 = e.salary();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(e);
        System.out.println(e.company);
        e.printTax();
    }
}
