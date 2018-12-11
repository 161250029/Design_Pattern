package LeetCode;

import java.util.ArrayList;

public class Solution3 {
    public boolean canReorderDoubled(int[] A) {
        boolean flag = true;
        ArrayList<Integer> invert = InvertToList(A);
        int index = 0;
        while(invert.size() > 0) {
            int target = invert.get(index);
            invert.remove((Object) target);
            if(isExistsLarger(invert , target) || isExistsLower(invert , target)) {
                if(isExistsLower(invert , target )) {
                     invert.remove((Object) (target/2));
                }
                else{
                    invert.remove((Object) (target*2));
                }
            }
            else{
                    flag = false;
                    break;
            }
        }
        return flag;
    }
    public ArrayList<Integer> InvertToList(int[] A) {
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for(int i = 0 ; i < A.length ; i ++) {
            integerArrayList.add(A[i]);
        }
        for(int i = 0 ; i < integerArrayList.size() ; i ++) {
            for(int j = 0 ; j < integerArrayList.size() - i - 1; j ++) {
                 if(integerArrayList.get(j) > integerArrayList.get(j + 1)) {
                     int temp = integerArrayList.get(j);
                     integerArrayList.set( j , integerArrayList.get(j+1));
                     integerArrayList.set( j+1 , temp);
                 }
            }
        }
        return integerArrayList;
    }
    public boolean isExistsLarger(ArrayList<Integer> A , int a) {
        boolean flag = false;
        for(int i = 0 ; i < A.size() ; i++) {
            if(A.get(i) == a * 2) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    public boolean isExistsLower(ArrayList<Integer> A , int a) {
        boolean flag = false;
        for(int i = 0 ; i < A.size() ; i++) {
            if(A.get(i) == a/2) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static void main(String args[]) {
        Solution3 s = new Solution3();
        int[] A = {4,2,4,4,2,-4,0,-2,0,4};
        System.out.println(s.canReorderDoubled(A));
    }
}