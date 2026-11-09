package agh.po.lab3;
import java.util.HashMap;
import java.util.Map;

public class CodingBat {
    public static void main(String[] args){
        CodingBat codingBat = new CodingBat();
        codingBat.countEvens(new int[]{1,2,3,4,7,9,2137});

        Map<String,String> testMapa = new HashMap<>();
        testMapa.put("a","Hi");
        testMapa.put("b","There");
        System.out.println(testMapa);
        CodingBat.mapAB(testMapa);
        System.out.println(testMapa);

        String[] arraytest ={"a","bb","a","bb"};
        System.out.println(java.util.Arrays.toString(arraytest));
        Map<String,Integer> result =CodingBat.wordLen(arraytest);
        System.out.println(result);

    }
    public static boolean hasTeen(int a, int b, int c) {
        if((a>=13)&&(a<=19)||(b>=13)&&(b<=19)||(c>=13)&&(c<=19)){
            return true;
        }
        return false;
    }
    public static boolean loneTeen(int a, int b) {
        if((a>=13)&&(a<=19)&&(b<13||b>19)||(b>=13)&&(b<=19)&&(a<13||a>19)){
            return true;
        }
        return false;
    }
    public static int countEvens(int[] nums) {
        int counter=0;
        for(int i: nums){
            if(i%2==0){
                counter++;
            }
        }
        return counter;
    }
    public static String helloName(String name) {
        String hello=("Hello ");
        String wyk=("!");
        String ret= hello+name+wyk;
        return ret;
    }
    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }
    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, s.length());
        }
        return map;
        }


}
