package LeetCode;

import java.util.ArrayList;

public class Solution2 {
    public boolean canReorderDoubled(int[] A) {
         boolean flag = true;
         ArrayList<Integer> invert = InvertToList(A);
         int count = 0;  //记录0出现的个数
         int min = 0;
         int max = 0;
         for(int i = 0 ; i < A.length/2 ; i ++) {
             if(isExistsPlus(invert)) {
                 min = getMin(invert);
                 invert.remove((Object)min);
                 if(!isExists(min , invert)) {
                     flag = false;
                     break;
                 }
                 invert.remove((Object)(2 * min));
             }
             else {
                 max = getMax(invert);
                 invert.remove((Object) max);
                 if(!isExists(max , invert)) {
                     flag = false;
                     break;
                 }
                 invert.remove((Object)(2 * max));
             }
         }
         return flag;
    }
    public ArrayList<Integer> InvertToList(int[] A) {
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for(int i = 0 ; i < A.length ; i ++) {
             integerArrayList.add(A[i]);
        }
        return integerArrayList;
    }
    public boolean isExistsPlus(ArrayList<Integer> A) {
        boolean flag = false;
        for(int i = 0 ; i < A.size() ; i ++) {
            if(A.get(i) >= 0) {
                flag = true;
                break;
            }

        }
        return flag;
    }
    public int getMin(ArrayList<Integer> A) {
        int min = 100000;
        for(int i = 0 ; i < A.size() ; i ++) {
             if(A.get(i) < min && A.get(i) >= 0) {
                 min = A.get(i);
             }
        }
        return min;
    }

    public int getMax(ArrayList<Integer> A) {
        int max = -1000;
        for(int i = 0 ; i < A.size() ; i ++) {
            if(A.get(i) > max && A.get(i) < 0) {
                max = A.get(i);
            }
        }
        return max;
    }
    public boolean isExists(int min , ArrayList<Integer> A) {
        boolean flag = false;
        for(int i = 0 ; i < A.size() ; i ++) {
            if(min > 0) {
                if(A.get(i) == min * 2) {
                    flag = true;
                    break;
                }
            }
            else {
                if(A.get(i) == min * 2) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
    public static void main(String args[]) {
        Solution2 s = new Solution2();
        int[] A = {-4,-6,-1,-2,-1,-1,-3,-8};
        System.out.println(s.canReorderDoubled(A));
    }
}
