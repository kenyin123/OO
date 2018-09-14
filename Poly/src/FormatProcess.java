import java.util.Vector;
public class FormatProcess {
	public void removeBracket(String polynomial,Vector v1) {
		int len = polynomial.length();
		polynomial = polynomial.substring(1,len-1);
		//not be familiar with String.length() and String.substring()
		//this is to remove"{" and "}" 
		polynomial = polynomial.replaceAll("\\(","");
		polynomial = polynomial.replaceAll("\\)","");
		String[] strArray = polynomial.split(",");
		//String[] numArray;
		for (String tmp:strArray) {
			v1.addElement(Integer.parseInt(tmp));
		}
	}
	public void symbolHandle(String stringInput,Vector v1) {
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
	}
}
