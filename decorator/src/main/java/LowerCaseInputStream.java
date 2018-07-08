import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends InputStream {
	private InputStream inputStream;

	public LowerCaseInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public int read() throws IOException {
		int read = inputStream.read();
		return (read == -1 ? read : Character.toLowerCase((char) read));
	}
}
