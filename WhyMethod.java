import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {

	public static void main(String[] args) throws IOException {
		
		//100000     //인자, argument
		System.out.println(twoTimes("a", "_"));
		//1000000
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("a", "*"));
		fw.close();
		//1000000
		//Email.send("lim961007@com", "two times a", twoTimes("a", "&"));
		//10000000

	}
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
		
	}
}
                                    //매개변수,parameter
//	public static void printTwoTimes(String text, String delimiter) {
//		System.out.println(delimiter);
//		System.out.println(text);
//		System.out.println(text);
//	}
//	
//	public static void writeFileTwoTimes(String text, String delimiter) throws IOException {
//		FileWriter fw = new FileWriter("output.txt");
//		System.out.println(delimiter+"\n");
//		System.out.println(text+"\n");
//		System.out.println(text+"\n");
//	}



