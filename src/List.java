import java.util.*;
public class List {
    public static void main(String[] args) {
        LinkedList<String>lst=new LinkedList<>();
        lst.add("A1");
        lst.add("A2");
        lst.add(0,"A5");
        lst.add("Hello");
        System.out.println(lst);
        for(int i=0;i<lst.size();i++){
            String a=lst.get(i);
            System.out.print(a+" ");
        }
        lst.set(2,"Abc");
        lst.remove("Hello");
        for(String item:lst){
            System.out.print(item+" ");
        }
        System.out.println();
        Iterator<String>itr=lst.iterator();
        while (itr.hasNext()){
            String s= itr.next();
            System.out.print(s+" ");
        }
        lst.clear();
        System.out.println("Total element is "+lst.size());

    }
}
