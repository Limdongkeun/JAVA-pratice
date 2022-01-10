
public class ArrayApp {

	public static void main(String[] args) {
		
		// DK, YH, JY, GH
		//String users = "DK, YH, JY, GH";
		
		String[] users = new String[4];
		users[0] = "DK";
		users[1] = "YH";
		users[2] = "JY";
		users[3] = "GH";
		
		System.out.println(users[1]);
		System.out.println(users.length);
		
		int[] scores = {10, 100, 100, 100}; //원소, element
		System.out.println(scores[1]);
		System.out.println(scores.length);

	}
}
