import java.util.Vector;
import java.util.*;
public class Calculator {
    public void calculate (Vector<int [][]> v1,Vector v2,Map map) {
        /*
        int index1 = 0, index2 = 0;
        int tmp;
        int sizeOfVector = v1.size();
        String symbol;
        Map map = new HashMap();
        while(v1.get(index2) != "+"&& v1.get(index2) != "-") {
            map.put(v1.get(index2+1),v1.get(index2));  //why wrong??
            index2+=2;
        }
        symbol = (String)v1.get(index2);
        index2++; 
        index1 = index2;
        while(index2 < sizeOfVector) { //maybe wrong
            if(v1.get(index2) == "+"||v1.get(index2) == "-" ||index2 == sizeOfVector-1) {
                if(symbol == "+") {
                    while(index1<index2) {
                        if(map.get(v1.get(index1+1)) == null) {
                            map.put(v1.get(index1+1),v1.get(index1));
                        }
                        else {
                            tmp = (int) map.get(v1.get(index1+1));
                            tmp += (int) v1.get(index1);
                            map.put(v1.get(index1+1),tmp);
                        }
                        index1+=2;
                    }
                }
                if(symbol == "-") {
                    while(index1<index2) {
                        if(map.get(v1.get(index1+1)) == null) {
                            tmp =0- (int) v1.get(index1);
                            map.put(v1.get(index1+1),tmp);
                        }
                        else {
                            tmp = (int) map.get(v1.get(index1+1));
                            tmp -= (int) v1.get(index1);
                            map.put(v1.get(index1+1),tmp);
                        }
                        index1+=2;
                    }
                }
                if(index2 != sizeOfVector-1) {
                    symbol = (String)v1.get(index2);
                    index1++;
                    index2++;
                }
            }
            index2+=2;
        }
        */
        
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
