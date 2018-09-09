import java.util.Vector;
public class FormatProcess {
    public int stringToInt(String numstr) {
        int num;
        int len = numstr.length();
        if (numstr.charAt(0) == '+'){
            num = Integer.parseInt(numstr.substring(1, len-1));    
        }
        else if(numstr.charAt(0) == '-'){
            num = 0 - Integer.parseInt(numstr.substring(1, len-1));    
        }
        else num = Integer.parseInt(numstr.substring(0, len-1));
        return num;
    }
	public void removeBracket(String polynomial,Vector v1) {
		int len = polynomial.length();
		polynomial = polynomial.substring(1,len); //maybe wrong
		String strArray[] = polynomial.split(",");
		String numArray[];
		for (String tmp:strArray) {
			len = tmp.length();
			tmp = tmp.substring(1,len);
			numArray = tmp.split(",");
			v1.addElement(stringToInt(numArray[0]));
			v1.addElement(stringToInt(numArray[1]));
		}
	}
	public void symbolHandle(String stringInput,Vector v1) {
		int i=0,indexBefore=0;
		String tmpString;
		for (i = 0; i < stringInput.length(); i++) {    
			if((stringInput.charAt(i) == '+'| stringInput.charAt(i) == '-')&&(i!=stringInput.length())) {
			    tmpString = stringInput.substring(indexBefore, i-1);
			    removeBracket(tmpString,v1);
			    v1.addElement(stringInput.charAt(i));
			    indexBefore = i+1;
			}
			if(i == stringInput.length()) {
			    tmpString = stringInput.substring(indexBefore, i);
                removeBracket(tmpString,v1);
                v1.addElement(stringInput.charAt(i));
			}
		}
	}
}
