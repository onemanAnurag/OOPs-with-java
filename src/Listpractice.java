import java.util.*;


public class Listpractice {
    public static void main(String[] args) {
        ArrayList<String> strlst = new ArrayList<>();
        strlst.add("Anuj");
        strlst.add("Singh");
        for(int i=0;i<strlst.size();i++){
            System.out.println(strlst.get(i));
        }

        strlst.add(1,"Aman");
        strlst.remove(0);


        for(String str : strlst){
            System.out.println(str);
        }
    }
}
