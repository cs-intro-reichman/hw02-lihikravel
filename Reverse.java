
public class Reverse {
	public static void main (String[] args){
		String s = (args[0]);
		int i =0;
		String sOut= " ";
		for (i = s.length()-1; i>=0; i--){
		char c = s.charAt(i);
		sOut =  sOut + c;
     }
		 System.out.println(sOut);
		 for (i = 0; i < s.length();i++){
		 	if (i == ((s.length()-1)/2)){
		 	System.out.println("The middle character is " +s.charAt(i));	
		 	}
		 }
	}
}