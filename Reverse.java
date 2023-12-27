
public class Reverse {
	public static void main (String[] args){
		String s = (args[0]);
		int i =0;
		String sOut= " ";
		for (i=s.length()-1; i>=0; i--){
		char c = s.charAt(i);
		sOut =  sOut + c;
        if (i == (s.length()-1/2)){
        System.out.print("The middle character is " + c);
       } 
     }
		 System.out.println(sOut);
	}
}