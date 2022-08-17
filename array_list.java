import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(45);
        mylist.add(6);
        mylist.add(78);
        mylist.add(35);
        System.out.println("first element is :" + mylist.get(0));
        mylist.add(1,65);
        mylist.set(3, 44);
        mylist.remove(4);
        System.out.println(mylist.size());
        Collections.sort(mylist);
        System.out.println(mylist);
    }
}