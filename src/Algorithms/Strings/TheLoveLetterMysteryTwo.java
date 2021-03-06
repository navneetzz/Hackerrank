package Algorithms.Strings;

import java.util.Scanner;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 2/7/17.
 */
public class TheLoveLetterMysteryTwo {
    static int theLoveLetterMystery(String s){
        int i=0, j=s.length()-1;
        int count = 0;
        while (i<j) {
            count+=(Math.abs((int)s.charAt(i)-(int)s.charAt(j)));
            i++;
            j--;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = theLoveLetterMystery(s);
            System.out.println(result);
        }
        in.close();
    }

}
