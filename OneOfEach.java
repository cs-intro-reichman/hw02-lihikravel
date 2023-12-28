
public class OneOfEach {
	public static void main (String[] args) {
		int boys= 0;
		int girl = 0;
        while (boys == 0 || girl == 0){
		double num = Math.random();
		if (num<=0.5){
        boys ++;
        System.out.print(" b ");
		}
		else {
		girl ++;
	    System.out.print(" g ");
	}
	if (girl >=1 && boys >= 1){
		int sum = boys +girl;
	System.out.println("You made it... and you now have " + sum + " children.");
	}	
	}
	}
}
