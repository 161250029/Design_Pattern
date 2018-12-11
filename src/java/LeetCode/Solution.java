package LeetCode;

public class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        boolean flag = true;
        char[] orderArray = order.toCharArray();
        for(int i = 0; i < words.length ; i ++) {
            for(int j = i+1 ; j < words.length ; j++) {
                if(!isValid(words[i] , words[j] , orderArray)) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
    public boolean isValid(String forward , String late , char[] orderArray) {
        boolean flag = true;
        int size1 = forward.length();
        int size2 = late.length();
        int size = max(size1 , size2);
        for(int i = 0 ; i < size - size1 ; i ++) {
            forward = forward + "#";
        }
        for(int i = 0 ; i < size - size2 ; i ++) {
            late = late + "#";
        }
        for(int i = 0 ; i < size ; i ++) {
            if(getIndex(forward.charAt(i) , orderArray) < getIndex(late.charAt(i) , orderArray)){
                flag = true;
                break;
            }
            else if(getIndex(forward.charAt(i) , orderArray) > getIndex(late.charAt(i) , orderArray)) {
                flag = false;
                break;
            }
            else{

            }
        }
        return flag;
    }
    public int getIndex(char c , char[] orderArray) {
        int index = -1;
        for(int i = 0 ; i < orderArray.length ; i ++) {
            if(c == orderArray[i]) {
                index = i;
                break;
            }
        }
        return index;
    }
    public int max(int size1 , int size2) {
        if(size1 > size2) {
            return size1;
        }
        else{
            return size2;
        }
    }
    public static void main(String args[]) {
        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        Solution s =  new Solution();
        System.out.println(s.isAlienSorted(words , order));
    }
}