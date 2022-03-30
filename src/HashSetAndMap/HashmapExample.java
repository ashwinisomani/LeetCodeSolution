package HashSetAndMap;

import java.util.HashMap;

public class HashmapExample {
    public static void main(String[] args){
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(12, "John");
        hm.put(2, "Smith");
        hm.put(7, "Peter");
        System.out.println("\nHashMap object output :\n" + hm);
        hm.put(12, "Smith");
        System.out.println("\nAfter inserting duplicate key :\n" + hm);
    }
}
