import java.util.Vector;
import java.util.*;
public class Calculator {
    public void calculate (Vector<int [][]> v1,Vector v2,Map map) {
        int i = 0, j = 0,arraylen,tmp;//i polynum ;j array num
        int vectorsize = v1.size();
        arraylen = v1.get(0).length;
        for(j = 0; j < arraylen; j++) {
            map.put(v1.get(i)[j][1],v1.get(i)[j][0]);
        }
        i++;
        for(i = 1;i < vectorsize; i++) {
            arraylen = v1.get(i).length;
            for(j = 0; j < arraylen; j++) {
                if(map.get(v1.get(i)[j][1])==null) {
                    map.put(v1.get(i)[j][1],v1.get(i)[j][0]);
                }
                else {
                    tmp = (int)map.get(v1.get(i)[j][1]);
                    if((char)v2.get(i-1)=='+') {
                        tmp += (int) v1.get(i)[j][0];
                    }
                    if((char)v2.get(i-1)=='-') {
                        tmp -= (int) v1.get(i)[j][0];
                    }
                    map.put(v1.get(i)[j][1],tmp);
                }
            }
        }
    } 
    
}
