package conditionstatements;

public class If_elsecondition5 {

	public static void main(String[] args) {
		// Creating two variables for age and weight
		int age = 19;
		int weight = 50;
		// applying condition on age and weight
		if (age >= 18) {
			//System.out.println("Condidate age is: " +age);
			if (weight > 50) {
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("You are not eligible to donate blood");
			}
		} else {
			System.out.println("Age must be greater than 18");
		}
		//or
		
		/*int age1 = 19;
		int weight1 = 45;
		// applying condition on age and weight
		if (age1 >= 18) {
			System.out.println("Condidate age is: " +age1);
			if (weight1 > 50) {
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("You are not eligible to donate blood");
			}
		} else {
			System.out.println("Age must be greater than 18");
		
		*/
	}}

