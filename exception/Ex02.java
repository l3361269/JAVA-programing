package Exception;
import java.io.*;
public class Ex02 {

	public static void main(String[] args) {
		File F=new File("abc.txt");
		try {
			F.createNewFile();
		}
		catch(IOException e) {
			
		}

	}

}
