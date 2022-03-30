package HashSetAndMap;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<String>();
        hs.add("John");
        hs.add("Smith");
        hs.add("Peter");
        System.out.println("Before adding duplicate values \n" + hs);
        hs.add("John");
        hs.add("Smith");
        System.out.println("\nAfter adding duplicate values \n" + hs);
        hs.add(null);
        hs.add(null);
        System.out.println("\nAfter adding null values \n" + hs);
    }
}
