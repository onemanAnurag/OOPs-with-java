import java.util.*;
public class Has {
    public static void main(String[] args) {
        HashSet<String>hs = new HashSet<>();
        hs.add("First");
        hs.add("Second");
        hs.add("Third");
        hs.add("Fourth");
        hs.add("First");
        System.out.println(hs);
        System.out.println("Total Items:"+hs.size());
        System.out.println();
        for(String item:hs){
            System.out.print(item+" ");
        }
        Iterator<String>itr = hs.iterator();
        while (itr.hasNext()){
            String s =itr.next();
            System.out.print(s+" ");

        }




    }
}
