
public class LoopArray {

	public static void main(String[] args) {
		
		String[] users = new String[4];
		users[0] = "DK";
		users[1] = "YH";
		users[2] = "JY";
		users[3] = "GH";
		
		/*
		 * <li>DK</li>
		 * <li>YH</li>
		 * <li>JY</li>
		 * <li>GH</li>
		 * 
		 */
		
		for(int i=0; i<users.length; i++) {
			System.out.println(users[i]+",");
		}

	}

}
