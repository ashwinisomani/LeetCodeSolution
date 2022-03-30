package String;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
    String s = "LD";
    var integer = new RomanToInteger();
    var result = integer.romanToInteger(s);
    System.out.println(result);

    }

    public int romanToInteger( String s){
     HashMap<Character , Integer> map = new HashMap<>();
     map.put('I' , 1);
     map.put('V' , 5);
     map.put('X' , 10);
     map.put('L' , 50);
     map.put('C' , 100);
     map.put('D' , 500);
     map.put('M' , 1000);

     var result = map.get(s.charAt(s.length() -1 ));
     for(int i= s.length()-2 ; i>=0 ; i--)
        if(map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
        result-= map.get(s.charAt(i));
        else
        {
        result+= map.get(s.charAt(i));
        }
      return result ;

    }
}
