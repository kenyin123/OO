import java.util.Scanner;
import java.util.Vector;
public class Project1 {
	/*
	public int[] getnum1(String str) //throws IOException
	{
		String replaceStr=str.substring(1,str.length()-1);
		String[] array = replaceStr.split(",");
		if(array.length!=2) {
			//throw new IOException();
		}
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);
		int arrayint[] = {a,b};
		return arrayint;
	}
	*/
    public static void main(String[] args) {
		Scanner Stringinput=new Scanner(System.in);
		String stringInput=Stringinput.nextLine();
		stringInput=stringInput.replaceAll(" ","");
		
		Vector v1 = new Vector();
		FormatProcess e1 = new FormatProcess();
		e1.removeSmallBracket(stringInput,v1);
		
		int array[]=e.getnum1(str1);
		System.out.printf("%d%d",array[0],array[1]);
	}
    
}
