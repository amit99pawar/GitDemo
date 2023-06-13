package PracticePrograms;

public class checkGivenStringInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "AAAAA", "BBBBB", "CCCCC" };

		for (String value : names) { 			// Advance for loop
				
			if (value == "BBBBB") {

				System.out.println("Given input string : "+value+ " is present in array");
				break;
			}
		}
	}

}
