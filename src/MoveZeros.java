import java.util.ArrayList;

public class MoveZeros {
        public ArrayList<Integer> moveZeroes(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ArrayList<Integer> zero = new ArrayList<Integer>();
        for(int a : nums){
            if(a != 0){
                ans.add(a);
            }else{
                zero.add(a);
            }
        }
        ans.addAll(zero);
        return ans;
    }
}
