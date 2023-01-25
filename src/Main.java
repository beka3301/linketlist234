import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> name=new LinkedList<>();
        Random rn =new Random();
        for (int i = 0; i < 20; i++) {
            int a= rn.nextInt(0,2);
            name.add(a);
        }
        System.out.println(name1(name));
    }

    public static LinkedList<Integer> name1(LinkedList<Integer> at) {
    LinkedList<Integer> at1=new LinkedList<>();
        for (int a:at) {
            at1.add(a);
        }
        Collections.sort(at1);
       return at1;
    }

}
