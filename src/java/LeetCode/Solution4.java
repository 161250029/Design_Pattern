package LeetCode;

import java.util.*;

public class Solution4 {
    public boolean canReorderDoubled(int[] A) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:A) {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        List<Integer> vals=new ArrayList<>(map.keySet());
        Collections.sort(vals);
        for(int val:vals) {
            int cnt=map.get(val);
            if(cnt==0) {
                continue;
            }
            if (val==0) {
                if ((cnt&1)==1){
                    // count of 0 must be even
                    return false;
                }
            } else {
                int k=val;
                if(val<0) {
                    //for v<0,val must be even
                    if ((val&1)==1) {
                        return false;
                    }
                    //remove v/2
                    k/=2;
                } else {
                    //for v>0, remove v*2
                    k*=2;
                }
                int cntK=map.getOrDefault(k,0);
                if (cntK<cnt) {
                    return false;
                }
                map.put(k,cntK-cnt);
            }
        }
        return true;
    }
}
