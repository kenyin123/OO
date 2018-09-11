import java.util.Scanner;
import java.util.Vector;
public class Project1 {
    public static void main(String[] args) {
        Scanner Stringinput=new Scanner(System.in);
        String stringInput=Stringinput.nextLine();
        stringInput=stringInput.replaceAll(" ","");
		 
        Vector v1 = new Vector();
        FormatProcess e1 = new FormatProcess();
        e1.symbolHandle(stringInput,v1);
        Calculator e2 = new Calculator();
        e2.calculate(v1);
        System.out.println("The Vector v1 is:\n\t"+v1); 
	}
    
}
