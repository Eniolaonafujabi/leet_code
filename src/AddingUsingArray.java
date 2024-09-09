import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

public class AddingUsingArray {

    public static ArrayList<Character> add(int[] a, int num) {
        ArrayList<Character> result = new ArrayList<Character>();
//        char[] result = new char[a.length+1];
        String number = "";
        String []b = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = String.valueOf(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            number += b[i];
        }
        int number1 = parseInt(number);
        int result1 = number1 + num;
        String result2 = String.valueOf(result1);

        for (int i = 0; i < result2.length(); i++) {
            result.add(i, result2.charAt(i));
        }
        return result;
    }
}
