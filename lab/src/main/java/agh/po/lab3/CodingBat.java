package agh.po.lab3;

public class CodingBat {
    public static void main(String[] args){
        CodingBat codingBat = new CodingBat();
        codingBat.countEvens(new int[]{1,2,3,4,7,9,2137});
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

}
