
public class AuthApp3 {

	public static void main(String[] args) {
		
//		String[] users = {"DK", "YH", "JY", "GH"};
		String[][] users = {
				{"DK", "1111"},
				{"YH", "2222"},
				{"JY", "3333"},
				{"GH", "4444"}
		};
		String inputID = args[0];
		String inputPass = args[1];
		
		boolean isLogined = false;
		for(int i=0; i<users.length; i++) {
			String[] current = users[i];
			if(
					current[0].equals(inputID) &&
					current[1].equals(inputPass)
			) {
				isLogined = true;
				break;
			}
		}
		System.out.println("Hi!");
		if(isLogined) {
			System.out.println("Hi Master!");
		} else {
			System.out.println("Who are you?");
		}
	
	}
}