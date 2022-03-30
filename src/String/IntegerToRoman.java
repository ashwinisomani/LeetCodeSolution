package String;

public class IntegerToRoman {
    public static void main(String[] args) {
    int num = 3;
    var roman = new IntegerToRoman();
    var result = roman.intToRoman(num);
    System.out.println(result);
    }
   public String intToRoman(int num){
            int[] value      = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
            String[] symbols = {"M" ,"CM" ,"D","CD","C","XC" ,"L" ,"XL","X","IX" ,"V","IV","I"};

            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i< value.length ; i++){
                while(num >= value[i]){
                    sb.append(symbols[i]);
                    num-= value[i];

                }
            }
            return sb.toString();
        }
    }

