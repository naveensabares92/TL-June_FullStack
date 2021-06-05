
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int outputValue = 0;

		switch(args[0]) {
			case("add"):
				for(int i = 1; i <args.length; i ++) {
					outputValue = outputValue + Integer.parseInt(args[i]);
				}
				System.out.println("Added Sum is " + outputValue);
				break;
				
			case("subtract"):
				if(args.length > 3) {
					System.out.println("Invalid Number of arguements; Enter only 2 numbers");
				} else {
					outputValue = (Integer.parseInt(args[1]) > Integer.parseInt(args[2])) ? 
							(Integer.parseInt(args[1]) - Integer.parseInt(args[2])) : 
								(Integer.parseInt(args[2]) - Integer.parseInt(args[1]));  
					
					System.out.println("Difference between 2 integers is " + outputValue);

				}
				break;
				
			case("multiply"):
				for(int i = 1; i <args.length; i ++) {
					outputValue = outputValue * Integer.parseInt(args[i]);
				}
				System.out.println("Multiplied Value is " + outputValue);
				break;
				
			case("divide"): 
				if(args.length > 3) {
					System.out.println("Invalid Number of integers; Enter only 2 numbers");
				} else {
					outputValue = (Integer.parseInt(args[1]) >= Integer.parseInt(args[2])) ? 
							(Integer.parseInt(args[1]) / Integer.parseInt(args[2])) : 
								(Integer.parseInt(args[2]) / Integer.parseInt(args[1]));  
					
					System.out.println("Reminder of the 2 numbers is " + outputValue);
				}
				break;
				
			default:
				System.out.println("Invalid input; Define only the below arithmetic operators");
				System.out.println("Options in first arguement: \n 1.add\n 2.subtract \n 3.multiply \n 4.divide");
				break;		
		}


	}

}
