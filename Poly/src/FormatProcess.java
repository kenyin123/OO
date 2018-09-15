import java.util.Vector;
public class FormatProcess {
	public void removeBracket(String polynomial,Vector v1) {
		int len = polynomial.length();
		polynomial = polynomial.substring(1,len-1);//this is to remove"{" and "}"
		polynomial = polynomial.replaceAll("\\(","");
		polynomial = polynomial.replaceAll("\\)","");
		String[] strArray = polynomial.split(",");
		int i = 0,j = 0;
		len = strArray.length;
		int[][] arr = new int[len/2][2];
		for(i = 0,j = 0; j < len; i++,j+=2) {
		    arr[i][0] = Integer.parseInt(strArray[j]);
		    arr[i][1] = Integer.parseInt(strArray[j+1]);
		}
		v1.addElement(arr);
	}
	
	
	public void symbolHandle(String stringInput,Vector<int [][]> v1, Vector v2) {
		/*
		int i=0,indexBefore=0;
		String tmpString;
		for (i = 0; i < stringInput.length(); i++) {    
			if((stringInput.charAt(i) == '+'|| stringInput.charAt(i) == '-')&&(i!=stringInput.length()-1)) {
			    tmpString = stringInput.substring(indexBefore, i);
			    removeBracket(tmpString,v1);
			    v1.addElement(stringInput.charAt(i));
			    indexBefore = i+1;
			}
			if(i == stringInput.length()-1) {
			    tmpString = stringInput.substring(indexBefore, i+1);//i+1???
                removeBracket(tmpString,v1);
                v1.addElement(stringInput.charAt(i));
			}
		}
		*/
	    String[] polystr = stringInput.split("}");
        int polynum = polystr.length;
	    String tmpString = polystr[0];
	    tmpString = tmpString.substring(1, tmpString.length());
	    removeBracket(tmpString,v1);
	    int i = 1;
	    for (i = 1; i < polynum; i++) {
	        tmpString = polystr[i];
	        v2.addElement((char)(tmpString.charAt(0)));
	        tmpString = tmpString.substring(2, tmpString.length());
	        removeBracket(tmpString,v1);
	    }
	    polynum--;
	}
}
