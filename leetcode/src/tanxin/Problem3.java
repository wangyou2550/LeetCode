package tanxin;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problem3 {
    public int[][]reconstructQueue(int[][]people){
        if(people==null||people.length==0||people[0].length==0)return new int[0][0];
        Arrays.sort(people,(a,b)->(a[0]==b[0]?a[1]-b[1]:b[0]-a[0]));
        List<int[]>output=new LinkedList<>();
        for(int[]p:people){
            output.add(p[1],p);
        }
        int n=people.length;
        return output.toArray(new int[n][2]);
    }

}
