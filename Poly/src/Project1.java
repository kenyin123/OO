import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;
public class Project1 {
    public static void main(String[] args) {
        Scanner Stringinput=new Scanner(System.in);
        String stringInput=Stringinput.nextLine();
        stringInput=stringInput.replaceAll(" ","");
		//int polynum,polylen;
        Vector<int [][]> v1 = new Vector();
        Vector v2 = new Vector();
        Map map = new HashMap();
        FormatProcess e1 = new FormatProcess();
        e1.symbolHandle(stringInput,v1,v2);
        Calculator e2 = new Calculator();
        e2.calculate(v1,v2,map);
        System.out.println("The map is:\n\t"+map); 
	}
    
}
