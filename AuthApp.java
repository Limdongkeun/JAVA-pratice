
public class AuthApp {

	public static void main(String[] args) {
		
		String id = "DK";
		String inputID = args[0];
		
		String pass = "1111";
		String inputPass = args[1]; 
		
		
		System.out.println("Hi.");
		
		//if(inputID == id) {
//		if(inputID.equals(id)) {
//			if(inputPass.equals(pass)) {
//			System.out.println("Master!");
//			} else {
//				System.out.println("Worng password!");
//			}
//		} else {
//			System.out.println("Who are you?");
//		}
	
		if(inputID.equals(id) && inputPass.equals(pass)) {
			System.out.println("Hi Master!");
			} else {
				System.out.println("Who are you?");
			}
	}

}
