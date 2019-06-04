
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
	public static void main(String args[]) {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("jk.txt");
			fout.write(65);
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				fout.close();
			} catch (IOException io) {
				System.err.println("Io exception raised");
			}

		}
	}
}
