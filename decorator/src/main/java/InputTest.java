import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputTest {
	public static void main(String args[]) throws Exception {
		InputStream inputStream = new FileInputStream("");
		inputStream = new BufferedInputStream(inputStream);
		inputStream = new LowerCaseInputStream(inputStream);
		while (inputStream.read() >= 0) {
			System.out.println((char) inputStream.read());
		}
	}
}
