
public class Perfect {
	public static void main (String[] args) {
		// #feedback: Bad indentations!
		int num = Integer.parseInt(args[0]);
		int i;
		// #feedback: use better name
		int sum =0;
		// #feedback: better to accamulate your string instead of calculate it again later.
		String sumAccamulatorString = "";
		for (int i=1; i<num ;i++) {
			if (num%i == 0) {
				sum += i;
				sumAccamulatorString += i + " + ";
			}
		}
		sumAccamulatorString = sumAccamulatorString.substring(0,sumAccamulatorString.length()-3);
          	if (num == sum){
               		System.out.print(num + " is a perfect number since " + num + " = " + sumAccamulatorString);
		}
 
		else 
		    System.out.println(num + " is not a perfect number");
	}
}
